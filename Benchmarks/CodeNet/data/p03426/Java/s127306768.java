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
        int h=sc.nextInt();
        int w=sc.nextInt();
        int d=sc.nextInt();
        int[][] a=new int[h][w];
        int[] point=new int[90001];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j]=sc.nextInt();
                point[a[i][j]]=i*w+j;
            }
        }
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l=sc.nextInt();
            int r=sc.nextInt();
            long ans=0;
            int x=l;
            int row=point[x]/w,column=point[x]%w;
            while (x!=r){
                x+=d;
                ans+=abs(row-point[x]/w)+abs(column-point[x]%w);
                row=point[x]/w;
                column=point[x]%w;
            }
            out.println(ans);
        }
    }
}