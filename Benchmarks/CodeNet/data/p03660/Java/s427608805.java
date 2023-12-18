import java.util.*;
public class Main {
    private static int n;
    private static int mid;
    private static Map<Integer, List<Integer>> graph = new HashMap<>();
    private static Map<Integer, Integer> sz = new HashMap<>();
    private static List<Integer> path = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            graph = new HashMap<>();
            sz = new HashMap<>();
            path = new ArrayList<>();

            n = sc.nextInt();
            for (int i=1; i<n; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                graph.computeIfAbsent(u, ArrayList::new).add(v);
                graph.computeIfAbsent(v, ArrayList::new).add(u);
            }

            dfs(1, -1);

            int sum1 = n - sz.get(mid);
            if (sum1 > sz.get(mid)) {
                System.out.println("Fennec");
            } else {
                System.out.println("Snuke");
            }
        }
    }

    private static void dfs(int x, int parent) {
        path.add(x);
        sz.put(x, 1);

        for(int e: graph.computeIfAbsent(x, ArrayList::new)) {
            if (e == parent) {
                continue;
            }
            dfs(e, x);
            sz.put(x, sz.get(x) + sz.get(e));
        }

        if (x == n) {
            mid = path.get((path.size() + 1) / 2);
        }

        path.remove(path.size()-1);
    }
}
