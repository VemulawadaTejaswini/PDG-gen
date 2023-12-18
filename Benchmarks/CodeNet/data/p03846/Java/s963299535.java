import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, A) );
    }

    private static int solve(int N, int[] A) {
        Arrays.sort(A);
        int ans;
        int i = 0;
        int abs;
        if( N % 2 == 1 ) {
            if( A[i] != 0 ) {
                return 0;
            } else {
                i++;
                abs = 2;
                ans = 1;
            }

        } else {
            abs = 1;
            ans = 1;
        }

        while(i < N) {
            if( A[i] == abs && A[i+1] == abs ) {
                ans = (ans * 2) % MOD;
                i += 2;
                abs += 2;
            } else {
                return 0;
            }
        }

        return ans;
    }
}
