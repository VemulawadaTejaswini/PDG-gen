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
*/
//入力終了→Ctrl+D
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n = sc.nextInt();
        ArrayList<Integer>[] g=new ArrayList[n+1];
        for (int i=1;i<=n;i++)g[i]=new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int a=sc.nextInt(),b=sc.nextInt();
            g[a].add(b);
            g[b].add(a);
        }
        int[] d_1=new int[n+1];
        int[] d_n=new int[n+1];
        for (int i = 0; i < n + 1; i++) {
            d_1[i]=-1;
            d_n[i]=-1;
        }
        dfs(d_1,0,1,g);
        dfs(d_n,0,n,g);
        int f=0,s=0;
        for (int i = 1; i < n + 1; i++) {
            if(d_1[i]<=d_n[i])f++;
            else s++;
        }
        //out.println(Arrays.toString(d_1));
        //out.println(Arrays.toString(d_n));
        out.println(f>s?"Fennec":"Snuke");
        out.close();
    }
    static void dfs(int[] d,int dist,int node,ArrayList<Integer>[] g){
        if(d[node]>=0)return;
        d[node]=dist;
        for (Integer children:g[node]){
            dfs(d,dist+1,children,g);
        }
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
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
    }
}