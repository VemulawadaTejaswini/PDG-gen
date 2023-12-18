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
        int a=sc.nextInt(),b=sc.nextInt();
        int q=sc.nextInt();
        long[] s=new long[a];
        long[] t=new long[b];
        for (int i = 0; i < a; i++) {
            s[i]=sc.nextLong();
        }
        for (int i = 0; i < b; i++) {
            t[i]=sc.nextLong();
        }
        for (int i = 0; i < q; i++) {
            long x=sc.nextLong();
            int S=Arrays.binarySearch(s,x);
            int T=Arrays.binarySearch(t,x);
            if(S<0)S=~S;
            if(T<0)T=~T;
            long s1=0<=S&&S<a?s[S]:-1;
            long s2=0<=S-1&&S-1<a?s[S-1]:-1;
            long t1=0<=T&&T<b?t[T]:-1;
            long t2=0<=T-1&&T-1<b?t[T-1]:-1;
            long d1=s1==-1||t1!=-1?abs(s1-x)+abs(t1-s1):Long.MAX_VALUE;
            long d2=s1==-1||t2!=-1?abs(s1-x)+abs(t2-s1):Long.MAX_VALUE;
            long d3=s2==-1||t1!=-1?abs(s2-x)+abs(t1-s2):Long.MAX_VALUE;
            long d4=s2==-1||t2!=-1?abs(s2-x)+abs(t2-s2):Long.MAX_VALUE;
            out.println(min(min(d1,d2),min(d3,d4)));
        }

    }
}