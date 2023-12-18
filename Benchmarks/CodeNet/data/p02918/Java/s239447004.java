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
        int k = ipar();
        ntok();
        char[] s = spar().toCharArray();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int count = 1;
        boolean l = s[0] == 'L';
        for (int i = 1; i < n; i++)
        {
            if (s[i-1] != s[i])
            {
                if (l)
                {
                    list1.add(count);
                }
                else
                {
                    list2.add(count);
                }
                l = s[i] == 'L';
                count = 1;
            }
            else
            {
                count++;
            }
        }
        if (l)
        {
            list1.add(count);
        }
        else
        {
            list2.add(count);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if (list1.size() > list2.size())
        {
            int sum = 0;
            for (int x : list1)
            {
                sum += x;
            }
            for (int i = 0; i < list2.size() && i < k; i++)
            {
                sum += list2.get(list2.size()-i-1);
            }
            out.println(sum - (list1.size() - Math.min(list2.size(), k)));
        }
        else if (list1.size() < list2.size())
        {
            int sum = 0;
            for (int x : list2)
            {
                sum += x;
            }
            for (int i = 0; i < list1.size() && i < k; i++)
            {
                sum += list1.get(list1.size()-i-1);
            }
            out.println(sum - (list2.size() - Math.min(list1.size(), k)));
        }
        else
        {
            int sum1 = 0;
            for (int x : list1)
            {
                sum1 += x;
            }
            for (int i = 0; i < list2.size() && i < k; i++)
            {
                sum1 += list2.get(list2.size()-i-1);
            }
            int sum2 = 0;
            for (int x : list2)
            {
                sum2 += x;
            }
            for (int i = 0; i < list1.size() && i < k; i++)
            {
                sum2 += list1.get(list1.size()-i-1);
            }
            out.println(Math.max(sum1 - Math.max(list1.size() - Math.min(list2.size(), k), 1), sum2 - Math.max(list2.size() - Math.min(list1.size(), k), 1)));
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
