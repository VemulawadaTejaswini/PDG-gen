import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] w = new int[2 * k][2 * k];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            char c = sc.next().charAt(0);
            if (c == 'W') {
                w[x % (2 * k)][y % (2 * k)]++;
            } else {
                w[(x + k) % (2 * k)][y % (2 * k)]++;
            }
        }
        sc.close();

        // 累積和
        int[][] s = new int[2 * k + 1][2 * k + 1];
        for (int i = 1; i <= 2 * k; i++) {
            for (int j = 1; j <= 2 * k; j++) {
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + w[i][j];
            }
        }

        // 塗り方を全通り試す
        int max = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                int m = sum(s, k, i, j);
                max = Math.max(Math.max(max, m), n - m);
            }
        }
        System.out.println(max);
    }

    // 矩形領域 
    // x \in [x1, x2), y \in [y1, y2) 
    // でのw[x][y]の和
    public static int rectSum(int[][] s, int x1, int y1, int x2, int y2) {
        return s[x2][y2] - s[x1][y2] - s[x2][y1] + s[x1][y1];
    }

    // 矩形領域 
    // D1: x \in [0, i),         y \in [0, j)
    // D2: x \in [i, i + k),     y \in [j, j + k)
    // D3: x \in [0, i),         y \in [j + k, 2 * k)
    // D4: x \in [i + k, 2 * k), y \in [0, j)
    // D5: x \in [i + k, 2 * k), y \in [j + k, 2 * k)
    // のそれぞれでのw[x][y]の和を足し合わせる
    public static int sum(int[][] s, int k, int i, int j) {
        int sum = 0;
        sum += rectSum(s, 0, 0, i, j);
        sum += rectSum(s, i, j, i + k, j + k);
        sum += rectSum(s, 0, j + k, i, 2 * k);
        sum += rectSum(s, i + k, 0, 2 * k, j);
        sum += rectSum(s, i + k, j + k, 2 * k, 2 * k);
        return sum;
    }
}
