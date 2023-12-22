import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int t, n, i, j, k, m, inf = (int)1e9;
    public static int[][] mat = new int[1005][1005];
    public static String s;
    public static void main(String[] args) throws IOException
    {
        FastScanner sc = new FastScanner();
        Print print = new Print();
        n = sc.nextInt();
        m = sc.nextInt();
        int sx = sc.nextInt(), sy = sc.nextInt();
        int ex = sc.nextInt(), ey = sc.nextInt();
        sx--;
        sy--;
        ex--;
        ey--;
        ArrayDeque<Integer> qx = new ArrayDeque<>();
        ArrayDeque<Integer> qy = new ArrayDeque<>();
        int[][] jump = new int[1005][1005];
        for(i = 0; i < n; i++)
        {
            Arrays.fill(jump[i], inf);
            s = sc.next();
            for(j = 0; j < m; j++)
                mat[i][j] = s.charAt(j) == '.'? 1: 0;
        }
        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};
        qx.addLast(sx);
        qy.addLast(sy);
        jump[sx][sy] = 0;
        while(!qx.isEmpty())
        {
            int a = qx.remove();
            int b = qy.remove();
            for(int k = 0; k < 4; k++)
            {
                i = x[k] + a;
                j = y[k] + b;
                if(valid(i, j))
                {
                    if(jump[i][j] > jump[a][b])
                    {
                        jump[i][j] = jump[a][b];
                        qx.addLast(i);
                        qy.addLast(j);
                    }
                }
            }
            for(int k = -2; k < 3; k++)
                for(int l = -2; l < 3; l++)
                {
                    i = a + k;
                    j = b + l;
                    if(valid(i, j))
                    {
                        if(jump[i][j] > jump[a][b] + 1)
                        {
                            jump[i][j] = jump[a][b] + 1;
                            qx.addFirst(i);
                            qy.addFirst(j);
                        }
                    }
                }
        }
        if(jump[ex][ey] == inf)
            print.integer(-1);
        else
            print.integer(jump[ex][ey]);
        out.close();
    }

    public static boolean valid(int a, int b)
    {
        return (a >= 0 && a < n) && (b >= 0 && b < m) && (mat[a][b] == 1);
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
