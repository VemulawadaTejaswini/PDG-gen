import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] As = new int[N];
        for (int i=0; i<N; i++) {
            As[i] = sc.nextInt();
        }

        int[] left = new int[N+1];
        int[] right = new int[N+1];

        for (int i=0; i<N; i++) {
            left[i+1] = gcd(left[i], As[i]);
        }
        for (int i=N-1; i>=0; i--) {
            right[i] = gcd(right[i+1], As[i]);
        }

        int res = 0;
        for (int i=0; i<N; i++) {
            int l = left[i];
            int r = right[i+1];

            if (res < gcd(l, r)) {
                res = gcd(l, r);
            }
        }
        System.out.println(res);
    }
    
    public static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a%b) : a;
    }
}
