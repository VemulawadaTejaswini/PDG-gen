import java.util.*;
import java.io.*;

public class Main {
    static void checker(boolean x) throws Exception {
        if(!x) {
            Exception e = new Exception();
            throw e;
        } 
    }
    static int [] t = new int [500010 * 4];
    static int [] a = new int [500010];
    static int [] p = new int [500010];

    static int n, k;
    final static int inf = 100000000;

    static void build(int c, int b, int e) {
        if(b == e) {
            t[c] = a[b];
            return ;
        }
        int m = (b + e) >> 1;
        int l = c << 1;
        int r = l + 1;
        build(l, b, m);
        build(r, m+1, e);
        t[c] = Math.min(t[l], t[r]);
    }
    static void update(int x, int val, int c, int b, int e) {
        if(b == e) {
            t[c] = val;
            return ;
        }
        int m = (b + e) >> 1;
        int l = c << 1;
        int r = l + 1;
        if(x <= m) update(x, val, l, b, m);
        else update(x, val, r, m +1, e);
        t[c] = Math.min(t[l], t[r]);
    }
    static int query(int x, int y, int c, int b, int e) {
        if(x <= b && e <= y) {
            return t[c];
        }
        if(y < b || e < x) return inf;
        int m = (b + e) >> 1;
        int l = c << 1;
        int r = l + 1;
        return Math.min(query(x, y, l, b, m), query(x, y, r, m+1, e));
    }
    static int query(int x, int y) {
        return query(x, y, 1, 1, n);
    }
    static void update(int x, int val) {
        update(x, val, 1, 1, n);
    }
    static int left(int block) {
        return block * k + 1;
    }
    static int right(int block) {
        return Math.min(n, block * k + k);
    }
    static int idx(int pos) {
        return (pos - 1) / k;
    }
    static boolean check(int pos) {
        return query(Math.max(1, pos - k + 1), Math.min(n, pos + k - 1)) == a[pos];
    }
    static int candidate(int b) {
        int x = query(left(b), right(b));
        if(x == inf) return -1;
        else return p[x];
    } 
    public static void main(String [] args) throws Exception {
        Reader in = new Reader ();
        Writer out = new Writer ();
        n = in.nextInt();
        k = in.nextInt();
        int [] deg = new int [n + 5];
        for(int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
            p[a[i]] = i;
        }
        build(1, 1, n);
        TreeSet <Integer> foo = new TreeSet <> (); 
        for(int i = 0; i <= idx(n); i++) {
            int can = candidate(i);
            if(can != -1 && check(can)) {
                foo.add(can);
            }
        }
        int pointer = 0;
        int ans [] = new int [n + 5];
        while(!foo.isEmpty()) {
            int x = foo.first();
            foo.remove(x);
            update(x, inf);
            for(int i = idx(x) - 1; i <= idx(x) + 1; i++) {
                if(0 <= i && i <= idx(n)) {
                    int can = candidate(i);
                    if(can != -1 && check(can)) {
                        foo.add(can);
                    }
                }
            }
            ans[x] = ++pointer;
        }
        for(int i = 1; i <= n; i++) {
            out.writeln(ans[i]);
        }
        out.flush();
    }
    static class Reader {
        private StringTokenizer a;
        private BufferedReader b;
        Reader () {
            a = null;
            b = new BufferedReader (new InputStreamReader (System.in));
        }
        public String next () {
            while(a == null || !a.hasMoreTokens()) {
                try {
                    a = new StringTokenizer (b.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return a.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(this.next());
        }
        public long nextLong () {
            return Long.parseLong(this.next());
        }
        public double nextDouble () {
            return Double.parseDouble(this.next());
        }
        public String nextLine() {
            try {
                return b.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "";
        }
    }
    static class Writer {
        private PrintWriter a;
        private StringBuffer b;
        Writer () {
            a = new PrintWriter (System.out);
            b = new StringBuffer ("");
        }
        public void write (Object s) {
            b.append(s);
        }
        public void writeln(Object s) {
            b.append(s).append('\n');
        }
        public void flush () {
            a.print(b);
            a.flush();
            a.close();
        }
    }
    static class Pair implements Comparator <Pair> {
        int first;
        int second;
        Pair  (int a, int b) {
            this.first = a;
            this.second = b;
        }
        Pair (Pair a) {
            this.first = a.first;
            this.second = a.second;
        } 
        Pair () {}
        public String toString () {
            return "[" + first + ", " + second + "]";
        }
        public int compare (Pair a, Pair b) {
            if(a.first == b.first) {
                return a.second - b.second;
            } else {
                return a.first - b.first;
            }
        }
    } 
}