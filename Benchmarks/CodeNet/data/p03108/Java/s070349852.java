import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main d = new Main();
        long[] answer = d.solve();
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public long[] solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        List<String> edge_list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            A[i] = scan.nextInt() - 1;
            B[i] = scan.nextInt() - 1;
        }
        UnionFind union_find = new UnionFind(N);
        long[] answer = new long[M];
        for (int i = M - 1; 0 <= i; i--) {
            HashMap<Integer, Integer> set = new HashMap<>();
            for (int j = 0; j < N; j++) {
                int parent = union_find.find(j);
                if (!set.containsKey(parent)) {
                    set.put(parent, 0);
                }
                int count = set.get(parent);
                set.put(parent, count+1);
            }
            answer[i] = score(set);
            union_find.unite(A[i], B[i]);
        }
        return answer;
    }
    private long score(HashMap<Integer, Integer> set) {
        List<Integer> y = new ArrayList<>();
        for(Integer x : set.keySet())  {
            y.add(set.get(x));
        }
        int n = y.size();
        long score = 0;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += y.get(j);
            }
            score += sum * y.get(i);
        }
        return score;
    }

    class UnionFind {
        private int[] parent = null;
        private int[] rank = null;
        public UnionFind(int N) {
            int[] parent = new int[N];
            int[] rank = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
            this.parent = parent;
            this.rank = rank;
        }

        public void unite(int x, int y) {
            x = this.find(x);
            y = this.find(y);
            if (x == y) {
                return;
            }
            if (this.rank[x] < this.rank[y]) {
                this.parent[x] = y;
                return;
            }
            this.parent[y] = x;
            if (this.rank[x] == this.rank[y]) {
                this.rank[x] += 1;

            }
        }

        public int find(int x) {
            if (this.parent[x] == x) {
                return x;
            }
            return this.parent[x] = find(this.parent[x]);
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }
    }
}
