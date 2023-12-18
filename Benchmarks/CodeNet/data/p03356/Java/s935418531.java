
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final PrintStream ps = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        
        DisjointSet ds = new DisjointSet(n+1);
        for (int i = 0; i < m; i++) 
            ds.unite(sc.nextInt(), sc.nextInt());
        for (int i = 1; i <= n; i++) 
            ds.findSet(i);
        
        Map<Integer, ArrayList> map = new HashMap<Integer, ArrayList>();
        for (int i = 1; i <= n; i++) {
            int key = ds.p[i];
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<Integer>());
            }
            map.get(key).add(i);
        }
        
        int count = 0;
        for (int key: map.keySet()) {
            ArrayList<Integer> al = map.get(key);
            for (int idx: al) {
                if (al.contains(a[idx]))
                    count++;
            }
        }
        ps.println(count);
   }
    
    static class DisjointSet {
        public int[] rank;
        public int[] p;
        
        DisjointSet(int size) {
            rank = new int[size];
            p = new int[size];
            for (int i = 0; i < size; i++) makeSet(i);
        }
        
        void makeSet(int x) {
            p[x] = x;
            rank[x] = 0;
        }
        
        boolean same(int x, int y) {
            return findSet(x) == findSet(y);
        }
        
        int findSet(int x) {
            if (x != p[x]) {
                p[x] = findSet(p[x]);
            }
            return p[x];
        }
        
        void unite(int x, int y) {
            link(findSet(x), findSet(y));
        }
        
        void link(int x, int y) {
            if (rank[x] > rank[y]) {
                p[y] = x;
            } else {
                p[x] = y;
                if (rank[x] == rank[y]) {
                    rank[y]++;
                }
            }
        }
    }

}
