import java.util.*;

public class Main {
    
    private static int[] parent;
    private static int[] size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        parent = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            graph.get(A).add(B);
            graph.get(B).add(A);
            unite(A, B);
        }

        List<Set<Integer>> block = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            block.add(new HashSet<>());
        }
        for (int i = 0; i < K; i++) {
            int C = sc.nextInt()-1;
            int D = sc.nextInt()-1;
            block.get(C).add(D);
            block.get(D).add(C);
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int tmp = size[root(i)] - 1 - graph.get(i).size();
            for (int f : block.get(i)) {
                if (same(i, f)) tmp--;
            }
            ans.append(tmp).append(i == N-1 ? '\n' : ' ');
        }
        System.out.print(ans);
    }

    private static int root(int x) {
        if (parent[x] == x) return x;
        return parent[x] = root(parent[x]);
    }

    private static void unite(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        if (rx == ry ) return;
        parent[rx] = ry;
        size[ry] += size[rx];
    }

    private static boolean same(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        return rx == ry;
    }

}
