import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static boolean solve(boolean player, Boolean[] vertices, Map<Integer, List<Integer>> nodes)
    {
        boolean put = false;
        for (int i = 0; i < vertices.length; i++) {
            Boolean v = vertices[i];
            if (v == null) {
                continue;
            }

            if ((player && v) || (!player && !v)) {
                List<Integer> dstList = nodes.get(i);
                if (dstList == null) {
                    continue;
                }
                for (int dst : dstList) {
                    if (vertices[dst] == null) {
                        Boolean[] newVertices = Arrays.copyOf(vertices, vertices.length);
                        newVertices[dst] = player;
                        if (!solve(!player, newVertices, nodes)) {
                            put = true;
                        }
                    }
                }
            }
        }
        return put;
    }

    private static ArrayList<Integer> shortestRoute(int cur, int goal, ArrayList<Integer> route, Map<Integer, List<Integer>> nodes)
    {
        if (cur == goal) {
            return route;
        }

        for (int next : nodes.get(cur)) {
            if (!route.contains(next)) {
                ArrayList<Integer> newRoute = new ArrayList<>(route);
                newRoute.add(next);
                ArrayList<Integer> result = shortestRoute(next, goal, newRoute, nodes);
                if (result != null) {
                    return result;
                }
            }
        }

        return null;
    }

    private static void prevail(boolean[] vertices, int cur, List<Integer> shortestRoute, Map<Integer, List<Integer>> nodes) {
        vertices[cur] = true;
        for (int next : nodes.get(cur)) {
            if (!vertices[next] && !shortestRoute.contains(next)) {
                prevail(vertices, next, shortestRoute, nodes);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, List<Integer>> nodes = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            nodes.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            nodes.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        ArrayList<Integer> shortestRoute;
        {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            shortestRoute = shortestRoute(1, n, list, nodes);
        }

        boolean[] vertices = new boolean[n + 1];
        for (int i = 0; i < Math.ceil(shortestRoute.size() / 2.0); i++) {
            prevail(vertices, shortestRoute.get(0), shortestRoute, nodes);
        }

        int fennecCells = 0;
        for (boolean b : vertices) {
            if (b) {
                fennecCells++;
            }
        }

        if (fennecCells > (n - fennecCells)) {
            System.out.println("Fennec");
        }
        else {
            System.out.println("Snuke");
        }
    }
}

