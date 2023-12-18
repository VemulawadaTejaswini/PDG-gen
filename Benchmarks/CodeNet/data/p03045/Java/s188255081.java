import java.util.*;

public class Main {
    private static int[] roots;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        UnionFind uf = new UnionFind(n);
        
        while (m-- > 0) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            sc.nextInt();
            uf.unite(x, y);
        }
        
        System.out.println(uf.connectedComponent());
    }
    
    public static class UnionFind {
        int[] par;
    
        UnionFind(int n) {
            par = new int[n];
            for (int i = 0; i < n; i++) {
                par[i] = i;
            }
        }
    
        int root(int x) {
            if (par[x] == x) return x;
            return root(par[x]);
        }
    
        void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry) return;
            par[ry] = rx;
        }
    
        boolean same(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            return rx == ry;
        }
        
        int connectedComponent() {
            Set<Integer> set = new HashSet<Integer>();
            for (int p : par) {
                set.add(p);
            }
            
            return set.size();
        }
        
        void printPar() {
            System.out.println(Arrays.toString(par));
        }
    }
}