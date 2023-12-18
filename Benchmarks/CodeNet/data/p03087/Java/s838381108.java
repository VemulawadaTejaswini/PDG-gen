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
        int n=sc.nextInt(),q=sc.nextInt();
        String s=sc.next();
        int[] AC=new int[n+1];
        for (int i = 1; i < n; i++) {
            if(s.charAt(i-1)=='A'&&s.charAt(i)=='C'){
                AC[i+1]=1;
                AC[i]=1;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            AC[i]+=AC[i-1];
        }
        for (int i = 0; i < q; i++) {
            int l=sc.nextInt(),r=sc.nextInt();
            int k=0;
            if(l-2>=0&&s.charAt(l-1)=='C'&&s.charAt(l-2)=='A')k++;
            out.println((AC[r]-AC[l-1])/2-k);
        }
    }
}