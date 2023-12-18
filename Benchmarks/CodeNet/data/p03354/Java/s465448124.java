
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        UnionFind unionFind = new UnionFind(n);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt() - 1);
        }
        for (int i = 0; i < m; i++) {
            unionFind.unite(sc.nextInt() - 1, sc.nextInt() - 1);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(unionFind.same(i, list.get(i))){
                count++;
            }
        }
        System.out.println(count);
    }


    static class UnionFind{
        int[] parent;

        public UnionFind(int N){
            this.parent = new int[N];
            for (int i = 0; i < N; i++){
                parent[i] = i;
            }
        }

        public int root(int x){
            if (parent[x] == x) return x;
            else{
                return parent[x] = root(parent[x]);
            }
        }
        public void unite(int x, int y){
            if (same(x, y)) return;
            int xroot = root(x);
            int yroot = root(y);
            parent[xroot] = yroot;
            return;
        }
        public boolean same(int x, int y){
            return (root(x) == root(y));
        }
    }
}