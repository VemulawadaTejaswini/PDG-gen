import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = 998244353;

    private List<Integer>[] adj;
    public Main(FastScanner in, PrintWriter out, int test) {
        int N = in.nextInt();
        int M = in.nextInt();

        adj = new List[N];
        for (int i = 0; i < N; i++)
            adj[i] = new ArrayList();

        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            adj[a].add(b);
            adj[b].add(a);
        }

        int[] to = new int[N];
        Arrays.fill(to, -1);

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(0);

        int visited = 0;

        while (!q.isEmpty()) {
            int u = q.remove();
            visited++;
            for (int v : adj[u]) {
                if (to[v] >= 0) continue;
                q.offer(v);
                to[v] = u;
            }
        }
        if (visited < N) {
            out.println("No");
        } else {
            out.println("Yes");
            for (int i = 1; i < N; i++)
                out.println(to[i] + 1);
        }
    }

    private long pow(int x, int p) {
        long res = 1, a = x;
        while (p > 1) {
            if (p % 2 == 1)
                res = res * a % MOD;

            a = a * a % MOD;
            p /= 2;
        }
        res  = res * a % MOD;
        return res;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        // int T = in.nextInt();
        for (int t = 1; t <= 1; t++) {
            Main sol = new Main(in, out, t);
        }

        out.close();
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}
