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
        BigInteger and = null;
        int i = 0;
        int length_x = 0;
        int length_y = 0;
        BigInteger x_remain = null;
        BigInteger y_remain = null;
        for (; i < K; i++) {
            and = x.and(y);
            if (BigInteger.ZERO.equals(and)) {
                break;
            }
            x = x.add(and);
            y = y.add(and);
            length_x = x.toString(2).length();
            length_y = y.toString(2).length();
            if (length_x == length_y) {
                x_remain = x.subtract(new BigInteger("2").pow(length_x-1));
                y_remain = y.subtract(new BigInteger("2").pow(length_y-1));
                if (BigInteger.ZERO.equals(x_remain) || BigInteger.ZERO.equals(y_remain)) {
                    i += 1;
                    break;
                }
            }
        }
        if (!BigInteger.ZERO.equals(and) && length_x == length_y
                && (BigInteger.ZERO.equals(x_remain) || BigInteger.ZERO.equals(y_remain)) && i < K) {
            x = new BigInteger("2").pow(length_x).shiftLeft(K - i - 1).add(x_remain);
            y = new BigInteger("2").pow(length_y).shiftLeft(K - i - 1).add(y_remain);
        }
        System.out.println(x.toString(2));
        System.out.println(y.toString(2));
    }
}
