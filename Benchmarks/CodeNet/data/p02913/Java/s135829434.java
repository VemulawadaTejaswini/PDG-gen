import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        ntok();
        String s = spar();
        Trie trie = new Trie();
        for (int i = 0; i < n; i++)
        {
            trie.add(s, i);
        }
        out.println(trie.max());

        out.flush();
        in.close();
    }

    private class Trie
    {
        Node root;
        int n;

        public Trie()
        {
            root = new Node();
        }

        public void add(String s, int i)
        {
            root.add(s, i);
            n = s.length();
        }

        public int max()
        {
            return root.max(0);
        }
        
        private class Node
        {
            HashMap<Character, Node> children;
            boolean end;
            int count;

            public Node()
            {
                children = new HashMap<>();
            }

            private void add(String s, int i)
            {
                count++;
                if (i == s.length())
                {
                    end = true;
                    return;
                }
                if (!children.containsKey(s.charAt(i)))
                {
                    children.put(s.charAt(i), new Node());
                }
                Node child = children.get(s.charAt(i));
                child.add(s, i+1);
            }

            private int max(int i)
            {
                int max = 0;
                if (end && count > 1 && i * 2 <= n)
                {
                    max = Math.max(max, i);
                }
                for (Map.Entry<Character, Node> entry : children.entrySet())
                {
                    max = Math.max(max, entry.getValue().max(i+1));
                }
                return max;
            }
        }
    }

    public void ntok() throws IOException
    {
        tok = new StringTokenizer(in.readLine());
    }

    public int ipar()
    {
        return Integer.parseInt(tok.nextToken());
    }

    public int[] iapar(int n)
    {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = ipar();
        }
        return arr;
    }

    public long lpar()
    {
        return Long.parseLong(tok.nextToken());
    }

    public long[] lapar(int n)
    {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = lpar();
        }
        return arr;
    }

    public double dpar()
    {
        return Double.parseDouble(tok.nextToken());
    }

    public String spar()
    {
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
