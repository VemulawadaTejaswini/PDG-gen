import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        String k = scan.next();
        System.out.println(solve(a,b,c,k));
    }
    public static String solve(String a, String b, String c, String k) {
        BigInteger big_a = new BigInteger(a);
        BigInteger big_b = new BigInteger(b);
        BigInteger big_c = new BigInteger(c);
        BigInteger big_k = new BigInteger(k);
        BigInteger answer = big_a.subtract(big_b);
        if (big_k.mod(new BigInteger("2")) != BigInteger.ZERO) {
            answer = answer.multiply(new BigInteger("-1"));
        }
        if (new BigInteger("1000000000000000000").compareTo(answer) < 0) {
            return "Unfair";
        } else {
            return answer.toString(10);
        }
    }
}
