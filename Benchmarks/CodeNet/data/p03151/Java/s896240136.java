
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);
    static final String KEYENCE = "keyence";
    static int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        Prep[] P = new Prep[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
            int diff = A[i] - B[i];
            P[i] = new Prep(A[i], B[i], diff < 0 ? INF : diff);
        }
        
        Arrays.sort(P, (p1, p2) -> p1.d - p2.d);
        
        long sumA = sum(A);
        long sumB = sum(B);
        long sumDiff = sumA - sumB;
        if (sumDiff < 0) {
            so.println(-1);
            return;
        }
        
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (sumDiff < P[i].d) {
                break;
            }
            sumDiff -= P[i].d;
            ans++;
        }
        so.println(N - ans);
    }
    static long sum(int[] a) {
        return Arrays.stream(a).mapToLong(i -> i).sum();
    }
    
    static class Prep {
        int a;
        int b;
        int d;
        public Prep(int a, int b, int d) {
            this.a = a;
            this.b = b;
            this.d = d;
        }
        
        @Override
        public String toString() {
            return "(a: " + a + ", b: " + b + ", d: " + d + ")";
        }
    }
}
