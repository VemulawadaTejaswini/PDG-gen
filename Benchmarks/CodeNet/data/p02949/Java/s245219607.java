import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void go() throws IOException
    {
        StringTokenizer tok = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tok.nextToken());
        int m = Integer.parseInt(tok.nextToken());
        int p = Integer.parseInt(tok.nextToken());
        Vertex[] vertices = new Vertex[n];
        Edge[] edges = new Edge[m];
        for (int i = 0; i < n; i++)
        {
            vertices[i] = new Vertex(i);
            vertices[i].distance = Long.MAX_VALUE;
        }
        for (int i = 0; i < m; i++)
        {
            tok = new StringTokenizer(in.readLine());
            Vertex u = vertices[Integer.parseInt(tok.nextToken())-1];
            Vertex v = vertices[Integer.parseInt(tok.nextToken())-1];
            int val = Integer.parseInt(tok.nextToken());
            Edge e = new Edge(u, v, p - val);
            u.edges.add(e);
            edges[i] = e;
        }
        vertices[0].distance = 0;
        for (int i = 0; i < n-1; i++)
        {
            for (Edge e : edges)
            {
                if (e.u.distance != Long.MAX_VALUE && e.u.distance + e.val < e.v.distance)
                {
                    e.v.distance = e.u.distance + e.val;
                }
            }
        }
        // for (int i = 0; i < n; i++)
        // {
        //     out.println(vertices[i].distance);
        // }
        // out.println();
        for (Edge e : edges)
        {
            if (e.u.distance != Long.MAX_VALUE && e.u.distance + e.val < e.v.distance)
            {
                e.v.distance = Long.MIN_VALUE;
            }
        }
        for (int i = 0; i < n-1; i++)
        {
            for (Edge e : edges)
            {
                if (e.u.distance == Long.MIN_VALUE || e.u.distance != Long.MAX_VALUE && e.v.distance != Long.MIN_VALUE && e.u.distance + e.val < e.v.distance)
                {
                    e.v.distance = Long.MIN_VALUE;
                }
            }
        }
        if (vertices[n-1].distance == Long.MIN_VALUE)
        {
            out.println(-1);
        }
        else
        {
            out.println(Math.max(-vertices[n-1].distance, 0));
        }

        out.flush();
        in.close();
    }

    public void clear(Vertex[] vertices)
    {
        for (int i = 0; i < vertices.length; i++)
        {
            vertices[i].visited = false;
        }
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }

    private class Vertex implements Comparable<Vertex>
    {
        ArrayList<Edge> edges;
        int index;
        long distance;
        boolean visited;
        boolean cycle, reachEnd;

        public Vertex(int i)
        {
            index = i;
            edges = new ArrayList<>();
        }

        public void add(Vertex v, int val)
        {
            edges.add(new Edge(this, v, val));
        }

        public int compareTo(Vertex other)
        {
            return Long.compare(distance, other.distance);
        }
    }

    private class Edge
    {
        Vertex u, v;
        int val;

        public Edge(Vertex u, Vertex v, int val)
        {
            this.u = u;
            this.v = v;
            this.val = val;
        }
    }
}
