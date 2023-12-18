import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        UnionFindTree uft = new UnionFindTree(n);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            sc.nextInt();
            uft.unite(a, b);
        }
        System.out.println(uft.getCouunt());
    }
    
    static class UnionFindTree {
        int[] parents;
        
        public UnionFindTree(int n) {
            parents = new int[n];
            for (int i = 0; i < n; i++) {
                parents[i] = i;
            }
        }
        
        public int find(int x) {
            if (parents[x] == x) {
                return x;
            } else {
                return parents[x] = find(parents[x]);
            }
        }
        
        public void unite(int x, int y) {
            int xx = find(x);
            int yy = find(y);
            parents[xx] = yy;
        }
        
        public int getCouunt() {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < parents.length; i++) {
                set.add(find(i));
            }
            return set.size();
        }
    }
}