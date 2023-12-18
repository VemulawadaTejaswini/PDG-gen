import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        long[] A = new long[K];
        for (int i=0;i<K;i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        long L = 2;
        long R = 2;
        for (int i=K-1;i>=0;i--) {
            if ((L-1)/A[i]>=R/A[i]) {
                System.out.println(-1);
                return;
            }
            L = (L+A[i]-1)/A[i]*A[i];
            R = R/A[i]*A[i]+A[i]-1;
        }
        System.out.println(L+" "+R);
    }
}