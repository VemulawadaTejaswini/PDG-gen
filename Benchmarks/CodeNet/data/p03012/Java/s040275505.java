import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
        }

        int S1 = W[0];
        int S2 = 0;
        for (int i = 1; i < N; i++) {
            S2 += W[i];
        }
        int minDiff = Math.abs(S1 - S2);

        for (int T = 1; T < N - 1; T++) {
            S1 += W[T];
            S2 -= W[T];
            minDiff = Math.min(minDiff, Math.abs(S1 - S2));
        }

        System.out.println(minDiff);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
