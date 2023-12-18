
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int c = scanner.nextInt();

        final int[][] colorTable = new int[c][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                colorTable[i][j] = scanner.nextInt();
            }
        }

        final int[][] modColorTable = new int[c][3];
        for (int i = 0; i < c; i++) {
            modColorTable[i][0] = colorTable[i][0];
            modColorTable[i][1] = colorTable[i][1];
            modColorTable[i][2] = colorTable[i][2];
            for (int j = 3; j < c; j++) {
                modColorTable[i][j % 3] = Math.min(modColorTable[i][j % 3], colorTable[i][j]);
            }
        }

        final int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = scanner.nextInt() - 1;
            }
        }

        int answer = calc(table, modColorTable, 0, 1, 2);
        answer = Math.min(answer, calc(table, modColorTable, 0, 2, 1));
        answer = Math.min(answer, calc(table, modColorTable, 1, 2, 0));
        answer = Math.min(answer, calc(table, modColorTable, 1, 0, 2));
        answer = Math.min(answer, calc(table, modColorTable, 2, 1, 0));
        answer = Math.min(answer, calc(table, modColorTable, 2, 0, 1));

        System.out.println(answer);
    }

    private static int calc(final int[][] table, final int[][] modColorTable, final int first, final int second, final int third) {
        int answer = 0;
        for (int i = 0; i < table.length * 2 - 1; i++) {
            final int tmp;
            switch (i % 3) {
                case 0:
                    tmp = first;
                    break;
                case 1:
                    tmp = second;
                    break;
                case 2:
                    tmp = third;
                    break;
                default:
                    throw new RuntimeException();
            }

            for (int j = i; i - j >= 0 && j >= 0; j--) {
                if (j >= table.length || i - j >= table.length) {
                    continue;
                }

                if (table[j][i - j] % 3 == tmp) {
                    continue;
                }

                answer += modColorTable[table[j][i - j]][tmp];
            }
        }

        return answer;
    }
}
