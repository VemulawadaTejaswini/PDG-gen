import java.io.*;
import java.util.*;

public class Main
{
    static IO io = new IO(System.in);
    static int n, q, k;
    static String s;

    //static SegmentTree st = new SegmentTree();

    public static void main(String[] args) throws Exception
    {
        int i, j;

        n = io.nextInt();
        s = io.next().toUpperCase();
        q = io.nextInt();

        for(i = 0; i < q; ++i)
        {
            //st = new SegmentTree();
            //st.segmentify(n);
            k = io.nextInt();
            long ans = 0;

            long[] pair = new long[2];
            int countM = 0;
            for(j = 0; j < n; ++j)
            {
                if(j - k >= 0)
                {
                    char ch = s.charAt(j - k);
                    if(ch == 'D')
                    {
                        --pair[0];
                        pair[1] -= countM;
                    }
                    else if(ch == 'M')
                        --countM;
                }

                char ch = s.charAt(j);
                if(ch == 'D')
                    ++pair[0];
                else if(ch == 'M')
                {
                    pair[1] += pair[0];
                    ++countM;
                }
                else if(ch == 'C')
                    ans += pair[1];

                /*if(s.charAt(j) == 'D')
                    st.ptUpdate(j, 0, 1);
                else if(s.charAt(j) == 'M')
                    st.ptUpdate(j, 1, st.rangeQuery(Math.max(0, j - k + 1), j, 0));
                else if(s.charAt(j) == 'C')
                    ans += st.rangeQuery(Math.max(0, j - k + 1), j, 1);


                System.out.println(st);
                /*for(i = 0; i < n; ++i)
                    System.out.print("(" + st.rangeQuery(i, i, 0)
                            + st.rangeQuery(i, i, 1) + ") ");
                System.out.println();*/
            }


            io.println(ans);
        }

        io.flush();
    }
}



class SegmentTree
{
    static final int MAXN = 1000_006;
    final long dummyNode = 0;

    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for(long[][] row : segTree)
        {
            for(long[] col : row)
                sb.append(Arrays.toString(col)).append(" ");
            sb.append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }

    long[] nodeToNode(long[] a, long[] b)
    {
        return new long[] {a[0] + b[0], a[1] + b[1]};
    }

    long[][][] segTree;

    void segmentify(int len)
    {
        int i, j;
        i = clLog2(len) + 1;
        segTree = new long[i][][];

        segTree[0] = new long[len][2];

        for (i = 1; i < segTree.length; ++i)
        {
            j = (segTree[i - 1].length + 1) >> 1;
            segTree[i] = new long[j][2];
        }
    }

    void fillTreeAt(int i, int j)
    {
        if ((j << 1) + 1 >= segTree[i - 1].length)
            segTree[i][j] = segTree[i - 1][j << 1];
        else
            segTree[i][j] = nodeToNode(segTree[i - 1][j << 1], segTree[i - 1][(j << 1) + 1]);
    }

    void ptUpdate(int index, int offset, long val)
    {
        segTree[0][index][offset] = val;
        for (int i = 1; i < segTree.length; ++i)
            fillTreeAt(i, index >>= 1);
    }

    int[][] stack = new int[2][MAXN];

    long rangeQuery(int ti, int tj, int offset)
    {
        long ans = dummyNode;

        if (ti > tj)
            return ans;

        int top = 0, p, q, i, j;
        stack[0][top] = segTree.length - 1;
        stack[1][top] = 0;
        ++top;
        while (top > 0)
        {
            --top;
            p = stack[0][top];
            q = stack[1][top];
            i = (1 << p) * q;
            j = (1 << p) * (q + 1) - 1;

            if (ti > j || tj < i) continue;
            if (ti <= i && tj >= j)
                ans += segTree[p][q][offset];
            else
            {
                --p;
                q <<= 1;
                stack[0][top] = p;
                stack[1][top] = q;
                ++top;
                if (q + 1 < segTree[p].length)
                {
                    stack[0][top] = p;
                    stack[1][top] = q + 1;
                    ++top;
                }
            }
        }
        return ans;
    }

    int clLog2(int num)
    {
        --num;
        num |= num >> 1;
        num |= num >> 2;
        num |= num >> 4;
        num |= num >> 8;
        num |= num >> 16;
        return Integer.bitCount(num);
    }
}

class IO
{
    static byte[] buf = new byte[2048];
    static int index, total;
    static InputStream in;
    static StringBuilder sb = new StringBuilder();


    IO(InputStream is)
    {
        in = is;
    }

    int scan() throws Exception
    {
        if (index >= total)
        {
            index = 0;
            total = in.read(buf);
            if (total <= 0)
                return -1;
        }
        return buf[index++];
    }

    String next() throws Exception
    {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan())
            sb.append((char) c);
        return sb.toString();
    }

    int nextInt() throws Exception
    {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    long nextLong() throws Exception
    {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    void print(Object a)
    {
        sb.append(a.toString());
    }

    void println(Object a)
    {
        sb.append(a.toString()).append("\n");
    }

    void println()
    {
        sb.append("\n");
    }

    void flush()
    {
        System.out.print(sb);
        sb = new StringBuilder();
    }
}