import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        double a = in.nextDouble();
        double b = in.nextDouble();
        int n = in.nextInt();

        double max = 0;
        for (int i = 1; i <= n; i++) {
            double x = (Math.floor(a * i / b) - a * Math.floor(i / b));
            max = Math.max(max, x);
        }
        System.out.println((int)max);
    }
}
