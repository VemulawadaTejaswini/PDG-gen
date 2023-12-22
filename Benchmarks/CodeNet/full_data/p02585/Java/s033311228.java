// template for atcode
import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import java.util.stream.Collectors;

public class Main {

    private static final int MOD = (int)1e9 + 7; //998244353;
    // private static final long INF = (long)1e17;
    private static final int INF = (int)1e9;


    public Main(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] P = new int[n];
        for (int i = 0; i < n; i++) P[i] = in.nextInt() - 1;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) C[i] = in.nextInt();

        long res = (long)-1e10;
        for (int i = 0; i < n; i++) {
            int v = i;
            int cycleLen = 0;
            long cycleSum = 0;
            while (true) {
                cycleSum += C[v];
                cycleLen++;
                v = P[v];
                if (v == i) break;
            }
            int cnt = 0;
            long sum = 0;
            while (true) {
                cnt++;
                if (cnt > k) break;
              
                sum += C[v];
                res = max(res, sum + (cycleSum > 0 ? (k - cnt) / cycleLen * cycleSum : 0));

                v = P[v];
                if (v == i) break;
            }
        }
        out.println(res);
    }

    public void Main0(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] P = new int[n];
        for (int i = 0; i < n; i++) P[i] = in.nextInt() - 1;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) C[i] = in.nextInt();

        boolean[] marked = new boolean[n];
        long res = (long)-1e10;
        for (int i = 0; i < n; i++) {
            if (!marked[i]) {
                res = max(res, solve(i, k, P, C, marked));
            }
        }
        out.println(res);
    }

    private long solve(int st, int k, int[] P, int[]C, boolean[] marked) {
        List<Long> A = new ArrayList<>();
        A.add(0L);
        int cur = st;
        long sum = 0;
        do {
            marked[cur] = true;
            cur = P[cur];
            sum += C[cur];
            A.add(sum);
        } while (cur != st);

        int len = A.size() - 1;
        for (int i = 1; i <= len; i++) {
            A.add(sum + A.get(i));
        }
        System.out.println(A);
        // long res = (long)-1e10;
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(0);
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i < A.size(); i++) {
            if (!dq.isEmpty() && i - dq.getFirst() > min(len, k))
                dq.removeFirst();
            long x = A.get(i);
            // long y = 0;
            // if (!dq.isEmpty()) y = A.get(dq.getFirst());
            // res = max(res, x - y);
            int prev = dq.getFirst();
            lst.add(prev);

            while (!dq.isEmpty() && A.get(dq.getLast()) >= x) {
                dq.removeLast();
            }

            dq.addLast(i);
        }
        long res = (long)-1e18;
        for (int i = 1; i < A.size(); i++) {
            int cnt = i - lst.get(i - 1);
            long x = A.get(i), y = A.get(lst.get(i - 1));
            System.out.printf("i=%d, cnt=%d, x=%d, y=%d, x - y=%d%n",i, cnt, x, y, x - y);
            res = max(res, x - y + (sum > 0 ? (k - cnt) / len * sum : 0));
        }
        System.out.printf("%s,len=%d,sum=%d,res=%d%n", lst, len, sum, res);
        return res;
    }


    private int gcd(int a, int b) {
        while (true) {
            if (b == 0) return a;
            int tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    private long gcd(long a, long b) {
        while (true) {
            if (b == 0) return a;
            long tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    private long powm(long x, long p) {
        long res = 1;
        while (p > 0) {
            if (p % 2 == 1)
                res = res * x % MOD;
            x = x * x % MOD;
            p /= 2;
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

// Pair
class Pair<T extends Comparable<? super T>, U extends Comparable<? super U>> implements Comparable<Pair<T, U>> {
    T a;
    U b;
    Pair() { }
    Pair(T a, U b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() { return "("+a.toString()+", "+b.toString()+")"; }

    @Override
    public int hashCode() { return Objects.hash(a, b); }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Pair that = (Pair) obj;
        if(this.a.getClass() != that.a.getClass()) return false;
        if(this.b.getClass() != that.b.getClass()) return false;
        if(!this.a.equals(that.a)) return false;
        if(!this.b.equals(that.b)) return false;
        return true;
    }

    @Override
    public int compareTo(Pair<T, U> that) {
        int c = (this.a).compareTo(that.a);
        if(c == 0) c = (this.b).compareTo(that.b);
        return c;
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
