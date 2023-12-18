import java.util.*;

public class Main {
    public static void main(String[] args) {
        ABC125.solutionC();
    }
}

class ABC125 {
    static void solutionC() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextLong();
        }
        long[] L = new long[N+1];
        long[] R = new long[N+1];
        L[0] = 0;
        R[N] = 0;
        for (int i=1; i<N+1; i++) {
            L[i] = gcd(L[i-1],A[i-1]);
            R[N-i] = gcd(A[N-i],R[N-i+1]);
        }
        long[] M = new long[N];
        long maxValue = Long.MIN_VALUE;
        for (int i=0; i<N; i++) {
            M[i] = gcd(L[i],R[i+1]);
            if (maxValue < M[i]) maxValue = M[i];
        }
        System.out.println(maxValue);
    }

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}