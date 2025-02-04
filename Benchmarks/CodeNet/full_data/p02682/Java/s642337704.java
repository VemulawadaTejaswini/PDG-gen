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
        int C = scan.nextInt();
        int K = scan.nextInt();
        if (K <= A) {
            System.out.println(K);
            return;
        }
        if (K <= A + B) {
            System.out.println(A);
            return;
        }
        int diff = K - A - B;
        System.out.println(A - diff);
    }
}
