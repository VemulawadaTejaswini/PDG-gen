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
        for (int A = 0; A <= 1000; A++) {
            for (int B = 0; B <= 1000; B++) {
                if (A*A*A*A*A - B*B*B*B*B == X) {
                    System.out.printf("%d %d\n", A, B);
                    return;
                }
                if (A*A*A*A*A + B*B*B*B*B == X) {
                    System.out.printf("%d %d\n", A, -B);
                    return;
                }
            }
        }
    }
}
