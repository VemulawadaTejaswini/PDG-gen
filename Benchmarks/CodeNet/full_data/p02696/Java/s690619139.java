import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int max = 0;
        for (int i = 1; i <= n; i++) {
            int x = (int) (Math.floor(a * i / b) - a * Math.floor(i / b));
            max = Math.max(max, x);
        }
        System.out.println(max);
    }
}
