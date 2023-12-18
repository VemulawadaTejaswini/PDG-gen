import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskG solver = new TaskG();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskG
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt(); // nodes
            int E = in.nextInt(); // edges
            Map<Integer, List<Integer>> graph = new HashMap<>();
            populateGraph(graph, in, E);
            int longestPath = getLongestPathFrom(graph);
            out.print(longestPath);
        }

        private int getLongestPathFrom(Map<Integer, List<Integer>> graph)
        {
            Map<Integer, Integer> memo = new HashMap<>();
            int longestPath = -1;
            for (int node : graph.keySet())
            {
                longestPath = Math.max(longestPath, getLongestPathFrom(node, graph, memo));
            }
            return longestPath;
        }

        private int getLongestPathFrom(int node, Map<Integer, List<Integer>> graph, Map<Integer, Integer> memo)
        {
            if (memo.containsKey(node)) return memo.get(node);

            List<Integer> neighbours = graph.get(node);
            int longestPath = 0;
            for (int n : neighbours)
            {
                if (!memo.containsKey(n))
                    longestPath = Math.max(longestPath, 1 + getLongestPathFrom(n, graph, memo));
                else
                    longestPath = Math.max(longestPath, 1 + memo.get(n));
            }
            memo.put(node, longestPath);
            return longestPath;
        }

        private void populateGraph(Map<Integer, List<Integer>> graph, Scanner in, int e)
        {
            for (int i = 0; i < e; i++)
            {
                int startNode = in.nextInt();
                int endNode = in.nextInt();
                List<Integer> neighbours = graph.getOrDefault(startNode, new ArrayList<>());
                neighbours.add(endNode);
                graph.put(startNode, neighbours);
                if (!graph.containsKey(endNode))
                {
                    graph.put(endNode, new ArrayList<>());
                }
            }
        }

    }
}

