import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();
        String S = scan.next();
        String T = scan.next();
        solve(N, M, K, S, T);
    }
    public static void solve(int N, int M, int K, String S, String T) {
        BigInteger x = new BigInteger(S, 2);
        BigInteger y = new BigInteger(T, 2);
        for (int i = 0; i < K; i++) {
            BigInteger and = x.and(y);
            if (BigInteger.ZERO.equals(and)) {
                break;
            }
            x = x.add(and);
            y = y.add(and);
        }
        System.out.println(x.toString(2));
        System.out.println(y.toString(2));
    }
}
