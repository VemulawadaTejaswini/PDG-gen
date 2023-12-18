import java.util.*;

public class Bridge {

    static Set<Integer> cnt = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        List<List<Integer>> edge = new ArrayList<>();

        for (int i = 0; i < edges; i++) {
            edge.add(Arrays.asList(sc.nextInt(), sc.nextInt()));
        }


        int ans = 0;
        for (int i = 0; i < edges; i++) {
            List<Integer> e = edge.remove(i);
            connected(mapGen(edge), edge.get(0).get(0));
            if (cnt.size() != vertices) ans++;
            cnt.clear();
            edge.add(i, e);
        }

        System.out.println(ans);

    }

    private static Map<Integer, List<Integer>> mapGen(List<List<Integer>> edges) {
        Map<Integer, List<Integer>> g = new HashMap<>();
        for (int i = 0; i < edges.size(); i++) {
            int v = edges.get(i).get(0);
            int w = edges.get(i).get(1);
            if (!g.containsKey(v)) g.put(v, new ArrayList<>());
            if (!g.containsKey(w)) g.put(w, new ArrayList<>());

            g.get(v).add(w);
            g.get(w).add(v);
        }

        return g;
    }

    private static void connected(Map<Integer, List<Integer>> g, int v) {
        if (cnt.contains(v)) return;
        cnt.add(v);
        for (int w : g.get(v)) {
            connected(g, w);
        }
    }
}
