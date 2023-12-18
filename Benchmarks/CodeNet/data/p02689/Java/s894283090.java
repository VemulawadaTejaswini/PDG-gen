import java.util.*;
import java.io.*;

public class Main {


    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int[] H = new int[N];
        Integer[] hOrder = new Integer[N];
        for (int i = 0; i < N; i++) {
            H[i] = in.nextInt();
            hOrder[i] = i;
        }
        Arrays.sort(hOrder, Comparator.<Integer>comparingInt(i -> H[i]).reversed());

        List<Integer>[] adj = new List[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList();
        }
        
        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            adj[a].add(b);
            adj[b].add(a);
        }

        boolean[] bad = new boolean[N];
        int res = 0;
        for (int i : hOrder) {
            if (!bad[i]) {
                boolean highest = true;
                for (int j : adj[i]) {
                    if (H[j] == H[i]) highest = false;
                    bad[j] = true;
                }
                if (highest) res++;
            }
        }
        out.println(res);

    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        Main sol = new Main(in, out);

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
