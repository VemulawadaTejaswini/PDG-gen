import java.util.*;
 
public class Main {
    static int N;
    static int M;
    static int V;
    static int P;
    static int[] A;
    static long[] sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();
        P = sc.nextInt();
        A = new int[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        sum = new long[N+1];
        sum[0] = 0;
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i-1]+A[i];
        }

        int l = 0; // NG
        int r = N; // OK
        while (l+1 < r) {
            int m = (l+r)/2;
            if (isOK(m)) {
                r = m;
            } else {
                l = m;
            }
        }

        /*
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(sum));
        */

        System.out.println(r);
    }

    private static boolean isOK(int ki) {

        int v = V;
        int key = A[ki];
        int l = 0;
        for (int i = 1; i <= N && A[i] < key; i++) {
            l = i;
        }
        v -= l+1;
        if (l == 0) {
            l = 1;
        }

        int r = N;
        for (int i = ki; i <= N; i++) {
            if (A[ki]+M < A[i]) {
                r = i;
                break;
            }
        }
        v -= N-r;
        int p = P-(N-r);

        long psum = sum[r]-sum[l-1];
        long remain = (long)key*(r-l+1)-psum;
        long remain2 = (long)v*M-remain;
        if (remain2 <= 0) {
            return true;
        }
        for (int i = r; i >= l; i--) {
            remain2 -= A[i]+M-key;
            p--;
            if (remain2 <= 0) {
                break;
            }
        }
        return p > 0;
    }
}
