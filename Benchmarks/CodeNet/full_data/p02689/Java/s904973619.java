import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // height: index
        TreeMap<Integer, Integer> hs = new TreeMap<>();
        int n = scan.nextInt();
        int nEdge = scan.nextInt();
        for (int i = 0; i < n; i++) {
            hs.put(scan.nextInt(), i + 1);
        }
        Map<Integer, Set<Integer>> neighbours = new HashMap<>();
        for (int i = 0; i < nEdge; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            neighbours.computeIfAbsent(l, HashSet::new);
            neighbours.computeIfAbsent(r, HashSet::new);
            neighbours.get(l).add(r);
            neighbours.get(r).add(l);
        }
        int cnt = 0;
        scan.close();
        Set<Integer> visited = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : hs.descendingMap().entrySet()) {
            if (visited.contains(entry.getKey())) {
                continue;
            }
            cnt++;
            mark(entry.getValue(), visited, neighbours);
        }

        System.out.println(cnt);
    }

    private static void mark(Integer key, Set<Integer> visited, Map<Integer, Set<Integer>> neighbours) {
        visited.add(key);
        visited.addAll(neighbours.get(key));
    }
}



