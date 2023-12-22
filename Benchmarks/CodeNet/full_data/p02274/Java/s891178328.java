/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
'+'とかは問題ない
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
//import static java.lang.System.*; はしばらく使わなそう(使うとしてもexit(0)のためだけ)←return;でよさそう
最後にout.flush()またはout.close()をするのを忘れずに！
Point2D p2d=new Point2D.Double(d1,d2);
Line2D l2d=new Line2D.Double(x1,y1,x2,y2);
Line2D l2d_0=new Line2D.Double(x11,y11,x22,y22);
if(l2d.intersectsLine(l2d_0))
next_Permutationを使うときはソート済み配列かどうか確認！！
参照型の比較するときはプリミティブ型にキャストするか.compare,.equalsを使う！
ex.map.get(0)=100,map.get(1)=100でもmap.get(0)==map.get(1)がfalseになりうる
*/
//入力終了→Ctrl+D
import java.io.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.awt.geom.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        ST.Init();
        int n=sc.nextInt();
        int[] a=new int[n];
        int c=0;
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            tm.put(a[i],i);
        }
        while (c<n){
            Map.Entry ent=tm.pollFirstEntry();
            a[(int)ent.getValue()]=c+1;
            c++;
        }
        long ans=0;
        for (int i = 0; i < n; i++) {
            int x=ST.query(0,a[i],0,0,ST.n);
            ans+=a[i]-1-x;
            ST.update(a[i],1);
        }
        out.println(ans);
        out.close();
    }

    //Segment Tree
    static class ST {
        //0-indexed
        //親:(n-1)/2,子:2*n+1,2*n+2
        //i番目のindex→n+i-1
        static int INF = Integer.MAX_VALUE;
        static int n = 1048576/2;
        static int[] d = new int[n * 2 - 1];

        static void Init() {
            for (int i = 0; i < n * 2 - 1; i++) d[i] = 0;
        }

        //i番目の要素をxに変更（この関数はnが2の累乗でないと機能しない）
        static void update(int i, int x) {
            i += n - 1;
            d[i] = x;
            while (i > 0) {
                i = (i - 1) / 2;
                d[i] = d[i * 2 + 1]+d[i * 2 + 2];
            }
        }

        //[a,b)の最小値,l,rにはノードkに対応付く区間を与える
        static int query(int a, int b, int k, int l, int r) {
            if (r <= a || b <= l) return 0;
            if (a <= l && r <= b) return d[k];
            int vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
            int vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
            return vl+vr;
        }
        /*
        ex.[a,b)のmin→query(a,b,0,0,ST.n)
         */
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner scanner = new Scanner(System.in);

        static String next() {
            return scanner.next();
        }

        static String nextLine() {
            return scanner.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(scanner.next());
        }

        static long nextLong() {
            return Long.parseLong(scanner.next());
        }

        static double nextDouble() {
            return Double.parseDouble(scanner.next());
        }

        static boolean hasNext() {
            return scanner.hasNext();
        }

        static boolean hasNextInt() {
            return scanner.hasNextInt();
        }

        static boolean hasNext(String str) {
            return scanner.hasNext(str);
        }
    }

}
