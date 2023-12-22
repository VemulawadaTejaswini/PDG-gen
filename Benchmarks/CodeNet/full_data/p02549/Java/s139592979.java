/*
    Java might be good for Competitive Programming but Python still rocks!!!!!!!!!


                            pppppppppppppppppppp
                         ppppp  ppppppppppppppppppp
                      ppppppp    ppppppppppppppppppppp
                      pppppppp  pppppppppppppppppppppp
                      pppppppppppppppppppppppppppppppp
                              pppppppppppppppppppppppp
       ppppppppppppppppppppppppppppppppppppppppppppppp  pppppppppppppppppppp
      pppppppppppppppppppppppppppppppppppppppppppppppp  ppppppppppppppppppppp
     ppppppppppppppppppppppppppppppppppppppppppppppppp  pppppppppppppppppppppp
    ppppppppppppppppppppppppppppppppppppppppppppppp    pppppppppppppppppppppppp
   pppppppppppppppppppppppppppppppppppppppppppppp     pppppppppppppppppppppppppp
  ppppppppppppppppppppppppppppppppppppppppppppp      pppppppppppppppppppppppppppp
  pppppppppppppppppppppppppppppppp               pppppppppppppppppppppppppppppppp
  pppppppppppppppppppppppppppp     pppppppppppppppppppppppppppppppppppppppppppppp
  ppppppppppppppppppppppppppp    pppppppppppppppppppppppppppppppppppppppppppppppp
    pppppppppppppppppppppppp  pppppppppppppppppppppppppppppppppppppppppppppppppp
     ppppppppppppppppppppppp  ppppppppppppppppppppppppppppppppppppppppppppppppp
      pppppppppppppppppppppp  ppppppppppppppppppppppppppppppppppppppppppppppp
       ppppppppppppppppppppp  ppppppppppppppppppppppppppppppppppppppppppppp
                              pppppppppppppppppppppppp
                              pppppppppppppppppppppppppppppppp
                              pppppppppppppppppppppp  pppppppp
                              ppppppppppppppppppppp    ppppppp
                                 ppppppppppppppppppp  ppppp
                                    pppppppppppppppppppp
*/


import java.util.*;
import java.lang.*;
import java.io.*;
public final class Main
{
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int t, n, i, j, k, u, v, s, mod = 998244353;
    public static void main(String[] args) throws IOException
    {
        FastScanner sc = new FastScanner();
//        Print print = new Print();
        n = sc.nextInt();
        k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(i = 0; i < k; i++)
        {
            u = sc.nextInt();
            v = sc.nextInt();
            for (j = u; j <= v; j++)
                arr.add(j);
        }
        int[] count = new int[n];
        count[0] = 1;
        for (int i = 1; i < n; i++)
            for(int j = 0; j < arr.size(); j++)
                if (i >= arr.get(j))
                    count[i] = (count[i] + count[i - arr.get(j)]) % mod;
        out.write(count[n-1]+"");
        out.close();
    }

    public static class Print
    {
        Print()
        {}

        void integer(int... arr) throws IOException
        {
            for(int value: arr)
            {
                out.write(value+" ");
                out.flush();
            }
            out.write("\n");
            out.flush();
        }

        void string(String... arr) throws IOException
        {
            for(String value: arr)
            {
                out.write(value+" ");
                out.flush();
            }
            out.write("\n");
            out.flush();
        }

        void character(char... arr) throws IOException
        {
            for(char value: arr)
            {
                out.write(value+" ");
                out.flush();
            }
            out.write("\n");
            out.flush();
        }

        void long_int(long... arr) throws IOException
        {
            for(long value: arr)
            {
                out.write(value+" ");
                out.flush();
            }
            out.write("\n");
            out.flush();
        }
    }

    static class FastScanner
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next()
        {
            while (!st.hasMoreTokens())
                try
                {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }
        int[] readArray(int n)
        {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
    }
}
