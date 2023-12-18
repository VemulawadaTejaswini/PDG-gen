/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> factor=new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int temp=i;
            int s=(int)sqrt(temp)+1;
            for (int j = 2; j <= s; j++) {
                while (temp%j==0){
                    factor.put(j,factor.getOrDefault(j,0)+1);
                    temp/=j;
                }
            }
            if(temp!=1)factor.put(temp,1);
        }
        long ans=1;
        for (Integer k:factor.keySet()){
            ans=(ans*(long)(factor.get(k)+1))%1000000007;
        }
        out.println(ans);
    }
}