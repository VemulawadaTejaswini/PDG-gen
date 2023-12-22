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

        int ans = Integer.MIN_VALUE;
        int min = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int tmp = sc.nextInt();
            ans = Math.max(ans, tmp - min);
            min = Math.min(min, tmp);
        }

        System.out.println(ans);
    }
}