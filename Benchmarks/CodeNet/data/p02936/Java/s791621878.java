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
        int q = Integer.parseInt(tok.nextToken());
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++)
        {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n-1; i++)
        {
            tok = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(tok.nextToken())-1;
            int b = Integer.parseInt(tok.nextToken())-1;
            nodes[a].children.add(nodes[b]);
        }
        for (int i = 0; i < q; i++)
        {
            tok = new StringTokenizer(in.readLine());
            int p = Integer.parseInt(tok.nextToken())-1;
            int x = Integer.parseInt(tok.nextToken());
            nodes[p].value += x;
        }
        update(nodes[0], 0);
        for (int i = 0; i < n; i++)
        {
            if (i != 0)
            {
                out.print(" ");
            }
            out.print(nodes[i].value);
        }
        // out.println();

        out.flush();
        in.close();
    }

    public void update(Node curr, long add)
    {
        curr.value += add;
        for (Node next : curr.children)
        {
            update(next, curr.value);
        }
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }

    private class Node
    {
        ArrayList<Node> children;
        long value;

        public Node()
        {
            children = new ArrayList<>();
        }
    }
}
