import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[N-1];
        int[] b = new int[N-1];
        int[] p = new int[Q];
        int[] x = new int[Q];
        for (int i=0; i<N-1; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i=0; i<Q; i++) {
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();
        }

        int[] ans = solve(N, Q, a, b, p, x);
        for (int i=0; i<N; i++) {
            if (i != 0) System.out.print(" ");

            System.out.print(ans[i]);
        }
        System.out.println();
    }

    private static int[] solve(int N, int Q, int[] a, int[] b, int[] p, int[] x) {
        int[] ans = new int[N];
        List<Integer>[] child = new List[N];
        for (int i=0; i<N; i++) {
            child[i] = new ArrayList();
        }

        for (int i=0; i<N-1; i++) {
            child[a[i]-1].add(b[i]-1);
        }
        for (int i=0; i<Q; i++) {
            ans[p[i]-1] += x[i];
        }

        Queue<Integer> queue = new LinkedList();
        queue.add(0);

        while (queue.size() > 0) {
            int node = queue.poll();
            int val = ans[node];

            for (int i=0; i<child[node].size(); i++) {
                int childNode = child[node].get(i);

                ans[childNode] += val;
                queue.add(childNode);
            }
        }

        return ans;
    }
}