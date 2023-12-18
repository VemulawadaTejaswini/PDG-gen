import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = (int)Math.floor(N/2);
            int answer = Integer.MAX_VALUE;
            for ( int A = 1; A <= M; A++ ) {
                int B = N - A;
                int candidate = digitSum(A) + digitSum(B);
                if ( candidate < answer ) {
                    answer = candidate;
                }
            }
            System.out.println(answer);
        }
    }

    private static int digitSum(int n) {
        if ( n < 10 ) {
            return n;
        }
        else {
             int r = n % 10;
             int q = (n-r)/10;
             return r + digitSum(q);
        }
    }
}