import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        String s = ns();
        int first = Integer.parseInt(s.substring(0, 2));
        int second = Integer.parseInt(s.substring(2, 4));
        
        if (isMonth(first) && isMonth(second)) {
            so.println("AMBIGUOUS");
        } else if (isMonth(first)) {
            so.println("MMYY");
        } else if (isMonth(second)) {
            so.println("YYMM");
        } else {
            so.println("NA");
        }
    }
    
    private static boolean isMonth(int i) {
        return 1 <= i && i <= 12;
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
