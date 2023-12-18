import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] inputs = br.readLine().split(" ");
            int N = Integer.parseInt(inputs[0]);

            int[][] A = new int[N][N - 1];
            for (int i = 0; i < N; i++) {
                inputs = br.readLine().split(" ");
                for (int j = 0; j < N - 1; j++) {
                    A[i][j] = Integer.parseInt(inputs[j]) - 1;
                }
            }

            int day = 0;

            int[] index = new int[N];
            while (true) {
                boolean[] play = new boolean[N];
                boolean x = false;

                for (int i = 0; i < N - 1; i++) {
                    if (index[i] == N - 1) {
                        continue;
                    }

                    if (play[i]) {
                        continue;
                    }

                    int j = A[i][index[i]];
                    if (i == A[j][index[j]]) {
                        play[i] = true;
                        play[j] = true;
                        x = true;
                    }
                }

                if (!x) {
                    day = -1;
                    break;
                }

                day++;
                for (int i = 0; i < N; i++) {
                    if (play[i]) {
                        index[i]++;
                    }
                }

                boolean exit = true;
                for (int i = 0; i < N; i++) {
                    if (index[i] < N - 1) {
                        exit = false;
                        break;
                    }
                }

                if (exit) {
                    break;
                }
            }

            System.out.println(day);
        }
    }

}