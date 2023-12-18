import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    static int K;
    static int[] v; 
    static int[] revV; 
    static long[] left;
    static long[] right;
    
    public static void main(String[] args) {
        int n = ni();
        K = ni();
        v = new int[n+2];
        revV = new int[n+2];
        left = new long[n+2];
        right = new long[n+2];
        
        for (int i = 1; i <= n; i++) {
            v[i] = ni();
            revV[n+1-i] = v[i];
            left[i] = left[i-1] + v[i];
        }
        
        for (int i = 1; i <= n; i++) {
            right[i] = right[i-1] + v[n+1-i];
        }
        
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            ans = Math.max(ans, calcMax(left, right, i));
        }
        
        so.println(ans);
    }
    
    private static long calcMax(long[] left, long[] right, int k /* 0 to K */) {
        
        long max = 0;
        for (int i = 0; i <= k; i++) {
            long sumI = left[i] + right[k-i];
            long minus = calcMinus(i, k);
            max = Math.max(max, sumI - (minus));
        }
        
        return max;
    }

    private static long calcMinus(int i, int k) {
        List<Integer> minus = new ArrayList<>();
        for (int j = 1; j <= i; j++)
            if (v[j] < 0)
                minus.add(v[j]);
        
        for (int j = 1;  j <= k-i; j++)
            if (revV[j] < 0)
                minus.add(revV[j]);
        
        minus.sort((i1, i2) -> i1 - i2);
        long ans = 0;
        for (int j = 0; j < K - k && j < minus.size(); j++) {
            ans += minus.get(j);
        }
        return ans;
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
