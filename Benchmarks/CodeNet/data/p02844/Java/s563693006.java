import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            char[] S = sc.next().toCharArray();

            int n0 = (int) '0';

            boolean[] c1 = new boolean[10];
            boolean[][] c2 = new boolean[10][10];
            boolean[][][] c3 = new boolean[10][10][10];

            for (int i = 2; i < N; i++) {
                int n1 = S[i - 2] - n0;
                int n2 = S[i - 1] - n0;
                int n3 = S[i] - n0;

                c1[n1] = true;

                for (int j = 0; j < 10; j++) {
                    if (c1[j]) {
                        c2[j][n2] = true;
                    }
                }

                for (int j = 0; j < 10; j++) {
                    if (!c1[j]) {
                        continue;
                    }

                    for (int k = 0; k < 10; k++) {
                        if (!c2[j][k]) {
                            continue;
                        }

                        c3[j][k][n3] = true;
                    }
                }
            }

            int ans = 0;
            for (int l = 0; l < 10; l++) {
                for (int m = 0; m < 10; m++) {
                    for (int r = 0; r < 10; r++) {
                        if (c3[l][m][r]) {
                            ans++;
                        }
                    }
                }
            }

            System.out.println(ans);
        }
    }

}
