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

        long rootN = (long)Math.sqrt(N);

        // n^2 以上で表現されるもの
        for (long b = 2; b <= rootN; b++) {
            if( f(b, N) == S ) {
                return b;
            }
        }

        // pb + q の形で表現されるもの
        long min = Long.MAX_VALUE;
        for (long p = rootN; p >= 1; p--) {
            long b = (N - S + p) / p;
            if( b >= 2 && f(b, N) == S ) {
                min = Math.min(b, min);
            }
        }

        if( min != Long.MAX_VALUE ) {
            return min;
        } else {
            return -1;
        }
    }

    private static long f(long b, long n) {
        if( b <= 1 ) throw new IllegalArgumentException("wtf");
        if( n < b ) {
            return n;
        } else {
            return f(b, n/b) + (n % b);
        }
    }
}