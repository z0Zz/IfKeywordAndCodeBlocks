package com.z0Zz;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateScore(true, 800, 5, 1000));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        }
        else {
            return -1;
        }

    }
}
