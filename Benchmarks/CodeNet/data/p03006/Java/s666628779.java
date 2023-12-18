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
        long[] x=new long[n];
        long[] y=new long[n];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextLong();
            y[i]=sc.nextLong();
        }
        HashSet<Long> P = new HashSet<>();
        HashSet<Long> Q = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                P.add(x[i]-x[j]);
                Q.add(y[i]-y[j]);
            }
        }
        int ans = n;
        for (Long p : P) {
            for (Long q : Q) {
                int t = 0;
                if (p == 0 && q == 0) continue;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(i==j)continue;
                        if (x[i] - x[j] == p && y[i] - y[j]== q) t++;
                    }
                }
                if(ans>n-t)ans=n-t;
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

        static boolean hasNextInt() {
            return s.hasNextInt();
        }

    }

}