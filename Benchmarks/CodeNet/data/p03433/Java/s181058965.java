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
        int N = scan.nextInt();
        int A = scan.nextInt();
        int x = 0;
        if (A != 0) {
            x = N / A;
        }
        int remain = N - 500 * x;
        if (remain <= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
