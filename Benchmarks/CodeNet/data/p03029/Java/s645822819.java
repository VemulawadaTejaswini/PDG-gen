import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        int a = ni();
        int p = ni();
        so.println((a*3+p)/2);
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
