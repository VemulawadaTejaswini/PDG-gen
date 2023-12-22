/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
*/
//入力終了→Ctrl+D
import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        ST.Init();
        int n=sc.nextInt(),q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int com=sc.nextInt();
            int x=sc.nextInt(),y=sc.nextInt();
            if(com==0)ST.update(x,y);
            else out.println(ST.query(x,y+1,0,0,ST.n));
        }
    }

    static class ST {
        //0-indexed
        //親:(n-1)/2,子:2*n+1,2*n+2
        //i番目のindex→n+i-1
        static int INF = Integer.MAX_VALUE;
        static int n = 1048576;
        static int[] d = new int[n * 2 - 1];

        static void Init() {
            for (int i = 0; i < n * 2 - 1; i++) d[i] = INF;
        }

        //i番目の要素をxに変更（この関数はnが2の累乗でないと機能しない）
        static void update(int i, int x) {
            i += n - 1;
            d[i] = x;
            while (i > 0) {
                i = (i - 1) / 2;
                d[i] = min(d[i * 2 + 1], d[i * 2 + 2]);
            }
        }

        //[a,b)の最小値,l,rにはノードkに対応付く区間を与える
        static int query(int a, int b, int k, int l, int r) {
            if (r <= a || b <= l) return INF;
            if (a <= l && r <= b) return d[k];
            int vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
            int vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
            return min(vl, vr);
        }
        /*
        ex.[a,b)のmin→query(a,b,0,0,n)
         */
    }
}
