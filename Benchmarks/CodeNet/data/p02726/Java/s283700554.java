import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;

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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            // 5 2 4
            int N = in.nextInt();
            int X = in.nextInt();
            int Y = in.nextInt();
            Map<Integer, Node> G = new HashMap<>(N);
            for (int i = 1; i <= N; i++)
            {
                G.put(i, new Node(i));
            }
            for (int i = 1; i < N; i++)
            {
                Node from = G.get(i);
                Node to = G.get(i + 1);
                from.neighbours.add(to);
                to.neighbours.add(from);
            }
            Node from = G.get(X);
            Node to = G.get(Y);
            from.neighbours.add(to);
            to.neighbours.add(from);
            //-----
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 1; i <= N; i++)
            {
                bfs(i, map, G);
            }
            for (int k = 1; k <= N - 1; k++)
            {
                if (map.containsKey(k))
                {
                    out.println(map.get(k) / 2);
                } else
                {
                    out.println(0);
                }
            }
        }

        private void bfs(int i, Map<Integer, Integer> map, Map<Integer, Node> G)
        {
            Deque<DistanceNode> queue = new LinkedList<>();
            queue.add(new DistanceNode(G.get(i), 0));
            Set<Integer> visited = new HashSet<>(G.keySet().size());
            while (!queue.isEmpty())
            {
                DistanceNode distanceNode = queue.pollFirst();
                if (!visited.contains(distanceNode.n.val))
                {
                    visited.add(distanceNode.n.val);
                    int distance = distanceNode.distance;
                    int d = map.getOrDefault(distance, 0);
                    d++;
                    map.put(distance, d);
                    for (Node n : distanceNode.n.neighbours)
                    {
                        queue.add(new DistanceNode(n, distanceNode.distance + 1));
                    }
                }
            }
        }

    }

    static class DistanceNode
    {
        int distance;
        Node n;

        DistanceNode(Node n, int d)
        {
            distance = d;
            this.n = n;
        }

    }

    static class Node
    {
        List<Node> neighbours = new ArrayList<>();
        int val;

        Node(int val)
        {
            this.val = val;
        }

        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return val == node.val;
        }

        public int hashCode()
        {
            return Objects.hash(val);
        }

    }
}

