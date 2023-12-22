import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int t = 0; t < n; ++t) {
            int[] num = new int[9];
            int[][] color = new int[3][9];
            boolean ans = true;

            for (int i = 0; i < 9; ++i) {
                num[i] = scanner.nextInt() - 1;
            }
            for (int i = 0; i < 9; ++i) {
                String c = scanner.next();

                int idx;
                if (c.equals("R")) idx = 0;
                else if (c.equals("G")) idx = 1;
                else idx = 2;
                ++color[idx][num[i]];
            }

            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 9; ++j) {
                    if (color[i][j] < 0) {
                        ans = false;
                    } else if (color[i][j] >= 3) {
                        color[i][j] -= 3;
                    }
                    if (color[i][j] > 0) {
                        if (j >= 7) ans = false;
                        else {
                            color[i][j + 1] -= color[i][j];
                            color[i][j + 2] -= color[i][j];
                            color[i][j] = 0;
                        }
                    }
                }
            }
            System.out.println((ans ? 1 : 0));
        }
    }
}
