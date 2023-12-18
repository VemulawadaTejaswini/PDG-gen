import java.util.*;

public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        N = N;
        int [] A = new int [N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        if(possible(N,A,K)) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }

    public static boolean possible(int N, int [] A, int K) {
        int s = A[0];
        boolean flag = false;
        for(int i = 0; i < N; i++) {
            s = gcd(s,A[i]);
            if(K < A[i]) flag = true;
        }
        if(K % s > 0) return false;
        return flag;
    }

    public static int gcd(int n, int m) {
        int r = n % m;
        while(r != 0) {
            n = m; m = r;
            r = n % m;
        }
        return m;
    }
}
