import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger mod = new BigInteger("1000000007");
        if(n == 1) {
            System.out.println(0);
        } else {
            BigInteger tmp1 = new BigInteger(Integer.toString(n));
            BigInteger tmp2 = new BigInteger(Integer.toString(n - 1));
            BigInteger tmp3 = tmp1.multiply(tmp2);
            BigInteger ans = tmp3.mod(mod);
            System.out.println(ans);
        }
    }
}