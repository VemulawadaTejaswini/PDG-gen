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
        ArrayList<Integer> list = new ArrayList<>();
        ntok();
        for (int i = 0; i < (1 << n); i++)
        {
            list.add(ipar());
        }
        Collections.sort(list);
        Collections.reverse(list);
        boolean works = true;
        OUTER:
        for (int i = 0; i < n; i++)
        {
            int shift = 1 << i;
            for (int j = 0; j < shift; j++)
            {
                if (list.get(j) <= list.get(j+shift))
                {
                    works = false;
                    break OUTER;
                }
            }
        }
        if (works)
        {
            out.println("Yes");
        }
        else
        {
            out.println("No");
        }

        out.flush();
        in.close();
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
