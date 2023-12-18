import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        UnionFindTree uft = new UnionFindTree(n);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            uft.unite(a, b);
        }
        uft.calc();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            uft.dislike(a, b);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append(uft.ans[i]);
        }
		System.out.println(sb);
   }
    
    static class UnionFindTree {
        int[] parents;
        int[] counts;
        int[] friends;
        int[] ans;
        
        public UnionFindTree(int size) {
            parents = new int[size];
            counts = new int[size];
            friends = new int[size];
            ans = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
                counts[i] = 1;
            }
        }
        
        public int find(int x) {
            if (parents[x] == x) {
                return x;
            } else {
                return parents[x] = find(parents[x]);
            }
        }
        
        public boolean same(int x, int y) {
            return find(x) == find(y);
        }
        
        public void unite(int x, int y) {
            friends[x]++;
            friends[y]++;
            int xx = find(x);
            int yy = find(y);
            if (xx == yy) {
                return;
            }
            parents[xx] = yy;
            counts[yy] += counts[xx];
        }
        
        public void calc() {
            for (int i = 0; i < counts.length; i++) {
                ans[i] = counts[find(i)] - 1 - friends[i];
            }
        }
        
        public void dislike(int x, int y) {
            if (same(x, y)) {
                ans[x]--;
                ans[y]--;
            }
        }
    }

}
