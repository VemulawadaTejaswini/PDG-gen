/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
 */
//入力終了→Ctrl+D
import java.time.Year;
import java.util.*;
import java.awt.*;
import java.awt.Graphics.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] s=new int[n+1];
        for (int i = 0; i < n; i++) {
            s[i]=sc.nextInt();
        }
        s[n]=Integer.MAX_VALUE;
        int q=sc.nextInt();
        int[] t=new int[q];
        for (int i = 0; i < q; i++) {
            t[i]=sc.nextInt();
        }
        int ans=0;
        for (int i = 0; i < q; i++) {
            int ok=0,ng=n;
            while (abs(ng-ok)>1){
                int m=(ok+ng)/2;
                if(s[m]>t[i]){
                    ng=m;
                }else ok=m;
            }
            if(s[ok]==t[i])ans++;
        }
        out.println(ans);
    }
}
