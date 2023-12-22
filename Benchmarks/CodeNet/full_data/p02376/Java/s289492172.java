package Libraries.Graphs;
import java.util.*;
import java.io.*;
public class MaxFlow {
    static int n , s , t , m , a , b , c;
    static long[] flo;
    static ArrayList<Integer>[] graph;
    static long ans;
    static int[] prev , to;
    static boolean[] seen;
    static LinkedList<Step> bfs;
    public static void main(String[] args){
        FastScanner in = new FastScanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        prev = new int[2*m];
        to = new int[2*m];
        flo = new long[2*m];
        graph = new ArrayList[n];
        for(int i = 0;i < n; i++)graph[i] = new ArrayList<Integer>();
        for(int i = 0;i < m; i++){
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            flo[i] = c;
            flo[m+i] = 0;
            graph[a].add(i);
            graph[b].add(m+i);
            to[i] = b;
            to[i+m] = a;
        }
        calcflo(0 , n-1);
        System.out.println(ans);
    }
    public static void calcflo(int a , int b){
        s = a;
        t = b;
        prev = new int[n];
        while(sendFlo()){}
    }
    public static boolean sendFlo(){
        Arrays.fill(prev , -1);
        bfs = new LinkedList<Step>();
        bfs.add(new Step(s , Long.MAX_VALUE));
        Step temp;
        while(!bfs.isEmpty()){
            temp = bfs.removeFirst();
            if (temp.ind == t) {
                int tmp = t;
                ans += temp.cflo;
                while (tmp != s) {
                    flo[prev[tmp]] += temp.cflo;
                    flo[prev[tmp]%m + (1 - prev[tmp] / m) * m] -= temp.cflo;
                    tmp = to[prev[tmp]];
                }
                return true;
            }
            for (int ed : graph[temp.ind]) {
                if (prev[to[ed]] == -1 && flo[ed] > 0) {
                    prev[to[ed]] = ed%m + (1 - ed / m) * m;
                    bfs.add(new Step(to[ed], Math.min(flo[ed], temp.cflo)));
                }
            }
        }
        return false;
    }
    static class Step{
        int ind;
        long cflo;
        public Step(int a , long b){
            ind = a;
            cflo = b;
        }
    }
    private static class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
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

        public String next() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
