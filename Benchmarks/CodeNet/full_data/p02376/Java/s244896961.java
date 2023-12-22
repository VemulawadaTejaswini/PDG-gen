import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author baito
 */

public class Main
{
    @SuppressWarnings("unchecked")
    static List<Edge>[] edges;
    static boolean[] used;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        //edges = Stream.generate(ArrayList::new).limit(V).toArray(ArrayList[]::new);
        edges = new ArrayList[V];
        for (int i = 0; i < V; i++)
        {
            edges[i] = new ArrayList<Edge>();
        }

        used = new boolean[V];
        for (int i = 0; i < E; i++)
        {
            addEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        int res = fordFulkerson(0, V - 1);
        System.out.println(res);
    }

    public static int dfs(int now, int goal, int f)
    {
        if (now == goal)
        {
            return f;
        }
        used[now] = true;
        for (int i = 0; i < edges[now].size(); i++)
        {
            Edge e = edges[now].get(i);
            if (!used[e.to] && e.cap > 0)
            {
                int flow = dfs(e.to, goal, Math.min(f, e.cap));
                if (flow == 0) continue;
                e.cap -= flow;
                edges[e.to].get(e.rev).cap += flow;
                return flow;
            }
        }
        return 0;
    }

    public static int fordFulkerson(int s, int e)
    {
        int flow = 0;
        while (true)
        {
            Arrays.fill(used, false);
            int river = dfs(s, e, Integer.MAX_VALUE);
            if (river == 0) return flow;
            flow += river;
        }
    }

    public static void addEdge(int f, int t, int c)
    {
        edges[f].add(new Edge(t, c, edges[t].size()));
        edges[t].add(new Edge(f, 0, edges[f].size() - 1));
    }

    static class Edge
    {
        int to, cap, rev;

        Edge(int to, int cap, int rev)
        {
            this.to = to;
            this.cap = cap;
            this.rev = rev;
        }
    }


}

