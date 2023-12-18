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
        long k=sc.nextLong();
        long c=0,i=1;
        while (c<k){
            int h=0;
            for (int j = 1; j <= 500; j++) {
                if ((double) i / sum(i) <= (double) (i + j) / sum(i + j)) {
                    h++;
                }
                if(h==500){
                    out.println(i);
                    c++;
                }
            }
            i++;
        }
    }
    static long sum(long i){
        long t=0;
        while (i>0){
            t+=i%10;
            i/=10;
        }
        return t;
    }
}
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
        long k=sc.nextLong();
        long c=0,i=1;
        while (c<k){
            int h=0;
            for (int j = 1; j <= 300; j++) {
                if ((double) i / sum(i) <= (double) (i + j) / sum(i + j)) {
                    h++;
                }
                if(h==300){
                    out.println(i);
                    c++;
                }
            }
            i++;
        }
    }
    static long sum(long i){
        long t=0;
        while (i>0){
            t+=i%10;
            i/=10;
        }
        return t;
    }
}
