import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long S = sc.nextLong();
        System.out.println( solve(N, S) );
    }

    private static long solve(long N, long S) {
        if( N == S ) return N+1;
        if( S == 1 ) return N;
        if( N < S ) return -1;

        long rootN = (long)Math.floor(Math.sqrt(N));

        // n^2 以上で表現されるもの
        long min = Long.MAX_VALUE;
        for (long b = rootN; b > 1; b--) {
            if( f(b, N) == S ) {
                min = Math.min(b, min);
            }
        }
        if( min != Long.MAX_VALUE ) return min;

        // pb + q の形で表現されるもの
        for (long p = rootN; p >= 1; p--) {
            long b = (N - S) / p + 1;
            if( b == 1 ) continue;
            if( f(b, N) == S ) {
                min = Math.min(b, min);
            }
        }
        if( min != Long.MAX_VALUE ) return min;

        return -1;
    }

    private static long f(long b, long n) {
        if( n < b ) {
            return n;
        } else {
            return f(b, n/b) + (n % b);
        }
    }
}