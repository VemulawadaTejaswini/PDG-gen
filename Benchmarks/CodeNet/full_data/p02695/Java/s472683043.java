import java.util.*;


public class Main {

    private static int Q;
    private static int N;
    private static int M;
    private static int[] a;
    private static int[] b;
    private static int[] c;
    private static int[] d;

    private static int maxScore = 0;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        maxScore = 0;
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
            maxScore += d[i];
        }

        int ans = 0;
        for (int i = 0; i < Q; i++) {
            int[] A = new int[N];
            int ai = a[i];
            int bi = b[i];
            int ci = c[i];

            A[ai] = 1;
            A[bi] = ci+1;
            int tmp = dfs(0, A, ai, bi);
            ans = Math.max(ans,tmp);
        }
        System.out.println(ans);
    }

    private static int dfs(int pos, int[] A, int skip1, int skip2) {
        if (pos == N) {
            return calc(A);
        }
        if (pos == skip1 || pos == skip2) {
            return dfs(pos+1, A, skip1, skip2);
        }


        int max = 0;
        for (int i = 1; i <= M; i++) {
            A[pos] = i;
            int tmp = dfs(pos+1, A, skip1, skip2);
            max = Math.max(max,tmp);
            if (max == maxScore) break;
        }

        return max;
    }

    private static int calc(int[] A) {
        int ret = 0;
        for (int i = 0; i < Q; i++) {
            if (A[b[i]]-A[a[i]] == c[i]) ret += d[i];
        }
        return ret;
    }

}
