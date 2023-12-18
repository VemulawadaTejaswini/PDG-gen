import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = ni();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = ni();
        }
        
        int idx = -1;
        int minGCD = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            int GCDi = gcd(A[i], A[(i+1)%N]);
            if (GCDi < minGCD) {
                minGCD = GCDi;
                idx = i;
            }
        }

        int[] copy1 = A.clone();
        copy1[idx] = 0;

        int[] copy2 = A.clone();
        copy2[(idx+1)%N] = 0;
        
        int[] copy3 = A.clone();
        copy3[(idx+2)%N] = 0;
        
        so.println(Math.max(gcd(copy1), Math.max(gcd(copy2), gcd(copy3))));
    }
    
    static int gcd(int[] a) {
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            int nextI = i == a.length-1 ? 0 : i+1;
            int GCDi = gcd(a[i], a[nextI]);
            ans = gcd(ans, GCDi);
        }
        return ans;
    }
    static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    static int ni() {
        return sc.nextInt();
    }
}
