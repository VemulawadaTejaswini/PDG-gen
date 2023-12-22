
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        new Main().run();
    }
 
    private void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n = scanner.nextInt();
            if (n == 0)
                break;
            d = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    d[i][j] = scanner.nextInt();
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    d[i][j] = Math.max(d[i][j], d[j][i]);
                }
            ans = INF;
            pos = new int[n];
            dfs(0, 0);
            System.out.println(ans);
        }
    }
 
    private void dfs(int right, int bit) {
        if (ans <= right)
            return;
 
        if (Integer.bitCount(bit) == n) {
            ans = right;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (((bit >> i) & 1) == 1)
                continue;
            int nbit = bit | 1 << i;
            for (int j = 0; j < n; j++) {
                if (((bit >> j) & 1) == 0)
                    continue;
                pos[i] = Math.max(pos[i], pos[j] + d[j][i]);
            }
            dfs(pos[i], nbit);
            pos[i] = 0;
        }
    }
 
    int n, ans;
    int[] pos;
    int[][] d;
    int INF = 1 << 30;
}