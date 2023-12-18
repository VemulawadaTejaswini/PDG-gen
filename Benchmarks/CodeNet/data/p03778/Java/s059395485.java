import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a - (b + W) <= 0 && a > b) || (b - (a + W) <= 0 && a < b) || a == b) {
            System.out.println("0");
            return;
        }
        if (a < b) {
            System.out.println(b - (a + W));
        } else {
            System.out.println(a - (b + W));
        }
    }
}