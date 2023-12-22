import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = 20;

        int[][] edo = new int[w+1][w+1];

        while (true) {
            for (int y = 0; y <= w; ++y) {
                for (int x = 0; x <= w; ++x) {
                    edo[y][x] = 0;
                }
            }

            int n = sc.nextInt();
            if (n == 0) break;

            for (int i = 0; i < n; ++i) {
                int x, y;
                x = sc.nextInt();
                y = sc.nextInt();
                edo[y][x]++;
            }

            int m = sc.nextInt();

            int px = 10, py = 10, cnt = 0;
            for (int i = 0; i < m; ++i) {
                String v = sc.next();
                int d = sc.nextInt();
                int ny = py+d, sy = py-d, ex = px+d, wx = px-d;
                if (v.equals("N")) {
                    for (int y = py; y <= ny; ++y) {
                        if (edo[y][px] > 0) {
                            cnt += edo[y][px];
                            edo[y][px] = 0;
                        }
                    }
                    py += d;
                }
                else if (v.equals("S")) {
                    for (int y = py; y >= sy; --y) {
                        if (edo[y][px] > 0) {
                            cnt += edo[y][px];
                            edo[y][px] = 0;
                        }
                    }
                    py -= d;
                }
                else if (v.equals("E")) {
                    for (int x = px; x <= ex; ++x) {
                        if (edo[py][x] > 0) {
                            cnt += edo[py][x];
                            edo[py][x] = 0;
                        }
                    }
                    px += d;
                }
                else if (v.equals("W")) {
                    for (int x = px; x >= wx; --x) {
                        if (edo[px][x] > 0) {
                            cnt += edo[px][x];
                            edo[px][x] = 0;
                        }
                    }
                    px -= d;
                }
            }
            if (cnt == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}