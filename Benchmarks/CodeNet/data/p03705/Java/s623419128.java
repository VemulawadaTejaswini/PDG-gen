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
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();
        if (B < A) {
            System.out.println(0);
            return;
        }
        if (N == 1) {
            if (A == B) {
                System.out.println(1);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }
        long min = A + B + (N - 2) * A;
        long max = A + B + (N - 2) * B;
        System.out.println(max - min + 1);
    }
}
