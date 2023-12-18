

import java.io.*;
import java.util.*;

/**
 * @author baito
 */
public class Main
{
    static StringBuilder sb = new StringBuilder();
    static FastScanner sc = new FastScanner(System.in);
    static int N;
    static int[] A;

    public static void main(String[] args)
    {
        N = sc.nextInt();
        int sum = 0;
        int keta = 0;
        int tempN = N;
        while(tempN > 0){
            tempN /= 10;
            keta++;
        }
        tempN = N;
        int tamesu ;
        tamesu = tempN / (int)Math.pow(10,keta-2);
        if(tamesu == 10){
            sum += 10;
            N -= 10 * (int)Math.pow(10,keta-2);
        }

        //longを忘れるなオーバーフローするぞ
        while (N > 0)
        {
            sum += N % 10;
            N /= 10;
        }
        System.out.println(sum);


    }

    static int gcd(int n, int r)
    {
        return r == 0 ? n : gcd(r, n % r);
    }

    static long gcd(long n, long r)
    {
        return r == 0 ? n : gcd(r, n % r);
    }

    static <T> void swap(T[] x, int i, int j)
    {
        T t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    static void swap(int[] x, int i, int j)
    {
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    public static void reverse(int[] x)
    {
        int l = 0;
        int r = x.length - 1;
        while (l < r)
        {
            int temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    public static void reverse(int[] x, int s, int e)
    {
        int l = s;
        int r = e;
        while (l < r)
        {
            int temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    static int length(int a)
    {
        int cou = 0;
        while (a != 0)
        {
            a /= 10;
            cou++;
        }
        return cou;
    }

    static int length(long a)
    {
        int cou = 0;
        while (a != 0)
        {
            a /= 10;
            cou++;
        }
        return cou;
    }

    static int countC2(char[][] a, char c)
    {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] == c) co++;
        return co;
    }

    static void fill(int[][] a, int v)
    {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = v;
    }

    static class FastScanner
    {

        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in)
        {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next()
        {
            if (tokenizer == null || !tokenizer.hasMoreTokens())
            {
                try
                {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        /*public String nextChar(){
            return (char)next()[0];
        }*/
        public String nextLine()
        {
            if (tokenizer == null || !tokenizer.hasMoreTokens())
            {
                try
                {
                    return reader.readLine();
                } catch (IOException e)
                {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong()
        {
            return Long.parseLong(next());
        }

        public int nextInt()
        {
            return Integer.parseInt(next());
        }

        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n)
        {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = nextInt();
            }
            return a;
        }

        public int[][] nextIntArray2(int h, int w)
        {
            int[][] a = new int[h][w];
            for (int hi = 0; hi < h; hi++)
            {
                for (int wi = 0; wi < w; wi++)
                {
                    a[hi][wi] = nextInt();
                }
            }
            return a;
        }

        public Integer[] nextIntegerArray(int n)
        {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = nextInt();
            }
            return a;
        }

        public char[] nextCharArray(int n)
        {
            char[] a = next().toCharArray();

            return a;
        }

        public char[][] nextCharArray2(int h, int w)
        {
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++)
            {
                a[i] = next().toCharArray();
            }
            return a;
        }

        //スペースが入っている場合
        public char[][] nextCharArray2s(int h, int w)
        {
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++)
            {
                a[i] = nextLine().replace(" ", "").toCharArray();
            }
            return a;
        }

        public char[][] nextWrapCharArray2(int h, int w, char c)
        {
            char[][] a = new char[h + 2][w + 2];
            //char c = '*';
            int i;
            for (i = 0; i < w + 2; i++)
                a[0][i] = c;
            for (i = 1; i < h + 1; i++)
            {
                a[i] = (c + next() + c).toCharArray();
            }
            for (i = 0; i < w + 2; i++)
                a[h + 1][i] = c;
            return a;
        }

        //スペースが入ってる時用
        public char[][] nextWrapCharArray2s(int h, int w, char c)
        {
            char[][] a = new char[h + 2][w + 2];
            //char c = '*';
            int i;
            for (i = 0; i < w + 2; i++)
                a[0][i] = c;
            for (i = 1; i < h + 1; i++)
            {
                a[i] = (c + nextLine().replace(" ", "") + c).toCharArray();
            }
            for (i = 0; i < w + 2; i++)
                a[h + 1][i] = c;
            return a;
        }

        public long[] nextLongArray(int n)
        {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = nextLong();
            }
            return a;
        }

        public long[][] nextLongArray2(int h, int w)
        {
            long[][] a = new long[h][w];
            for (int hi = 0; hi < h; hi++)
            {
                for (int wi = 0; wi < h; wi++)
                {
                    a[h][w] = nextLong();
                }
            }
            return a;
        }
    }
}
