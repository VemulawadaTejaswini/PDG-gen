import java.util.*;

class Main {
//
//    static void print(int[][] a) {
//        System.out.println("============");
//        for (int[] z : a) {
//            System.out.println(Arrays.toString(z));
//        }
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String[] board = new String[n];
        for (int i = 0; i < n; i++) {
            board[i] = scan.next();
        }
        int[][] horizontal = new int[n][m];
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = -1;
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == '#') {
                    for (int k = start; k <= end; k++) {
                        horizontal[i][k] = end - start + 1;
                    }
                    start = j + 1;
                    end = j;
                } else {
                    end = j;
                }
            }
            for (int k = start; k <= end; k++) {
                horizontal[i][k] = end - start + 1;
            }
        }

        int[][] vertical = new int[n][m];
        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = -1;
            for (int j = 0; j < n; j++) {
                if (board[j].charAt(i) == '#') {
                    for (int k = start; k <= end; k++) {
                        vertical[k][i] = end - start + 1;
                    }
                    start = j + 1;
                    end = j;
                } else {
                    end = j;
                }
            }
            for (int k = start; k <= end; k++) {
                vertical[k][i] = end - start + 1;
            }
        }

        int output = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                output = Math.max(output, horizontal[i][j] + vertical[i][j] - 1);
            }
        }
        System.out.println(output);
    }
}