import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        BigInteger before = BigInteger.ZERO;
        BigInteger[] aa = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            a[i] = temp;
            aa[i] = new BigInteger(String.valueOf(before.add(new BigInteger(String.valueOf(temp)))));
            before = aa[i];
        }
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i != 0) {
                    BigInteger num = aa[j].subtract(aa[j - 1]).add(aa[i].subtract(aa[i - 1]));
                    if (num.equals(new BigInteger(String.valueOf(j - i)))) {
                        ans++;
                    }
                } else {
                    BigInteger num = aa[j].subtract(aa[j - 1]).add(aa[i]);
                    if (num.equals(new BigInteger(String.valueOf(j - i)))) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}