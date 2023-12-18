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
    static int h,w;
    static char[][] s;
    static int[][] d;
    static int[] dr={0,-1,0,1};
    static int[] dc={-1,0,1,0};
    public static void main(String[] $) {
        h=sc.nextInt();
        w=sc.nextInt();
        s=new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i]=sc.next().toCharArray();
        }
        d=new int[h][w];
        int black=0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                d[i][j]=Integer.MAX_VALUE;
                if(s[i][j]=='#'){
                    black++;
                }
            }
        }
        dfs(1,0,0);
        int ans;
        if(d[h-1][w-1]==Integer.MAX_VALUE){
            ans=-1;
        }else {
            ans=h*w-d[h-1][w-1]-black;
        }
        out.println(ans);
        out.close();
    }

    static void dfs(int count,int row,int column){
        if(!(0<=row&&row<h&&0<=column&&column<w))return;
        if(s[row][column]=='#')return;
        if(count>d[row][column])return;
        if(count<d[row][column])d[row][column]=count;
        for (int i = 0; i < 4; i++) {
            dfs(count+1,row+dr[i],column+dc[i]);
        }
    }

    static boolean nextPermutation(int[] a) {
        int t = a.length - 1;
        int tt = t + 1;
        for (int i = t; i > 0; --i) {
            if (a[i - 1] < a[i]) {
                int swapIndex = Find(a[i - 1], a, i, t);
                int temp = a[swapIndex];
                a[swapIndex] = a[i - 1];
                a[i - 1] = temp;
                Arrays.sort(a, i, tt);
                return true;
            }
        }
        return false;
    }

    static int Find(int dest, int[] a, int s, int e) {
        if (s == e) {
            return s;
        }
        int m = (s + e + 1) / 2;
        return a[m] <= dest ? Find(dest, a, s, m - 1) : Find(dest, a, m, e);
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

    static void WF(long[][] d, int[] a, int[] b, long[] c) {
        int n = a.length;
        long INF = 100000000000l;
        for (int i = 0; i < n; i++) {
            d[a[i]][b[i]] = d[b[i]][a[i]] = c[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (d[i][j] == 0) d[i][j] = d[j][i] = INF;
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = d[i][j] > d[i][k] + d[k][j] ? d[i][k] + d[k][j] : d[i][j];
                }
            }
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