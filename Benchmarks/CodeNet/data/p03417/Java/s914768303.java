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
        long M = scan.nextLong();
        if (N == 1 && M == 1) {
            System.out.println(1);
            return;
        }
        if (N == 2 || M == 2) {
            System.out.println(0);
            return;
        }
        if (M < N) {
            long t = N;
            N = M;
            M = t;
        }
        if (N == 1) {
            System.out.println(M-2);
            return;
        }
        System.out.println((M-2) * (N-2));
    }
}
