import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] g = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                int t = 0;
                t = a;
                a = b;
                b = a;
            }
            g[b] = Math.max(g[b], a);
        }
        int ans = 0;
        int h = 1;
        for (int i = 1; i <= N; i++) {
            if (g[i] >= h) {
                ans++;
                h = i;
            }
        }
        System.out.println(ans);
    }
}