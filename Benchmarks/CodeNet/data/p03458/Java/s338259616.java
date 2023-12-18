import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] xs = new int[n];
        int[] ys = new int[n];
        boolean[] cs = new boolean[n];

        int max_x = 0;
        int max_y = 0;
        for (int i = 0; i < n; i++) {
            xs[i] = scanner.nextInt();
            if (xs[i] > max_x) {
                max_x = xs[i];
            }
            ys[i] = scanner.nextInt();
            if (ys[i] > max_y) {
                max_y = ys[i];
            }

            cs[i] = scanner.next().equals("B"); // black -> true, white -> false
        }

//        boolean[][] BWFlags = new boolean[max_x + k * 2][max_y + k];
        boolean[] x_flag = new boolean[max_x + k * 2];
        boolean[] y_flag = new boolean[max_x + k];
        for (int i_y = 0; i_y < max_y + k; i_y++) {
            for (int i_x = 0; i_x < max_x + k * 2; i_x++) {
                if ((i_y / k) % 2 == 0) {
                    if ((i_x / k) % 2 == 1) {
                        x_flag[i_x] = true;
                        y_flag[i_y] = true;
//                        BWFlags[i_x][i_y] = true;
                    }
                } else {
                    if ((i_x / k) % 2 == 0) {
                        x_flag[i_x] = true;
                        y_flag[i_y] = true;
//                        BWFlags[i_x][i_y] = true;
                    }
                }
            }
        }

        int max_able = 0;
        for (int k_x = 0; k_x < k * 2; k_x++) {
            for (int k_y = 0; k_y < k; k_y++) {

                int sum_able = 0;
                for (int i_n = 0; i_n < n; i_n++) {
                    int x = xs[i_n];
                    int y = ys[i_n];
                    boolean c = cs[i_n];

                    if (x_flag[x + k_x] && y_flag[y + k_y]) {
                        sum_able++;
                    }
//                    if (BWFlags[x + k_x][y + k_y] == c) {
//                        sum_able++;
//                    }
                }
                if (sum_able > max_able) {
                    max_able = sum_able;
                }
            }
        }

        System.out.print(max_able);
    }
}
