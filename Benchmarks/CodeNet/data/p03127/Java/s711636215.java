/*
文字列の配列の初期化、整数の型がlongになっているか
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
        int[] a=new int[n];
        int mini=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            mini=min(a[i],mini);
        }
        int c=n;
        while (c>1){
            c=0;
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                a[i]=a[i]>mini?a[i]%mini:0;
                if(a[i]!=0&&mini!=a[i])mini=min(mini,a[i]);
                if(a[i]>0)c++;
            }
        }
        out.println(mini);
    }
}