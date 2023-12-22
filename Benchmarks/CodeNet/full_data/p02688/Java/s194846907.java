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
        int K = scan.nextInt();
        int[] s = new int[N];
        for (int i = 0; i < K; i++) {
            int d = scan.nextInt();
            for (int j = 0; j < d; j++) {
                int x = scan.nextInt()-1;
                s[x] += 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (s[i] == 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
