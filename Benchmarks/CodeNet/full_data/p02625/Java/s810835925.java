import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    //class  Declaration

    static class pair implements Comparable < pair > {
        long x;
        long y;


        pair(long i, long j) {
            x = i;
            y = j;


        }
        public int compareTo(pair p) {
            if (this.x != p.x) {
                return Long.compare(this.x,p.x);
            } else {
                return Long.compare(this.y,p.y);
            }
        }
        public int hashCode() {
            return (x + " " + y).hashCode();
        }
        public String toString() {
            return x + " " + y;
        }
        public boolean equals(Object o) {
            pair x = (pair) o;
            return (x.x == this.x && x.y == this.y);
        }
    }
    // int[] dx = {0,0,1,-1};
    // int[] dy = {1,-1,0,0};
    // int[] ddx = {0,0,1,-1,1,-1,1,-1}; 
    // int[] ddy = {1,-1,0,0,1,-1,-1,1};

int inf = (int) 1e9 + 9;
long biginf  = (long)1e17 + 7 ;
long mod =  (int)1e9 + 7;  
int N = (int)5e5+5;
long[] fact = new long[N+1];
long[] ifact = new long[N+1];

void solve() throws Exception {
    init();
    long n=nl(),m=nl();
    long ans = nCr(m,n)*fact[(int)n]%mod;

    for(int i=1;i<=n;++i){

        if(i%2==1){
            ans = (ans +mod - ((nCr(n,i)*fact[(int)n-i])%mod * nCr(m-i,n-i))%mod)%mod;  
        }
        else{
            ans = (ans + ((nCr(n,i)*fact[(int)n-i])%mod * nCr(m-i,n-i))%mod)%mod;  
        }
        
    }
    ans = (ans * (nCr(m,n)*fact[(int)n]%mod))%mod ;
    pn(ans);


    
    
}
void init(){

	fact[0] =1 ;
	ifact[0] = 1 ;
	for(int i=1;i<=N;++i){
		fact[i] = (fact[i-1] * i )%mod ; 
		ifact[i] = pow(fact[i],mod-2) ; 
	}

}
long nCr (long n,long r){
	long ans =1 ;
	
	if(r>n || r< 0) return 0L ;

	ans = (ans*fact[(int)n])%mod ;
	ans= (ans*ifact[(int)(n-r)])%mod ;
	ans= (ans*ifact[(int)r])%mod ;
	return ans ; 
	
}


    long pow(long a, long b) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) result = (result * a) % mod;
            b /= 2;
            a = (a * a) % mod;
        }
        return result;
    }


    void print(Object o) {
        System.out.println(o);
        System.out.flush();
    }



    long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    void run() throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);

        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if (!INPUT.isEmpty()) tr(System.currentTimeMillis() - s + "ms");
    }


    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    //output methods
    private void pn(Object o) {
        out.println(o);
    }
    private void p(Object o) {
        out.print(o);
    }
    private ArrayList < ArrayList < Integer >> ng(int n, int e) {
        ArrayList < ArrayList < Integer >> g = new ArrayList < > ();
        for (int i = 0; i <= n; ++i) g.add(new ArrayList < > ());

        for (int i = 0; i < e; ++i) {
            int u = ni(), v = ni();
            g.get(u).add(v);
            g.get(v).add(u);
        }

        return g;
    }

    private ArrayList < ArrayList < pair >> nwg(int n, int e) {
        ArrayList < ArrayList < pair >> g = new ArrayList < > ();
        for (int i = 0; i <= n; ++i) g.add(new ArrayList < > ());

        for (int i = 0; i < e; ++i) {
            int u = ni(), v = ni(), w = ni();
            g.get(u).add(new pair(w, v));
            g.get(v).add(new pair(w, u));
        }

        return g;
    }


    //input methods
    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;


    private int readByte() {
        if (lenbuf == -1) throw new InputMismatchException();
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) return -1;
        }
        return inbuf[ptrbuf++];
    }




    private boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }
    private int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b));
        return b;
    }

    private double nd() {
        return Double.parseDouble(ns());
    }
    private char nc() {
        return (char) skip();
    }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for (int i = 0; i < n; i++) map[i] = ns(m);
        return map;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = ni();
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private void tr(Object...o) {
        if (INPUT.length() > 0) System.out.println(Arrays.deepToString(o));
    }
    void watch(Object...a) throws Exception {
        int i = 1;
        print("watch starts :");
        for (Object o: a) {
            //print(o);
            boolean notfound = true;
            if (o.getClass().isArray()) {

                String type = o.getClass().getName().toString();
                //print("type is "+type);
                switch (type) {
                    case "[I":
                        {
                            int[] test = (int[]) o;
                            print(i + " " + Arrays.toString(test));
                            break;
                        }
                    case "[[I":
                        {
                            int[][] obj = (int[][]) o;

                            print(i + " " + Arrays.deepToString(obj));
                            break;
                        }
                    case "[J":
                        {

                            long[] obj = (long[]) o;
                            print(i + " " + Arrays.toString(obj));
                            break;
                        }
                    case "[[J":
                        {

                            long[][] obj = (long[][]) o;
                            print(i + " " + Arrays.deepToString(obj));
                            break;
                        }
                    case "[D":
                        {

                            double[] obj = (double[]) o;
                            print(i + " " + Arrays.toString(obj));
                            break;
                        }
                    case "[[D":
                        {

                            double[][] obj = (double[][]) o;
                            print(i + " " + Arrays.deepToString(obj));
                            break;
                        }
                    case "[Ljava.lang.String":
                        {

                            String[] obj = (String[]) o;
                            print(i + " " + Arrays.toString(obj));
                            break;
                        }
                    case "[[Ljava.lang.String":
                        {

                            String[][] obj = (String[][]) o;
                            print(i + " " + Arrays.deepToString(obj));
                            break;
                        }
                    case "[C":
                        {
                            char[] obj = (char[]) o;
                            print(i + " " + Arrays.toString(obj));
                            break;
                        }
                    case "[[C":
                        {

                            char[][] obj = (char[][]) o;
                            print(i + " " + Arrays.deepToString(obj));
                            break;
                        }



                    default:
                        {
                            print(i + " type not identified");
                            break;
                        }
                }
                notfound = false;

            }
            if (o.getClass() == ArrayList.class) {
                print(i + " al: " + o);
                notfound = false;
            }
            if (o.getClass() == HashSet.class) {
                print(i + " hs: " + o);
                notfound = false;
            }
            if (o.getClass() == TreeSet.class) {
                print(i + " ts: " + o);
                notfound = false;
            }
            if (o.getClass() == TreeMap.class) {
                print(i + " tm: " + o);
                notfound = false;
            }
            if (o.getClass() == HashMap.class) {
                print(i + " hm: " + o);
                notfound = false;
            }
            if (o.getClass() == LinkedList.class) {
                print(i + " ll: " + o);
                notfound = false;
            }
            if (o.getClass() == PriorityQueue.class) {
                print(i + " pq : " + o);
                notfound = false;
            }
            if (o.getClass() == pair.class) {
                print(i + " pq : " + o);
                notfound = false;
            }

            if (notfound) {
                print(i + " unknown: " + o);
            }
            i++;
        }
        print("watch ends ");
    }

}