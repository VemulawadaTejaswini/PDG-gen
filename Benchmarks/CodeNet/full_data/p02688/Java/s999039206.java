import java.io.*;
import java.math.BigInteger;
import java.net.PortUnreachableException;
import java.util.*;

// written by luchy0120

public class Main {
    public static void main(String[] args) throws Exception {

        new Main().run();
    }

    static int groups = 0;
    static int[] fa;
    static int[] sz;

    static void init(int n) {
        groups = n;
        fa = new int[n];
        for (int i = 1; i < n; ++i) {
            fa[i] = i;
        }
        sz = new int[n];
        Arrays.fill(sz, 1);
    }

    static int root(int p) {
        while (p != fa[p]) {
            fa[p] = fa[fa[p]];
            p = fa[p];
        }
        return p;
    }

    static void combine(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            fa[i] = j;
            sz[j] += sz[i];
        } else {
            fa[j] = i;
            sz[i] += sz[j];
        }
        groups--;
    }

    int child[];
    int color[],dfn[],low[],stack[],cnt[];
    boolean vis[];
    boolean iscut[];
    int deep,top,n,m,sum,ans;
    List<Integer> g[];
    int root = 0;
    //  无向图的强连通分量
    void tarjanNonDirect(int u1) {

        int stk[] = new int[10001];
        int fatk[] = new int[10001];
        int p = 0;
        stk[p] = u1;
        fatk[p] = -1;
            p= 1;
       ot: while(p>0) {
            int u  = stk[p-1];
            int fa = fatk[p-1];


                if(dfn[u]==0) {
                    low[u] = dfn[u] = ++deep;
                }
               // stack[top++] = u;

           for (; h[u] != -1; h[u] = ne[h[u]]) {
                    int v = to[h[u]];
                    if (dfn[v] == 0) {
                        //tarjanNonDirect(v);

                        fatk[p] = u;
                        stk[p++] = v;
                        continue ot;
                    } else {
                        low[u] = Math.min(low[u], dfn[v]);
                        // 没有特判是否直接指向父亲
                        // 回边，使用dfn【v】更新low【u】,因为可能是指向父亲，而父亲的low可能比较小
                    }
                }
                --p;

                if (fa != -1) {
                    low[fa] = Math.min(low[fa], low[u]);
                    if (low[u] >= dfn[fa]) {
                        if (fa != root || ++child[fa] > 1) {     // 不是root，直接记为cut，是root，判断是否有两个儿子
                            iscut[fa] = true;
                        }
                        //++dcc_cnt;
                        // 一个割点可能会被多个点双共享
                        //  int z = -1;
                        //    do {
                        //        z = stack[--top];
                        //      dcc[dcc_cnt].add(z);
                        //    } while(z != v);
                        //   dcc[dcc_cnt].add(u);
                    }


                }

        }
    }
    int gd = 0;

    int scc_cnt = 0;
    int sccno[];

int rr =0;
//    void solve() {
//
//    }




//    int get_room(int i,int j){
//        return i/3*3 + j/3;
//    }

//    int a[][] = new int[9][9];
//    int space = 0;
//
//    boolean vis_row[][] = new boolean[9][10];
//    boolean vis_col[][] = new boolean[9][10];
//    boolean vis_room[][] = new boolean[9][10];
//    int val[][][] =new int[9][9][];
//    int prepare[][];
//
//    void dfs(int rt){
//
//    }

    int h[],to[],ne[];int ct =0;
    void add(int u,int v){
       // u--;v--;
        to[ct] = v;
        ne[ct] = h[u];
        h[u] = ct++;

    }








    void solve() {


//        while(st<end){
//            int cur = q[st++];
//            for(int i=h1[cur];i!=-1;i=ne1[i]){
//                int y = to1[i];
//                dp[y] = Math.max(dp[cur]+summ[y],dp[y]);
//                r = Math.max(dp[y],r);
//                if(--du[y]==0){
//                    q[end++] = y;
//                }
//            }
//        }
     //   print(r);


        int n = ni();
        int d[] = new int[n+1];
        int k = ni();
        for(int i=0;i<k;++i){
            int s = ni();
            for(int j=0;j<s;++j){
                d[ni()]++;
            }


        }
        int c =0;
        for(int i=1;i<=n;++i){
            if(d[i]==0){
                c++;
            }
        }
        print(c);

//        for(int i=ni();i>=1;--i){
//            int n = ni();
//            int m = ni();
//            int c = 0;
//            int from = Math.max(1,n/(m+1)+1);
//            int end = Math.min(n/2,n/m);
//            c += end-from+1;
//
//            int from1 = Math.max(1,(n+m)/(m+1));
//
//            int end1 = Math.min(n%2==0?(n/2-1):n/2,n%m==0?((n/m)-1):n/m);
//            c += end1-from1+1;

//            for(int ii=from;ii*m<=n;++ii){
//                int j  =n-ii;
//                if(ii>=j) break;
//                if((j+ii-1)/ii==m){
//                    c++;
//                }
//            }




          //  println(c);
      //  }

//        int n = ni();
//        int m  = n*(n+1)/2;
//        int k = ni();
//        int p = 0;
//
//        double x[] = new double[n];
//        double y[] = new double[n];
//
//        for(int i=0;i<n;++i){
//            x[i] = nd();
//            y[i] = nd();
//        }
//
//        List<Item> li = new ArrayList<>();
//        for(int i=0;i<n;++i){
//            for(int j=i+1;j<n;++j){
//               double r =  (x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]);
//               li.add(new Item(r,i,j));
//            }
//        }
//        Collections.sort(li,(xx,yy)->Double.compare(xx.s,yy.s));
//
//        init(n + 1);
//
//        int s = 0;
//        int c = n;
//        for (int i = 0; i < li.size(); ++i) {
//            int p1 = li.get(i).a;
//            int p2 = li.get(i).b;
//            if (root(p1) != root(p2)) {
//                combine(p1, p2);
//                c--;
//                if(c==k-1){
//                    print(roundS(Math.sqrt(li.get(i).s),2));
//                    break;
//                }
//            }
//        }

    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }


    static long mul(long a, long b, long p)
    {
        long res=0,base=a;
        while(b>0)
        {
            if((b&1L)>0)
                res=(res+base)%p;
            base=(base+base)%p;
            b>>=1;
        }
        return res;
    }


    static long mod_pow(long k,long n,long p){
        long res = 1L;
        long temp = (k%p+p)%p;
        while(n!=0L){
            if((n&1L)==1L){
                res = ((res*temp)%p+p)%p;
            }
            temp = ((temp * temp)%p+p)%p;
            n = n>>1L;
        }
        return res%p;
    }
    public static String roundS(double result, int scale){
        String fmt = String.format("%%.%df", scale);
        return String.format(fmt, result);
    }


//    void solve() {
//
//        for(int i=0;i<9;++i) {
//            for (int j = 0; j < 9; ++j) {
//                int v = ni();
//                a[i][j] = v;
//                if(v>0) {
//                    vis_row[i][v] = true;
//                    vis_col[j][v] = true;
//                    vis_room[get_room(i, j)][v] = true;
//                }else{
//                    space++;
//                }
//            }
//        }
//
//
//        prepare = new int[space][2];
//
//        int p = 0;
//
//        for(int i=0;i<9;++i) {
//            for (int j = 0; j < 9; ++j) {
//                if(a[i][j]==0){
//                    prepare[p][0] = i;
//                    prepare[p][1]= j;p++;
//                    List<Integer> temp =new ArrayList<>();
//                    for(int k=1;k<=9;++k){
//                        if(!vis_col[j][k]&&!vis_row[i][k]&&!vis_room[get_room(i,j)][k]){
//                            temp.add(k);
//                        }
//                    }
//                    int sz = temp.size();
//                    val[i][j] = new int[sz];
//                    for(int k=0;k<sz;++k){
//                        val[i][j][k] = temp.get(k);
//                    }
//                }
//            }
//        }
//        Arrays.sort(prepare,(x,y)->{
//           return Integer.compare(val[x[0]][x[1]].length,val[y[0]][y[1]].length);
//        });
//        dfs(0);
//
//
//
//
//
//
//
//
//
//
//    }




    InputStream is;
    PrintWriter out;

    void run() throws Exception {
        //is = new FileInputStream(new File("C:\\Users\\Luqi\\Downloads\\P3387_9.in"));
        is = System.in;
        out = new PrintWriter(System.out);

        solve();
        out.flush();
    }

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
        while ((b = readByte()) != -1 && isSpaceChar(b)) ;
        return b;
    }

    private double nd() {
        return Double.parseDouble(ns());
    }

    private char nc() {
        return (char) skip();
    }

    private char ncc() {
        int b = readByte();
        return (char) b;
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

    private String nline() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!isSpaceChar(b) || b == ' ') {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[][] nm(int n, int m) {
        char[][] a = new char[n][];
        for (int i = 0; i < n; i++) a[i] = ns(m);
        return a;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = ni();
        return a;
    }

    private long[] nal(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nl();
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) {
        }
        ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') num = (num << 3) + (num << 1) + (b - '0');
            else return minus ? -num : num;
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) {
        }
        ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') num = num * 10 + (b - '0');
            else return minus ? -num : num;
            b = readByte();
        }
    }

    void print(Object obj) {
        out.print(obj);
    }

    void println(Object obj) {
        out.println(obj);
    }

    void println() {
        out.println();
    }

    void printArray(int a[],int from){
        int l = a.length;
        for(int i=from;i<l;++i){
            print(a[i]);
            if(i!=l-1){
                print(" ");
            }
        }
        println();
    }

    void printArray(long a[],int from){
        int l = a.length;
        for(int i=from;i<l;++i){
            print(a[i]);
            if(i!=l-1){
                print(" ");
            }
        }
        println();
    }
}