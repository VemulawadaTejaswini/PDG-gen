import java.math.BigInteger;
import java.util.*;


public class Main{

    static double PI = Math.acos(-1);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger sum = BigInteger.ONE;
        BigInteger out = new BigInteger("1000000000000000000");
        long a[] = new long[n];
        boolean ok = true;
        for (int i = 0;i < n;i ++) {
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a);
        for (int i = 0;i < n;i ++) {
            sum = sum.multiply(new BigInteger(a[i]+""));
            if (sum.compareTo(out) > 0) {
                ok = false;
                break;
            }
        }
        if (ok) println(sum);
        else println("-1");


    }

    static void print(Object a){System.out.print(a);}
    static void println(Object a){System.out.println(a);}
}