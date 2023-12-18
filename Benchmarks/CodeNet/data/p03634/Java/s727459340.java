/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
//import static java.lang.System.*; はしばらく使わなそう(使うとしてもexit(0)のためだけ)←return;でよさそう
最後にout.flush()またはout.close()をするのを忘れずに！
Point2D p2d=new Point2D.Double(d1,d2);
//import static java.lang.System.*;
*/
//入力終了→Ctrl+D
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        long INF = Long.MAX_VALUE/10;
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        int[] c = new int[n - 1];
        ArrayList<Integer>[] e=new ArrayList[n+1];
        for (int i = 1; i < n+1; i++) {
            e[i]=new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            e[a[i]].add(i);
            e[b[i]].add(i);
        }
        long[] d = new long[n + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->Long.compare(d[o1],d[o2]));
        int q = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            d[i] = i == k ? 0 : INF;
            pq.add(i);
        }
        int[] pre=new int[n+1];
        while (!pq.isEmpty()){
            int u=pq.poll();
            for (Integer i:e[u]){
                int v=u==a[i]?b[i]:a[i];
                long alt=d[u]+c[i];
                if(d[v]>alt){
                    d[v]=alt;
                    pre[v]=u;
                    pq.add(v);
                }
            }
        }
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            out.println(d[x]+d[y]);
        }
        out.close();
    }

    static class pair {
        long x, y;

        pair(long a, long b) {
            a = x;
            b = y;
        }
    }

    static class Point3D {
        Point3D(int a, int b, int c) {
            a = x;
            b = y;
            c = z;
        }

        int x, y, z;
    }

    static long mod = 1000000007;

    static long power(long x, long n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            long e = power(x, n / 2) % mod;
            return (e * e) % mod;
        }
        return (x * power(x, n - 1)) % mod;
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static class COM {
        static long[] fact;
        static long[] inv;

        static void Init(int n) {
            fact = new long[n];
            inv = new long[n];
            fact[0] = inv[0] = 1;
            for (int i = 1; i < n; i++) {
                fact[i] = (fact[i - 1] * i) % mod;
                inv[i] = power(fact[i], mod - 2);
            }
        }

        static long C(int n, int k) {
            return ((fact[n] * inv[n - k]) % mod * inv[k]) % mod;
        }
    }

    static class UF {
        static int[] d;

        static void Init(int size) {
            d = new int[size];
            for (int i = 0; i < size; i++) {
                d[i] = -1;
            }
        }

        static boolean unite(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) return false;
            if (d[x] > d[y]) {
                int t = d[y];
                d[y] = d[x];
                d[x] = t;
            }
            d[x] += d[y];
            d[y] = x;
            return true;
        }

        static boolean same(int x, int y) {
            return find(x) == find(y);
        }

        static int find(int k) {
            return d[k] < 0 ? k : (d[k] = find(d[k]));
        }

        static int size(int k) {
            return -d[find(k)];
        }
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }

        static boolean hasNext() {
            return s.hasNext();
        }
    }
}