import java.util.*;

public class Main {

    private static int N;
    private static int M;
    private static int[] A;
    private static int[] B;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int K = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        int ans = dfs(0,0,0,K);
        System.out.println(ans);
    }

    private static int dfs(int i, int j, int x, int k) {
        if (i == N && j == M) {
            return x;
        }

        int ret = x;
        // A
        if (i < N && k >= A[i]) {
            ret = Math.max(ret,dfs(i+1,j,x+1,k-A[i]));
        }
        // B
        if (j < M && k >= B[j]) {
            ret = Math.max(ret,dfs(i,j+1,x+1,k-B[j]));
        }
        return ret;
    }
}
