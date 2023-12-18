import java.util.*;
public class Main {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Set<Integer>> map = new HashMap<>();

        int vertices = scanner.nextInt();
        int edges = scanner.nextInt();

        for (int j = 1; j <= vertices; j++) {
            map.put(j, new HashSet<>());
        }

        for (int i = 0; i < edges; i++) {
            int v = scanner.nextInt();
            int u = scanner.nextInt();

            map.get(v).add(u);
            map.get(u).add(v);
        }
        Set<List<Integer>> record = new HashSet<>();
        for (int i = 1; i <= vertices; i++) {
            dfs(map, i, i, 0, record);

            for (List<Integer> tuple : record) {
                //System.out.println("we got: " + tuple.get(0) + " " + tuple.get(1));
                map.get(tuple.get(0)).add(tuple.get(1));
                map.get(tuple.get(1)).add(tuple.get(0));
                ans++;
            }
            record.clear();
        }
        System.out.println(ans);
    }

    private static void dfs (Map<Integer, Set<Integer>> map, int start, int now,
                             int count, Set<List<Integer>> record) {

        if (count > 100) return;
        if (count == 3 && !map.get(now).contains(start)) {
            if (now != start)
                record.add(Arrays.asList(start, now));
            return;
        } else if (count == 3 && map.get(now).contains(start)) {
            return;
        }

        for (int next : map.get(now)) {
            dfs(map, start, next, count + 1, record);
        }

    }

}