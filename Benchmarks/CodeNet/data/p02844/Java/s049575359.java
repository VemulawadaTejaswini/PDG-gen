import java.util.Scanner;

/**
 * Lucky PIN
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            char[] S = sc.next().toCharArray();

            int[] C = new int[N];
            for (int i = 0; i < N; i++) {
                C[i] = S[i] - '0';
            }

            boolean[] d1 = new boolean[10];
            boolean[][] d2 = new boolean[10][10];
            boolean[][][] d3 = new boolean[10][10][10];

            for (int i = 2; i < N; i++) {
                d1[C[i - 2]] = true;

                for (int j = 0; j < 10; j++) {
                    if (d1[j]) {
                        d2[j][C[i - 1]] = true;
                    }
                }

                for (int j = 0; j < 10; j++) {
                    if (!d1[j]) {
                        continue;
                    }

                    for (int k = 0; k < 10; k++) {
                        if (!d2[j][k]) {
                            continue;
                        }

                        d3[j][k][C[i]] = true;
                    }
                }
            }

            int ans = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (d3[i][j][k]) {
                            ans++;
                        }
                    }
                }
            }

            System.out.println(ans);
        }
    }

}
