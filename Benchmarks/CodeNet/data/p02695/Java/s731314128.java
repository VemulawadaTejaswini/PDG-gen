import java.util.*;


public class Main {

    private static int Q;
    private static int N;
    private static int M;
    private static int[] a;
    private static int[] b;
    private static int[] c;
    private static int[] d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        int sum = 0;
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
            sum += d[i];
        }

        /*
        if (Q <= 2) {
            int[] A = new int[N];
            A[0] = 1;
            System.out.println(sum);
            return;
        }
        */

        int ans = 0;
        for (int i = 0; i < Q; i++) {
            int[] A = new int[N];
            A[0] = 1;
            int ai = a[i];
            int bi = b[i];
            int ci = c[i];

            A[ai] = 1;
            A[bi] = ci+A[ai];
            if (A[bi] > M) continue;
            int tmp = dfs(1, 1, A, ai, bi);
            ans = Math.max(ans,tmp);
        }
        System.out.println(ans);
    }

    private static int dfs(int pos, int val, int[] A, int skip1, int skip2) {
        if (pos == N) {
            return calc(A);
        }
        if (pos == skip1 || pos == skip2) {
            return dfs(pos+1, val, A, skip1, skip2);
        }


        int max = 0;
        for (int i = val; i <= M; i++) {
            A[pos] = i;
            int tmp = dfs(pos+1, i, A, skip1, skip2);
            max = Math.max(max,tmp);
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
