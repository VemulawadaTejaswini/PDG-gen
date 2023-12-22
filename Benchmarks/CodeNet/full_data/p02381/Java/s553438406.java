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
import java.util.*;
import java.awt.*;
import java.awt.Graphics.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        while (true){
            int n=sc.nextInt();
            if(n==0)break;
            double sum=0;
            double[] s=new double[n];
            for (int i = 0; i < n; i++) {
                s[i]=sc.nextDouble();
                sum+=s[i];
            }
            double ave=sum/n;
            double d=0;
            for (int i = 0; i < n; i++) {
                d+=pow(s[i]-ave,2);
            }
            out.println(sqrt(d/n));
        }
    }
}
