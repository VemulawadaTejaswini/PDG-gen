/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long[] a=new long[n];
        long[] b=new long[n];
        long sum_a=0,sum_b=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0){
                    a[j]=sc.nextLong();
                    sum_a+=a[j];
                }
                else {
                    b[j]=sc.nextLong();
                    sum_b+=b[j];
                }
            }
        }
        if(sum_a<sum_b){
            out.println(-1);
        }else {
          a
            exit(0);
        }
    }
}
