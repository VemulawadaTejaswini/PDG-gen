import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long Q = scan.nextLong() * 4;
        long H = scan.nextLong() * 2;
        long S = scan.nextLong();
        long D = scan.nextLong();
        long N = scan.nextLong();
        long answer = N * S;
        answer = Math.min(answer, N * H);
        answer = Math.min(answer, N * Q);
        long x = N / 2 * D;
        if (N % 2 == 1) {
            x += Math.min(Q, Math.min(H, S));
        }
        answer = Math.min(answer, x);
        System.out.println(answer);
    }
}
