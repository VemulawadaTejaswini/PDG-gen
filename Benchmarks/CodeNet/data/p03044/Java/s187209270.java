import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] u = new int[N];
        int[] v = new int[N];
        int[] w = new int[N];


        for (int i=0; i<N-1; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        int[] color = solve2(N, u, v, w);
        for (int i=0; i<N; i++) {
            System.out.println(color[i]);
        }
    }

    private static int[] solve2(int N, int[] u, int[] v, int[] w) {
        int[] ans = new int[N];
        List<int[]>[] tree = new ArrayList[N];
        for (int i=0; i<N; i++) {
            tree[i] = new ArrayList();
        }

        for (int i=0; i<N-1; i++) {
            tree[u[i]-1].add(new int[]{v[i]-1, w[i]});
            tree[v[i]-1].add(new int[]{u[i]-1, w[i]});
        }

        find(tree, ans, 0, -1, 0);

        return ans;
    }

    private static void find(List<int[]>[] tree, int[] ans, int v, int parent, int color) {
        ans[v] = color;

        for (int[] edge: tree[v]) {
            if (edge[0] == parent) continue;
            if (edge[1]%2 == 0) {
                find(tree, ans, edge[0], v, color);
            } else {
                find(tree, ans, edge[0], v, 1-color);
            }
        }
    }
}
