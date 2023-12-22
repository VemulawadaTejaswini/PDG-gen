
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        BigInteger bi = new BigInteger("1");
        long ans = 1l;
        for (int i = 0 ; i < n ; i++) {

            bi = bi.multiply(new BigInteger(String.valueOf(a[i])));
            if (bi.compareTo(new BigInteger("1000000000000000000")) > 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(bi.longValue());
    }

}