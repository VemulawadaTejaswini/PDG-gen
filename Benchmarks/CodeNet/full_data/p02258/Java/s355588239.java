import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int n = sc.nextInt();
        int[] R = new int[n];

        for (int i = 0; i < n; i++) {
            R[i] = sc.nextInt();
        }

        int ans = Integer.MIN_VALUE;
        int min = R[0];
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, R[i] - min);
            min = Math.min(min, R[i]);
        }

        System.out.println(ans);
    }
}