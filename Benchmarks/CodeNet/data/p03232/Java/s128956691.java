
import java.awt.Point;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);
    static long p = (long) (10E9 + 7);
    static Map<Point, Long> memo;
    static long[] A;
    static long[] sum;
    static long[] fact = new long[(int) (10E5+1)];
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        A = new long[n+1];
        sum = new long[n+1];
        memo = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            A[i] = sc.nextInt();
            sum[i] = sum[i-1] + A[i];
        }
        memo.forEach((Point k, Long v) -> so.println(k + ": " + v));
        so.println(f(1, n));
    }
    
    static long f(int x, int y) {
        Long rec = memo.get(new Point(x, y));
        if (rec != null) return rec;

        if (x == y) {
            memo.put(new Point(x, y), A[x]);
            return A[x];
        }
        
        long newRec = 0;
        newRec += g(x, y) % p;
        newRec %= p;
        newRec += f(x+1, y);
        newRec %= p;
        newRec += f(x, y-1);
        newRec %= p;
        
        for (int i = x+1; i <= y-1; i++) {
                newRec += f(x, i-1)  * f(i+1, y) * 2;
                newRec %= p;
                newRec += f(i+1, y) * f(x, i-1) * 2;
                newRec %= p;
        }
        memo.put(new Point(x, y), newRec);
        return newRec;
    }
    
    static long g(int x, int y) {
        int mul = y - x + 1;
        long ret = sum[y] - sum[x-1];
        for (int i = 1; i <= mul; i++) {
            ret = ret * i % p;
        }
        return ret;
    }
    
    static long fact(int x) {
        long ret = 1;
        for (int i = 2; i <= x; i++) {
            ret = ret * i % p;
        }
        return ret;
    }
}
