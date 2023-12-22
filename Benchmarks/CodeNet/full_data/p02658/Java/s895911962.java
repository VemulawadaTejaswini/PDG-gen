import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        Arrays.sort(A);
        if (A[0] == 0) {
            System.out.println(0);
            return;
        }
        BigInteger ans = BigInteger.ONE;
        BigInteger limit = BigInteger.valueOf(1000000000000000000L);
        for (int i = 0; i < N; i++) {
            ans = ans.multiply(BigInteger.valueOf(A[i]));
            if (ans.compareTo(limit) > 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans.toString());
    }
}
