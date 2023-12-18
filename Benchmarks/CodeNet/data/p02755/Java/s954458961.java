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
        int A = scan.nextInt();
        int B = scan.nextInt();
        for (int i = 0; i <= 20000; i++) {
            if (A == (int)Math.floor(i * 0.08) && B == (int)Math.floor(i * 0.1)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
