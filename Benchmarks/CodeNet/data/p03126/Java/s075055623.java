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
        int n=sc.nextInt(),m=sc.nextInt();
        int[] c=new int[m+1];
        int ans=0;
        for (int i = 0; i < n; i++) {
            int k=sc.nextInt();
            for (int j = 0; j < k; j++) {
                int a=sc.nextInt();
                c[a]++;
            }
        }
        for (int i = 1; i <= m; i++) {
            if(c[i]==n)ans++;
        }
        out.println(ans);
    }
}