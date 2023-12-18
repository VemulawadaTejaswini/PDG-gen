import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long S = sc.nextLong();
        System.out.println( solve(N, S) );
    }

    private static long solve(long N, long S) {
        if( N == S ) return 1;
        if( S == 1 ) return N;

        int root = (int)Math.floor(Math.sqrt(N));

        for (int i = root; i > 1; i--) {
            if( f(i, N) == S ) return i;
        }
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