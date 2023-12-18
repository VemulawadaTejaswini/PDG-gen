package Contest.D;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    static int[][] black;
    static int[][] white;
    static int[][] score;
    static int k;
    static int n;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();
        int K = 2 * k;
        black = new int[K][K];
        white = new int[K][K];
        score = new int[K][K];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            String c = scan.next();
            if (c.equals("B")) {
                black[x % K][y % K]++;
            } else {
                white[x % K][y % K]++;
            }
        }

        int max = 0;
        for (int i = 0; i < 2 *k; i++) {
            for (int j = 0; j <  2 * k; j++) {
                if ((i < k && j < k) || (i >= k && j >= k)) {
                    score[0][0] += black[i][j];
                }
                else {
                    score[0][0] -= white[i][j];
                }

            }
        }
        score[0][0] = Math.abs(score[0][0]);
        for (int i = 1; i < K; i++) {
            max = Math.max(max, cal(i));
        }
        for (int i = 1; i < k + 1; i++) {
            max = Math.max(max, calS(i));
            for (int j = 1; j < K; j++) {
                max = Math.max(max, cal(i, j));
            }
        }
        System.out.println(max);
    }

    static int cal(int xDif) {
        int x = xDif - 1;
        x %= k;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += white[x][i];
            sum -= black[x][i];
        }
        for (int i = k; i < 2 * k; i++) {
            sum -= white[x][i];
            sum += black[x][i];
        }
        x += k;
        for (int i = 0; i < k; i++) {
            sum -= white[x][i];
            sum += black[x][i];
        }
        for (int i = k; i < 2 * k; i++) {
            sum += white[x][i];
            sum -= black[x][i];
        }
        score[xDif][0] = score[xDif - 1][0] + (xDif <= k ? sum : -sum);
        return score[xDif][0];
    }

    static int cal(int xDif, int yDif) {
        int x = xDif - 1;
        x %= k;
        int sum = 0;
        int first = yDif % k;
        int second = first + k;
        for (int i = 0; i < first; i++) {
            if (yDif > k) {
                sum += white[x][i];
                sum -= black[x][i];
            } else {
                sum -= white[x][i];
                sum += black[x][i];
            }
        }

        for (int i = first; i < second; i++) {
            if (yDif > k) {
                sum -= white[x][i];
                sum += black[x][i];
            } else {
                sum += white[x][i];
                sum -= black[x][i];
            }
        }
        for (int i = second; i < 2 * k; i++) {
            if (yDif > k) {
                sum += white[x][i];
                sum -= black[x][i];
            } else {
                sum -= white[x][i];
                sum += black[x][i];
            }
        }
        score[xDif][yDif] = score[xDif - 1][yDif] + (xDif <= k ? -sum : sum);
        return score[xDif][yDif];
    }

    static int calS(int yDif) {
        int y = yDif - 1;
        y %= k;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += white[i][y];
            sum -= black[i][y];
        }
        for (int i = k; i < 2 * k; i++) {
            sum -= white[i][y];
            sum += black[i][y];
        }
        y += k;
        for (int i = 0; i < k; i++) {
            sum -= white[i][y];
            sum += black[i][y];
        }
        for (int i = k; i < 2 * k; i++) {
            sum += white[i][y];
            sum -= black[i][y];
        }
        score[0][yDif] = score[0][yDif - 1] + (yDif <= k ? -sum : sum);
        return score[0][yDif];
    }
}
