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
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        if (c - a - b <= 0) {
            System.out.println("No");
            return;
        }
        double x = 2 * Math.sqrt(a * b);
        if (x < c - a - b) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
