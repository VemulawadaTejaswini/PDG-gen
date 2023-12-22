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
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        /*
        if (Q <= 2) {
            int[] A = new int[N];
            A[0] = 1;
            System.out.println(sum);
            return;
        }
        */

        long ans = 0;
        for (int i = 0; i < Q; i++) {
            int[] A = new int[N];
            A[0] = 1;
            long tmp = dfs(1, 1, A);
            ans = Math.max(ans,tmp);
        }
        System.out.println(ans);
    }

    private static long dfs(int pos, int val, int[] A) {
        if (pos == N) {
            return calc(A);
        }

        long max = 0;
        for (int i = val; i <= M; i++) {
            A[pos] = i;
            long tmp = dfs(pos+1, i, A);
            max = Math.max(max,tmp);
        }

        return max;
    }

    private static long calc(int[] A) {
        long ret = 0;
        for (int i = 0; i < Q; i++) {
            if (A[b[i]]-A[a[i]] == c[i]) ret += d[i];
        }
        return ret;
    }

}
