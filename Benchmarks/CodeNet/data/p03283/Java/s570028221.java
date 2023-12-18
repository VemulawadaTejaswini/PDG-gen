import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int Q = scan.nextInt();
        int[][] map = new int[N][N];
        for (int i = 0; i < M; i++) {
            int L = scan.nextInt() - 1;
            int R = scan.nextInt() - 1;
            map[L][R] += 1;
        }
        int[][] sum = new int[N][N+1];
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N; j++) {
                sum[i][j] = sum[i][j-1]+map[i][j-1];
            }
        }
        for (int i = 0; i < Q; i++) {
            int p = scan.nextInt()-1;
            int q = scan.nextInt()-1;
            int ans = 0;
            for (int j = p; j <= q; j++) {
                ans += sum[j][q+1]-sum[j][p];
            }
            System.out.println(ans);
        }
    }
    private int findL(int[] x, int key) {
        int l = 0;
        int r = x.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (key <= x[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private int findR(int[] x, int key) {
        int l = 0;
        int r = x.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (x[mid] <= key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
}
