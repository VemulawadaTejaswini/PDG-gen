import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
        UnionFindTree uft = new UnionFindTree(n);
        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ", 3);
            int a = Integer.parseInt(line[0]) - 1;
            int b = Integer.parseInt(line[1]) - 1;
            uft.unite(a, b);
        }
        System.out.println(uft.getCount());
    }
    
    static class UnionFindTree {
        int[] parents;

        public UnionFindTree(int size) {
            parents = new int[size];
            for (int i = 0; i < size; i++) {
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
            if (xx == yy) {
                return;
            } 
            parents[xx] = yy;
        }
        
        public int getCount() {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < parents.length; i++) {
                set.add(find(i));
            }
            return set.size();
        }
    }
}