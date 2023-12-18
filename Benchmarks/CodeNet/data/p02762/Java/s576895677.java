import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            UnionFindTree uft = new UnionFindTree(N);

            List<Integer>[] X = new List[N];
            for (int i = 0; i < N; i++) {
                X[i] = new ArrayList<>();
            }

            for (int i = 0; i < M; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;

                X[a].add(b);
                X[b].add(a);

                uft.unite(a, b);
            }

            for (int i = 0; i < K; i++) {
                int c = sc.nextInt() - 1;
                int d = sc.nextInt() - 1;

                X[c].add(d);
                X[d].add(c);
            }

            List<Integer>[] groups = new List[N];
            for (int i = 0; i < N; i++) {
                groups[i] = new ArrayList<>();
            }

            for (int i = 0; i < N; i++) {
                groups[uft.find(i)].add(i);
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < N; i++) {
                List<Integer> kouho = new ArrayList<>(groups[uft.find(i)]);
                kouho.remove(Integer.valueOf(i));
                kouho.removeAll(X[i]);

                ans.append(kouho.size()).append(" ");
            }

            System.out.println(ans.toString().trim());
        }
    }

    public static class UnionFindTree {

        private int[] parent;

        private int[] rank;

        public UnionFindTree(int N) {
            parent = new int[N];
            rank = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int x) {
            if (parent[x] == x) {
                return x;
            } else {
                int p = find(parent[x]);
                parent[x] = p;
                return p;
            }
        }

        public void unite(int x, int y) {
            x = find(x);
            y = find(y);

            if (x == y) {
                return;
            }

            if (rank[x] < rank[y]) {
                parent[x] = y;
            } else {
                parent[y] = x;
                if (rank[x] == rank[y]) {
                    rank[x]++;
                }
            }
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

    }

}
