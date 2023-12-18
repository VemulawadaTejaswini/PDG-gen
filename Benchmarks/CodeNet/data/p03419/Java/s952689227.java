import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();

//            int[][] co = new int[21][21];
//            for (int n = 1; n < 20; n++) {
//                for (int m = 1; m < 20; m++) {
//
//                    boolean[][] isFront = new boolean[n][m];
//                    for (int r = 0; r < n; r++) {
//                        Arrays.fill(isFront[r], true);
//                    }
//
//                    for (int r = 0; r < n; r++) {
//                        for (int c = 0; c < m; c++) {
//
//                            for (int dr = -1; dr <= 1; dr++) {
//                                for (int dc = -1; dc <= 1; dc++) {
//                                    int nr = r + dr;
//                                    int nc = c + dc;
//                                    if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
//                                        continue;
//                                    }
//                                    isFront[nr][nc] = !isFront[nr][nc];
//                                }
//                            }
//
//                        }
//                    }
//
//                    int count = 0;
//                    for (int r = 0; r < n; r++) {
//                        for (int c = 0; c < m; c++) {
//                            if (!isFront[r][c]) {
//                                count++;
//                            }
//                        }
//                    }
//
//                    co[n][m] = count;
//
//                }
//                Utils.debug(n, co[n]);
//            }

            if (Math.min(N, M) <= 2) {
                if (N == 1 && M == 1) {
                    System.out.println(1);
                } else if (N == 2 || M == 2) {
                    System.out.println(0);
                } else {
                    System.out.println(Math.max(N, M) - 2);
                }
            } else {
                System.out.println((N - 2) * (M - 2));
            }
        }
    }
}
