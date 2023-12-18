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
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        long lcm = A[0];
        for (int i = 0; i < N; i++) {
            lcm = lcm(lcm, A[i]);
        }
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer += lcm / A[i];
            answer %= 1000000007;
        }
        System.out.println(answer);
    }
    public long gcd(long x, long y) {
        if (x > y) {
            long t = x;
            x = y;
            y = t;
        }
        while (x % y != 0) {
            long t = y;
            y = x % y;
            x = t;
        }
        return y;
    }
    public long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }
}
