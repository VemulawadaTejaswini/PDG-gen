import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var n = sc.nextInt();
        BigInteger ans = BigInteger.valueOf(1);
        var limit = BigInteger.valueOf(10).pow(18);
        for (int i = 0; i < n; i++) {
            var a = sc.nextBigInteger();
            var mlt = ans.multiply(a);
            if(mlt.compareTo(limit) > 0) {
                ans = BigInteger.valueOf(-1);
                break;
            }
            ans = mlt;
        }

        System.out.println(ans);
        sc.close();
    }
}