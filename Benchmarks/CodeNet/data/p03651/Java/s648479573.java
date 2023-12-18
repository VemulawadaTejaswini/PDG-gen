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
        Arrays.sort(A);
        if(possible(N,A,K)) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }

    public static boolean possible(int N, int [] A, int K) {
        int now = K;
        for(int i = 0; i < N; i++) {
            if(now > A[N-i-1]) {
                return false;
            }
            now = now - A[N-i-1];
        }
        return true;
    }
}
