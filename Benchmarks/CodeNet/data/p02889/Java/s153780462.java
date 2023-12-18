import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static class Path
    {
        final int pos;
        final int cost;

        public Path(int pos, int cost)
        {
            this.pos = pos;
            this.cost = cost;
        }
    }

    private static class Route
    {
        final int cur;
        final ArrayList<Integer> hist;
        final int cost;

        public Route(int cur, ArrayList<Integer> hist, int cost)
        {
            this.cur = cur;
            this.hist = hist;
            this.cost = cost;
        }

        @Override
        public String toString()
        {
            return "Route{" +
                    "cur=" + cur +
                    ", hist=" + hist +
                    ", cost=" + cost +
                    '}';
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        Map<Integer, List<Path>> paths = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            paths.computeIfAbsent(a, x -> new ArrayList<>()).add(new Path(b, c));
            paths.computeIfAbsent(b, x -> new ArrayList<>()).add(new Path(a, c));
        }

        int q = sc.nextInt();
        for (int iq = 0; iq < q; iq++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            Integer[] costs = new Integer[n];

            LinkedList<Route> queue = new LinkedList<>();
            queue.add(new Route(start, new ArrayList<>(), 0));

            Route shortestRoute = null;
            while (true) {
                if (queue.isEmpty()) {
                    break;
                }

                Route r = queue.removeFirst();
                if (costs[r.cur] != null && costs[r.cur] <= r.cost) {
                    continue;
                }
                costs[r.cur] = r.cost;

                if (r.cur == end) {
                    shortestRoute = r;
                }

                List<Path> nextPaths = paths.get(r.cur);
                if (nextPaths == null) {
                    continue;
                }

                for (Path path : nextPaths) {
                    ArrayList<Integer> newHist = new ArrayList<>(r.hist);
                    newHist.add(path.cost);
                    queue.add(new Route(path.pos, newHist, r.cost + path.cost));
                }
            }
            if (shortestRoute == null) {
                System.out.println(-1);
            }
            else {
                int fuel = l;
                int count = 0;
                for (int i = 0; i < shortestRoute.hist.size(); i++) {
                    int cost = shortestRoute.hist.get(i);
                    if (cost > l) {
                        System.out.println(-1);
                        break;
                    }
                    fuel -= cost;
                    if (i < shortestRoute.hist.size() - 1 && fuel - shortestRoute.hist.get(i + 1) < 0) {
                        fuel = l;
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
