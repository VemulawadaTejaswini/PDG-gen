import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }

        Arrays.sort(d);
        int lastAbcIndex = (N - 1)/2;
        int firstArcIndex = (N + 1)/2;
        int lastAbc = d[lastAbcIndex];
        int firstArc = d[firstArcIndex];

        int ans;
        if (lastAbc == firstArc) {
            ans = 0;
        }
        else {
            ans = firstArc - lastAbc;
        }
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

