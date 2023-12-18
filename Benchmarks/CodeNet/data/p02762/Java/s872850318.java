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

            List<List<Integer>> friends = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                friends.add(new ArrayList<>());
            }

            for (int i = 0; i < M; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                friends.get(a).add(b);
                friends.get(b).add(a);

                uft.unite(a, b);
            }

            List<List<Integer>> blocks = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                blocks.add(new ArrayList<>());
            }

            for (int i = 0; i < K; i++) {
                int c = sc.nextInt() - 1;
                int d = sc.nextInt() - 1;
                blocks.get(c).add(d);
                blocks.get(d).add(c);
            }

            List<List<Integer>> groups = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                groups.add(new ArrayList<>());
            }

            for (int i = 0; i < N; i++) {
                groups.get(uft.find(i)).add(i);
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < N; i++) {
                List<Integer> kouho = new ArrayList<>(groups.get(uft.find(i)));
                kouho.remove(Integer.valueOf(i));
                kouho.removeAll(friends.get(i));
                kouho.removeAll(blocks.get(i));

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
