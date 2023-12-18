import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        long W = nl();
        long H = nl();
        long x = nl();
        long y = nl();
        so.print((double) (W * H) / 2);
        so.print(" ");
        so.println(x*2 == W && y*2 == H ? 1 : 0); 
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

    private static long[] nlongs(int n) {
        return nlongs(n, 0);
    }

    private static long[] nlongs(int n, int padding) {
        long[] a = new long[padding + n];
        for (int i = 0; i < n; i++)
            a[padding + i] = ni();
        return a;
    }
}
