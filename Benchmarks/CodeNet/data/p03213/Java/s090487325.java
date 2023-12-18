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
        int n=sc.nextInt();
        HashMap<Integer,Integer> pf=new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int s=(int)sqrt(n)+1;
            int t=i;
            for (int j = 2; j <= s; j++) {
                while (t%j==0){
                    pf.put(j,pf.getOrDefault(j,0)+1);
                    t/=j;
                }
            }
            if(t!=1)pf.put(t,pf.getOrDefault(t,0)+1);
        }
        int[] p=new int[25];
        int c=0;
        for (Integer key:pf.keySet())p[c++]=pf.get(key);
        int ans=0;
        for (int i = 0; i < 25; i++) {
            if(p[i]+1>=75)ans++;
        }
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                if(i==j)continue;
                if(p[i]+1>=3&&p[j]+1>=25)ans++;
                if(p[i]+1>=5&&p[j]+1>=15)ans++;
            }
        }
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                for (int k = 0; k < 25; k++) {
                    if(i==j||j==k||k==i)continue;
                    if(p[i]+1>=3&&p[j]+1>=5&&p[k]+1>=5&&j>k)ans++;
                }
            }
        }
        out.println(ans);
        out.close();
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