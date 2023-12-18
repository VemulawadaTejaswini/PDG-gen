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
        int[][] mat = new int[n][n-1];
        for (int i = 0; i < n; i++)
        {
            ntok();
            for (int e = 0; e < n-1; e++)
            {
                mat[i][e] = ipar()-1;
            }
        }
        int left = n * (n-1);
        LinkedList<State> queue = new LinkedList<>();
        for (int i = 0; i < n; i++)
        {
            queue.add(new State(i, 1));
        }
        int day = 0;
        HashSet<Integer> play = new HashSet<>();
        int[] pIndex = new int[n];
        HashSet<State> visited = new HashSet<>();
        while (!queue.isEmpty())
        {
            State curr = queue.remove();
            if (visited.contains(curr))
            {
                continue;
            }
            visited.add(curr);
            if (curr.day != day)
            {
                day++;
                for (int x : play)
                {
                    pIndex[x]++;
                    left--;
                }
                play.clear();
            }
            if (pIndex[curr.p] == n-1)
            {
                continue;
            }
            int opp = mat[curr.p][pIndex[curr.p]];
            if (pIndex[opp] == n-1)
            {
                continue;
            }
            if (mat[opp][pIndex[opp]] == curr.p)
            {
                queue.add(new State(curr.p, curr.day+1));
                queue.add(new State(opp, curr.day+1));
                play.add(curr.p);
                play.add(opp);
            }
        }
        if (left == 0)
        {
            out.println(day-1);
        }
        else
        {
            out.println(-1);
        }

        out.flush();
        in.close();
    }

    private class State
    {
        int p, day;
        
        public State(int p, int day)
        {
            this.p = p;
            this.day = day;
        }

        public int hashCode()
        {
            return p + day * 1000;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof State)
            {
                State other = (State)obj;
                return other.p == p && day == other.day;
            }
            return false;
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

    public long lpar()
    {
        return Long.parseLong(tok.nextToken());
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
