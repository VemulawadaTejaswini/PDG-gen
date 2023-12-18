import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        int n = ni();
        int k = ni();
        
        double ans_n = 0;
        for (int i = 1; i <= n; i++) {
            if (i >= k) {
                ans_n += 1;
            } else {
                double p = Math.ceil(Math.log((k+i-1)/i) / Math.log(2));
                ans_n += Math.pow(0.5, p);
            }
        }
        
        so.println(ans_n / n);
    }
   
    private static int ni() {
        return sc.nextInt();
    }

    private static long nl() {
        return sc.nextLong();
    }

    private static String ns() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static int[] nints(int n) {
        return nints(n, 0);
    }

    private static int[] nints(int n, int padding) {
        int[] a = new int[padding + n];
        for (int i = 0; i < n; i++)
            a[padding + i] = ni();
        return a;
    }
}
