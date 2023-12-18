import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Vector;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Stack;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA
    {
        static int max = Integer.MIN_VALUE;
        static boolean cycle = false;

        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            max = Integer.MIN_VALUE;
            cycle = false;

            int n = in.nextInt();
            int matches[][] = new int[n + 1][n];
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n - 1; j++)
                {
                    matches[i][j] = in.nextInt();
                }
            }
            Map<Node, List<Node>> nodesMap = new HashMap<>();

            for (int i = 1; i <= n; i++)
            {
                nodesMap.put(new Node(i, i), new ArrayList<>());
            }
            for (int i = 1; i <= n; i++)
            {
                // Starting node
                final int index = i;
                Node startingNode = new Node(i, i);
                for (int j = 1; j <= n - 1; j++)
                {
                    //add dependencies
                    Node toAdd = new Node(i, matches[i][j]);
                    nodesMap.get(startingNode).add(toAdd);
                    if (!nodesMap.containsKey(toAdd))
                    {
                        nodesMap.put(toAdd, new ArrayList<>());
                    }
                    startingNode = toAdd;
                }
            }
            List covered = new ArrayList();
            for (Node node : nodesMap.keySet())
            {
                if (!covered.contains(node))
                    dfs(nodesMap, node, covered, 0, new Stack<>());
            }
            if (!cycle)
                out.print(max);
            else
                out.print(-1);
        }

        void dfs(Map<Node, List<Node>> nodesMap, Node node, List<Node> covered, int depth, Stack<Node> stack)
        {
            if (cycle) return;

            stack.push(node);
            if (max < depth) max = depth;
            covered.add(node);
            List<Node> neighbors = nodesMap.get(node);
            for (int i = 0; i < neighbors.size(); i++)
            {
                if (stack.contains(neighbors.get(i))) cycle = true;
                if (!covered.contains(neighbors.get(i)))
                {
                    dfs(nodesMap, neighbors.get(i), covered, depth + 1, stack);
                    stack.pop();
                }
            }
        }

        class Node
        {
            String label;

            Node(int player1, int player2)
            {
                if (player1 < player2)
                    label = player1 + "," + player2;
                else
                    label = player2 + "," + player1;
            }

            public boolean equals(Object obj)
            {
                return ((Node) obj).label.equals(this.label);
            }

            public int hashCode()
            {
                return this.label.hashCode();
            }

        }

    }
}

