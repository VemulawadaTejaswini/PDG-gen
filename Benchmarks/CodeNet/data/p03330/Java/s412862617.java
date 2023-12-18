
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int c = scanner.nextInt();

        final int[][] colorTable = new int[c + 1][c + 1];
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c; j++) {
                colorTable[i][j] = scanner.nextInt();
            }
        }

        final int[][] modTable = new int[3][c + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                final int tmp = scanner.nextInt();
                modTable[(i + j) % 3][tmp]++;
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 1; i <= c; i++) {
            int tmp = 0;
            for (int i2 = 1; i2 <= c; i2++) {
                tmp += modTable[0][i2] * colorTable[i2][i];
            }

            for (int j = 1; j <= c; j++) {
                if (i % 3 == j % 3) {
                    continue;
                }

                int tmp2 = 0;
                for (int j2 = 1; j2 <= c; j2++) {
                    tmp2 += modTable[1][j2] * colorTable[j2][j];
                }

                for (int k = 1; k <= c; k++) {
                    if (i % 3 == k % 3 || j % 3 == k % 3) {
                        continue;
                    }

                    int tmp3 = 0;
                    for (int k2 = 1; k2 <= c; k2++) {
                        tmp3 += modTable[2][k2] * colorTable[k2][k];
                    }

                    answer = Math.min(answer, tmp + tmp2 + tmp3);
                }
            }
        }

        System.out.println(answer);
    }
}
