import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long X = scan.nextLong();
        // B = 0 A^5 = X
        if (sub(0, X)) {
            return;
        }
        // B = 1 A^5 = X + 1
        if (sub(1, X+1)) {
            return;
        }
        // B = -1 A^5 = X - 1
        if (sub(-1, X-1)) {
            return;
        }
    }
    private boolean sub(long B, long X) {
        for (int i = 0;  i <= X; i++) {
            long t = pow(i, 5);
            if (t == X) {
                System.out.printf("%d %d\n", i, B);
                return true;
            }
            if (X < t) {
                return false;
            }
        }
        return false;
    }
    private long pow(int base, int c) {
        if (c == 0) {
            return 1;
        }
        if (c % 2 == 1) {
            return base * pow(base, c - 1);
        }
        long x = pow(base, c / 2);
        return x * x;
    }
}
