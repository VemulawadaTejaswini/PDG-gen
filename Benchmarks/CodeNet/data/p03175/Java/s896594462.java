import java.util.*;

public class Main {
    Map<Integer, Boolean> map;
    static class Value {
        int white, black;

        public Value(int white, int black) {
            this.white = white;
            this.black = black;
        }

        @Override
        public String toString() {
            return "Value{" +
                    "white=" + white +
                    ", black=" + black +
                    '}';
        }
    }
    List<Integer> []graph;

    int md = (int) (1e9 + 7);

    public Value solve(int u, int p) {
        Value current = new Value(1, 1);

        map.put(u, true);
        for(int v: graph[u]) {
            if(!map.get(v)) {
                Value child = solve(v, u);
                current.white = (current.white * (child.white + child.black)) % md;
                current.black = child.white * current.white % md;
            }
        }

        return current;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        graph = new ArrayList[n + 1];
        map = new HashMap<>();

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
            map.put(i, false);
        }
        for (int i = 0; i < n - 1; i++) {
            int u = in.nextInt(), v = in.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        Value ans = solve(1, -1);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main().input();
    }
}
