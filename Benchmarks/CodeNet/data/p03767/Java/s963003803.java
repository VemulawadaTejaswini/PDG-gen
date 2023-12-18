import java.util.*;
import java.io.*;

class ColorBall {
    static int [] c = new int [200010];
    static int [] w = new int [200010];
    static long [] fac = new long [200010];
    static int mod = 1000000000 + 7;

    static long modpow(long b, int e) {
        if(e == 0) return 1;
        if((e & 1) == 1) return (modpow(b, e-1) * b) % mod;
        long m = modpow(b, e >> 1);
        return (m * m) % mod; 
    }
    static long inverse(long x) {
        return modpow(x, mod - 2);
    }
    static class Dsu {
        int [] par;
        ArrayList <Integer> [] t; 

        Dsu (int n) {
            par = new int [n + 5];
            t = new ArrayList [n + 5];
            for(int i = 0; i <= n; i++) {
                t[i] = new ArrayList <> ();
                par[i] = i;
                t[i].add(c[i]);
            }
        }
        void merge(int p, int q) {
            p = root(p);
            q = root(q);
            if(t[p].size() > t[q].size()) {
                int temp = p;
                p = q;
                q = temp;
            }
            if(p == q) return ;
            par[p] = q;
            for(Integer i : t[p]) {
                t[q].add(i);
            }
            t[p].clear();
        }
        int root(int p) {
            if(par[p] == p) return p;
            else return par[p] = root(par[p]);
        }
        long size(int p) {
            TreeMap <Integer, Integer> s = new TreeMap <> ();
            for(Integer i : t[root(p)]) {
                if(s.containsKey(i)) {
                    s.put(i, s.get(i) + 1);
                } else {
                    s.put(i, 1);
                }
            }
            long ans = fac[ t[root(p)].size() ];
            for(Map.Entry <Integer, Integer>  i : s.entrySet()) {
                ans *= inverse( fac[i.getValue()] );
                ans %= mod;
            }
            return ans;
        }
    }
    static ArrayList <Pair> [] g = new ArrayList [200010];

    public static void main(String [] args) {
        Reader in = new Reader ();
        Writer out = new Writer ();

        int n = in.nextInt();
        int x, y;
        x = in.nextInt();
        y = in.nextInt();

        for(int i = 0; i <= n; i++) {
            g[i] = new ArrayList <> ();
        }
        for(int i = 1; i <= n; i++) {
            c[i] = in.nextInt();
            w[i] = in.nextInt();
            g[c[i]].add(new Pair(w[i], i));
        }
        for(int i = 1; i <= n; i++) {
            Collections.sort(g[i], new Pair());
        }   

        int first = -1;
        int second = -1;

        for(int i = 1; i <= n; i++) {
            if(first == -1 || w[first] > w[i]) {
                first = i;
            }
        }
        for(int i = 1; i <= n; i++) {
            if(c[i] == c[first]) continue;
            if(second == -1 || w[second] > w[i]) {
                second = i;
            }
        }   

        Dsu t = new Dsu(n + 10);
        for(int i = 1; i <= n; i++) {
            if(g[i].isEmpty()) continue;

            int p = x - g[i].get(0).first;

            int q;
            if(c[first] == i) {
                if(second == -1) q = -1;
                else q = y - w[second];
            } else {
                q = y - w[first];
            }

            int low = -1;
            for(int j = 0; j < g[i].size(); j++) {
                if(g[i].get(j).first <= p || g[i].get(j).first <= q) {
                    low = j;
                }
            }
            for(int j = 1; j <= low; j++) {
                t.merge(g[i].get(j-1).second, g[i].get(j).second);
            }

            if(c[first] == i && w[first] + g[i].get(0).first <= x) {
                t.merge(first, g[i].get(0).second);
            } 
            else if (c[first] != i && w[first] + g[i].get(0).first <= y) {
                t.merge(first, g[i].get(0).second);
            }

            if(second != -1 && c[second] == i && w[second] + g[i].get(0).first <= x) {
                t.merge(second, g[i].get(0).second);
            } 
            else if (second != -1 && c[second] != i && w[second] + g[i].get(0).first <= y) {
                t.merge(second, g[i].get(0).second);
            }
        }
        if(second != -1 && w[first] + w[second] <= y) {
            t.merge(first, second);
        }

        fac[0] = 1;
        for(int i = 1; i <= n; i++) {
            fac[i] = fac[i - 1] * i;
            fac[i] %= mod;
        }

        long ans = 1;
        TreeSet <Integer> ext = new TreeSet <> ();
        for(int i = 1; i <= n; i++) {
            if(!ext.contains(t.root(i))) {
                ext.add(t.root(i));
                ans *= t.size(i);
                ans %= mod;
            }
        }
        System.out.println(ans);
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