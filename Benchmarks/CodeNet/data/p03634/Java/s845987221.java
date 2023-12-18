import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N,Q,K;
    int[] x,y;
    ArrayList<Node>[] G;
    long[] minDis;

    private class Node {
        int to;
        long d;
        public Node(int to,long d){
            this.to = to;
            this.d = d;
        }
    }

    @SuppressWarnings("unchecked")
    private void solve() {
        N = nextInt();
        G = new ArrayList[N];

        for(int i = 0;i < N;i++){
            G[i] = new ArrayList<>();
        }

        for(int i = 0;i < N-1;i++){
            int a = nextInt()-1;
            int b = nextInt()-1;
            int c = nextInt();

            G[a].add(new Node(b,c));
            G[b].add(new Node(a,c));
        }

        Q = nextInt();
        K = nextInt()-1;

        x = new int[Q];
        y = new int[Q];
        for(int i = 0;i < Q;i++){
            x[i] = nextInt()-1;
            y[i] = nextInt()-1;
        }

        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(new Node(K,0));

        minDis = new long[N];
        Arrays.fill(minDis,Long.MAX_VALUE);

        while(q.size() > 0) {
            Node now = q.poll();
            if(minDis[now.to] != Long.MAX_VALUE)continue;
            minDis[now.to] = now.d;

            for(Node next : G[now.to]) {
                if(minDis[next.to] != Long.MAX_VALUE)continue;
                q.add(new Node(next.to,minDis[now.to] + next.d));
            }
        }

        for(int i = 0;i < Q;i++){
            out.println(minDis[x[i]] + minDis[y[i]]);
        }
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}