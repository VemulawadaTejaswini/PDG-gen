import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        int N = nint();
        String[] s = nstrs(N);
        Map<String, Integer> count = new HashMap<>();
        for (String e: s) {
            String sorted = sort(e);
            if (!count.containsKey(sorted)) {
                count.put(sorted, 1);
            } else {
                count.put(sorted, count.get(sorted) + 1);
            }
        }
        
        
        long ans = 0;
        for (Entry<String, Integer> e: count.entrySet()) {
            int pattern = e.getValue();
            if (pattern == 1) continue;
            ans += combination(pattern, 2);
        }
        so.println(ans);
    }
    
    static long combination(int N, int R) {
        if (R > N) throw new ArithmeticException(String.format("(N, R) = (%d, %d)", N, R));
        int mod = (int) 1E9 + 7;
        long prod1 = LongStream.rangeClosed(N-R+1, N).reduce((i, j) -> (i*j) % mod).getAsLong();
        long prod2 = LongStream.rangeClosed(    1, R).reduce((i, j) -> (i*j) % mod).getAsLong();
        return prod1 / prod2;
    }
    
    private static String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static String[] nstrs(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = nstr();
        return a;
    }

    private static char[][] nsToChars2D(int h, int w) {
        return nsToChars2D(h, w, 0);
    }

    private static char[][] nsToChars2D(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nsToChars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
