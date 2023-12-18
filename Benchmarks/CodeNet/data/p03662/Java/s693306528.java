import java.util.*;

public class Main {
    private static String solve(Scanner scanner) {
        return solveInner(scanner) ? "Fennec" : "Sunuke";
    }

    private static boolean solveInner(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());

        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < N - 1; i ++) {
            String[] line = scanner.nextLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            // update a side
            Set<Integer> neighbors = graph.getOrDefault(a, new HashSet<>());
            neighbors.add(b);
            graph.put(a, neighbors);

            // update b side
            neighbors = graph.getOrDefault(b, new HashSet<>());
            neighbors.add(a);
            graph.put(b, neighbors);
        }

        Set<Integer> blackNodes = new HashSet<>();
        blackNodes.add(1);

        Set<Integer> whiteNodes = new HashSet<>();
        whiteNodes.add(N);

        Set<Integer> visited = new HashSet<>();
        visited.add(1);
        visited.add(N);

        return isWinning(true, blackNodes, whiteNodes, visited, graph);
    }

    private static boolean isWinning(boolean blackTurn,
                                     Set<Integer> blackNodes, Set<Integer> whiteNodes,
                                     Set<Integer> visited,
                                     Map<Integer, Set<Integer>> graph) {
        Set<Integer> nodesToBeOpened = blackTurn ? expand(blackNodes, graph, visited) : expand(whiteNodes, graph, visited);

        if (nodesToBeOpened.size() == 0) return false;

        for (Integer node: nodesToBeOpened) {
            // setup
            if (blackTurn) {
                blackNodes.add(node);
            } else {
                whiteNodes.add(node);
            }
            visited.add(node);

            // recursive
            boolean win = !isWinning(!blackTurn, blackNodes, whiteNodes, visited, graph);

            // backtrack
            if (blackTurn) {
                blackNodes.remove(node);
            } else {
                whiteNodes.remove(node);
            }
            visited.remove(node);

            if (win) return true;
        }

        return false;
    }

    // list up neighbors of nodes except visited nodes
    private static Set<Integer> expand(Set<Integer> nodes, Map<Integer, Set<Integer>> graph, Set<Integer> visited) {
        Set<Integer> ret = new HashSet<>();

        for (Integer node: nodes) {
            for (Integer neighbor: graph.getOrDefault(node, EMPTY_SET)) {
                if (! visited.contains(neighbor)) {
                    ret.add(neighbor);
                }
            }
        }

        return ret;
    }

    private static final Set<Integer> EMPTY_SET = new HashSet<>();

    private static final String ex1 = "7\n" +
            "3 6\n" +
            "1 2\n" +
            "3 1\n" +
            "7 4\n" +
            "5 7\n" +
            "1 4";
    private static final String ex2 = "4\n" +
            "1 4\n" +
            "4 2\n" +
            "2 3";

    public static void main(String[] args) {
//        System.out.println(solve(new Scanner(ex1)));
//        System.out.println(solve(new Scanner(ex2)));

        System.out.println(solve(new Scanner(System.in)));
    }

    private static long[] lineToNums(String line) {
        String[] strNums = line.split(" ");
        long[] ret = new long[strNums.length];
        for (int i = 0; i < strNums.length; i ++) {
            ret[i] = Long.parseLong(strNums[i]);
        }
        return ret;
    }
}
