import java.util.*;
import java.io.*;



public class Main {
    static OutputWriter out;
    
    public static void main(String[] args)
    {
        InputReader in = new InputReader(System.in);
        out = new OutputWriter(System.out);
        int n =in.nextInt();
        long[]h=new long[n];
        long[]p=new long[n];
        pair[]arr = new pair[n];
        for (int i =0;i<n;i++)
        {
            h[i]=in.nextLong();
            p[i]=in.nextLong();
            arr[i]=new pair(h[i],p[i]);
        }
       Arrays.sort(arr);
        for (int i =0;i<n;i++)
        {
            h[i]=arr[i].to;
            p[i]=arr[i].dist;
        }
        long[][]dp = new long[n][n];


        for (int i =0;i<n;i++)
            dp[i][0]=p[i];
        for (int i=0;i<n;i++)
        {
            for (int j =i+1;j<n;j++)
                dp[i][j]=Long.MAX_VALUE/100;
        }
        for (int i =0;i<n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if (dp[i-1][j-1]>h[i])
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1]+p[i]);
                }
            }
        }
        int ans=0;
        for (int i=n-1;i>=0;i--)
        {
            for (int j =0;j<n;j++)
            {
                if (dp[j][i]!=Long.MAX_VALUE/100)
                {
                    ans = i;
                    break;
                }
            }
            if (ans>0)
                break;
        }
        out.printLine(ans+1);

        out.flush();
    }

}
class MyScanner {

    StringTokenizer st;
    BufferedReader br;

    public MyScanner(InputStream s) {
        br = new BufferedReader(new InputStreamReader(s));
    }

    public MyScanner (FileReader f) {
        br = new BufferedReader(f);
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public double nextDouble() throws IOException {
        String x = next();
        StringBuilder sb = new StringBuilder("0");
        double res = 0, f = 1;
        boolean dec = false, neg = false;
        int start = 0;
        if (x.charAt(0) == '-') {
            neg = true;
            start++;
        }
        for (int i = start; i < x.length(); i++)
            if (x.charAt(i) == '.') {
                res = Long.parseLong(sb.toString());
                sb = new StringBuilder("0");
                dec = true;
            } else {
                sb.append(x.charAt(i));
                if (dec)
                    f *= 10;
            }
        res += Long.parseLong(sb.toString()) / f;
        return res * (neg ? -1 : 1);
    }

    public boolean ready() throws IOException {
        return br.ready();
    }

    public boolean nextEmpty() throws IOException {
        String s = nextLine();
        st = new StringTokenizer(s);
        return s.isEmpty();
    }
}


class pair  implements Comparable
{
    long dist;
    long to;
    public pair(long to, long dist)
    {
        this.dist = dist;
        this.to = to;
    }
    @Override
    public int compareTo(Object o) {
        pair temp =(pair)o;
        return Long.compare(dist+to,temp.dist+temp.to);
    }
}
class Graph {


    int n;
    ArrayList<Integer>[] adjList;

    public Graph(int n) {
        this.n = n;
        adjList = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adjList[i] = new ArrayList<>();
    }

}



class InputReader {

    private final InputStream stream;
    private final byte[] buf = new byte[8192];
    private int curChar, snumChars;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (snumChars == -1)
            throw new InputMismatchException();
        if (curChar >= snumChars) {
            curChar = 0;
            try {
                snumChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (snumChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public int nextInt() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public long nextLong() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public int[] nextIntArray(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    public String readString() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String nextLine() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndOfLine(c));
        return res.toString();
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private boolean isEndOfLine(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

}

class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }


    public void printLine(Object... objects) {
        print(objects);
        writer.println();
    }

    public void close() {
        writer.close();
    }

    public void flush() {
        writer.flush();
    }

}
