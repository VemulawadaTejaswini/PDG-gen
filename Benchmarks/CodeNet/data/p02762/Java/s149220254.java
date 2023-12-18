import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        UnionFindTree uft = new UnionFindTree(N);

        int[] friend = new int[N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            friend[a]++;
            friend[b]++;

            uft.unite(a, b);
        }

        int[] group = new int[N];
        for (int i = 0; i < N; i++) {
            group[uft.find(i)]++;
        }

        int[] block = new int[N];
        for (int i = 0; i < K; i++) {
            int c = sc.nextInt() - 1;
            int d = sc.nextInt() - 1;

            if (uft.same(c, d)) {
                block[c]++;
                block[d]++;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int c = group[uft.find(i)] - 1 - friend[i] - block[i];
            ans.append(c).append(" ");
        }

        System.out.println(ans.toString().trim());
    }

    static class UnionFindTree {

        int[] parent;

        int[] rank;

        UnionFindTree(int N) {
            parent = new int[N];
            rank = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int find(int x) {
            if (parent[x] == x) {
                return x;
            } else {
                int p = find(parent[x]);
                parent[x] = p;
                return p;
            }
        }

        void unite(int x, int y) {
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

        boolean same(int x, int y) {
            return find(x) == find(y);
        }

    }

}
