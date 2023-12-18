import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    static int MOD = (int)1E9 + 7;
    public static void main(String[] args) {
        int H = ni();
        int W = ni();
        
        int count = 0;
        for (int h = 0; h < H; h++) {
            char[] cs = nsToChars();
            for (int w = 0; w < W; w++) {
                if (cs[w] == '#') count++;
            }
        }
        so.println(count == H+W-1 ? "Possible" : "Impossible");
    }

    private static long nl() {
        return sc.nextLong();
    }

    private static int ni() {
        return sc.nextInt();
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
    private static int[] nints(int n) {
        return nints(n, 0);
    }

    private static long[] nlongs(int n, int offset) {
        long[] a = new long[offset + n];
        for (int i = 0; i < n; i++)
            a[offset + i] = nl();
        return a;
    }

    private static int[] nints(int n, int offset) {
        int[] a = new int[offset + n];
        for (int i = 0; i < n; i++)
            a[offset + i] = ni();
        return a;
    }
}
