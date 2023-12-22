import java.io.*;

public class Main {

    private int N;
    private int M;
    private int Q;
    private int[][] B;

    public Main(FastScanner in, PrintWriter out) {
        N = in.nextInt();
        M = in.nextInt();
        Q = in.nextInt();
        B = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            int c = in.nextInt();
            int d = in.nextInt();
            B[i][0] = a;
            B[i][1] = b;
            B[i][2] = c;
            B[i][3] = d;
        }

        out.println(dfs(1, new ArrayList<>()));
    }

    private int dfs(int i, List<Integer> A) {
        if (A.size() == N) {
            int res = 0;
            for (int[] q : B) {
                if (A.get(q[1]) - A.get(q[0]) == q[2])
                    res += q[3];
            }
            return res;
        }
        int res = 0;
        for (int j = i; j <= M; j++) {
            A.add(j);
            res = Math.max(res, dfs(j, A));
            A.remove(A.size() - 1);
        }
        return res;
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
