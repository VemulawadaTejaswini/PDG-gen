import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    static int[][] cumSum;

    public void run() {
        int n = sc.nextInt(), k = sc.nextInt(), k2 = k * 2;
        int[][] w = new int[k2][k2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            if (sc.next().charAt(0) == 'B') {
                y += k;
            }
            w[y % k2][x % k2]++;
        }

        cumSum = new int[k2 + 1][k2 + 1];
        for (int i = 1; i <= k2; i++) {
            for (int j = 1; j <= k2; j++) {
                cumSum[i][j] = cumSum[i - 1][j] + cumSum[i][j - 1] - cumSum[i - 1][j - 1] + w[i - 1][j - 1];
            }
        }

        int max = 0;
        for (int i = 0; i < k2; i++) {
            for (int j = 0; j < k2; j++) {
                int y0 = k2, x0 = k2;
                int y1 = Math.min(i + k, k2), x1 = Math.min(j + k, k2);
                int y2 = i, x2 = j;
                int y3 = Math.max(i - k, 0), x3 = Math.max(j - k, 0);
                int y4 = 0, x4 = 0;

                int sum = sum(y1, y0, x1, x0)
                          + sum(y1, y0, x3, x2)
                          + sum(y2, y1, x2, x1)
                          + sum(y2, y1, x4, x3)
                          + sum(y3, y2, x3, x2)
                          + sum(y3, y2, x1, x0)
                          + sum(y4, y3, x4, x3)
                          + sum(y4, y3, x2, x1);
                max = Math.max(sum, max);
            }
        }
        System.out.println(max);
    }

    private int sum(int ya, int yb, int xa, int xb) {
        return cumSum[ya][xa] + cumSum[yb][xb] - cumSum[yb][xa] - cumSum[ya][xb];
    }
}
