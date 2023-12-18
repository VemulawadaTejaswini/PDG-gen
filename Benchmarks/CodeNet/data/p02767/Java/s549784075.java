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
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = scan.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= 100; i++) {
            int cost = 0;
            for (int j = 0; j < N; j++) {
                cost += (X[j]-i) * (X[j]-i);
            }
            ans = Math.min(ans, cost);
        }
        System.out.println(ans);
    }
}
