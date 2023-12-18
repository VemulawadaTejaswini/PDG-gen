import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        int[][] bit = new int[n][40];
        int[] bitK=new int[40];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            int c=0;
            while (a[i]>0) {
                bit[i][c++]=(int)a[i]%2;
                a[i]/=2;
            }
        }
        /*
        for (int i = 0; i < n; i++) {
            for (int d:bit[i])out.print(d);
            out.println();
        }
        */
        int c=0;
        long t=k;
        while (t>0){
            bitK[c++]=(int)t%2;
            t/=2;
        }
        long[] cnt=new long[40];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < n; j++) {
                cnt[i]+=bit[j][i];
            }
        }
      /*  out.print("K:");
        for (int m:bitK)out.print(m);
        out.println();*/
        long ans=0;
        int left=0;
        for (int i = 39; i >= 0; i--) {
            if(bitK[i]==1){
                left=i;
                break;
            }
        }
        for (int i = 0; i <= left; i++) {
            long temp = 0;
            temp += greedy(cnt, i-1, n);
            for (int l = i ; l < 40; l++) {
              //  out.println(l);
            //    out.println("bitK="+bitK[l]);
                if (bitK[l] == 1) {
                    temp += (n - cnt[l])*power(2,l);
          //          out.println("1 足されるbitは"+(n - cnt[l]));
                } else {
                    temp += cnt[l]*power(2,l);
        //            out.println("2 足されるbitは"+cnt[l]);
                }
            }
         //   out.println("t="+temp);
            ans = max(ans, temp);
        }
        out.println(/*"ans="+*/ans);
    }
    static long greedy(long[] cnt,int i,int n){
        if(i<0)return 0;
        long t=0;
        for (int j = i; j >= 0; j--) {
            if(cnt[j]>n-cnt[j]){
                t+=cnt[j]*power(2,j);
            }else {
                t+=(n-cnt[j])*power(2,j);
            }
        }
        return t;
    }
    static long power(long x,int n){
        if(n==0)return 1;
        else if(n%2==0){
            long e=power(x,n/2);
            return e*e;
        }else {
            return x*power(x,n-1);
        }
    }
}