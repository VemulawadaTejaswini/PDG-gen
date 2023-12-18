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
        int Q = scan.nextInt();
        int[] candidates = new int[N];
        for (int i = 0; i < Q; i++) {
            int winner = scan.nextInt() - 1;
            candidates[winner] += 1;
        }
        for (int i = 0; i < N; i++) {
            if (0 < K - Q + candidates[i]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
