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
        StringBuilder s = new StringBuilder(scan.next());
        StringBuilder t = new StringBuilder(scan.next());
        for (int i = 0; i < N; i++) {
            if (s.substring(i).equals(t.substring(0, N-i))) {
                System.out.println(2 * N - (N - i));
                return;
            }
        }
        System.out.println(2 * N);
    }
}
