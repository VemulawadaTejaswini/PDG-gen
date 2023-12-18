import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n - 1][3];
        for (int i = 0; i < n - 1; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
            array[i][2] = sc.nextInt();
        }
        int[] answers = new int[n + 1];
        Arrays.fill(answers, 2);
        for (int i = 0; i < n - 1; i++) {
            int pointA = array[i][0];
            int pointB = array[i][1];
            if (answers[pointA] == 2 && answers[pointB] == 2) {
                if (array[i][2] % 2 == 0) {
                    answers[pointA] = 0;
                    answers[pointB] = 0;
                } else {
                    answers[pointA] = 1;
                    answers[pointB] = 0;
                }
            } else if (answers[pointA] == 0) {
                if (array[i][2] % 2 == 0) {
                    answers[pointB] = 0;
                } else {
                    answers[pointB] = 1;
                }
            } else if (answers[pointA] == 1) {
                if (array[i][2] % 2 == 0) {
                    answers[pointB] = 1;
                } else {
                    answers[pointB] = 0;
                }
            } else if (answers[pointB] == 0) {
                if (array[i][2] % 2 == 0) {
                    answers[pointA] = 0;
                } else {
                    answers[pointA] = 1;
                }
            } else if (answers[pointB] == 1) {
                if (array[i][2] % 2 == 0) {
                    answers[pointA] = 1;
                } else {
                    answers[pointA] = 0;
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(answers[i]);
        }
    }
}