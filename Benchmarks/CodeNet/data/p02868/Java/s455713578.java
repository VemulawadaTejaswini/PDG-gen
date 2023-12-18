import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    private static class Entry {
        int id;
        int cost;
        
        Entry(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {

        int[][] costs;
        List<List<Integer>> links = new ArrayList<>();
        int n, m;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array;
            array = in.readLine().split(" ");
            n = Integer.parseInt(array[0]);
            m = Integer.parseInt(array[1]);
            
            costs = new int[n][n];
            for (int i = 0; i < n; ++i) {
                links.add(new ArrayList<>());
            }
            
            for (int i = 0; i < m; ++i) {
                array = in.readLine().split(" ");
                int l = Integer.parseInt(array[0]) - 1;
                int r = Integer.parseInt(array[1]) - 1;
                int c = Integer.parseInt(array[2]);

                for (int j = l; j < r; ++j) {
                    for (int k = j + 1; k <= r; ++k) {
                        int c0 = costs[j][k];
                        if (c0 != 0 && c > c0) {
                            continue;
                        }
                        costs[j][k] = c;
                        costs[k][j] = c;
                        links.get(j).add(k);
                        links.get(k).add(j);
                    }
                }
            }
        }
        
        PriorityQueue<Entry> h = new PriorityQueue<>(Comparator.comparingInt(e -> e.cost));
        
        h.add(new Entry(n - 1, 0));
        
        BitSet bitset = new BitSet();
        
        while (!h.isEmpty()) {
            Entry e = h.poll();
            
            int c1 = e.cost;
            int n1 = e.id;
            
            if (n1 == 0) {
                System.out.println(e.cost);
                System.exit(0);
                break;
            }
            bitset.set(n1);
            
            for (int n2 : links.get(n1)) {
                if (bitset.get(n2)) {
                    continue;
                }
                
                int c2 = costs[n1][n2];
                if (c2 == 0) {
                    continue;
                }
                h.add(new Entry(n2, c1 + c2));
            }
        }
        System.out.println(-1);
    }
    
    public static int[] toIntArray(String[] strings) {
        int[] array = new int[strings.length];
        for (int i = 0; i < strings.length; ++i) {
            array[i] = Integer.parseInt(strings[0]);
        }
        return array;
    }
}
