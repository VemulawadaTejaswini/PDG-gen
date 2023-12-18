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
        //bit[p][q]:=a[p]の2^qの位(1か0)
        int[][] bit = new int[n][40];
        //kの二進表示（kの2^iの位(1か0)）
        int[] bitK=new int[40];
        long k0case=0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            k0case+=a[i]^0;
        }
        //aを二進にする
        for (int i = 0; i < n; i++) {
            int c=0;
            while (a[i]>0) {
                bit[i][c++]=(int)a[i]%2;
                a[i]/=2;
            }
        }

/*
        for (int i = 0; i < n; i++) {
            for (int d : bit[i]) out.print(d);
            out.println();
        }
*/
        //kを二進にする
        int c=0;
        Queue<Integer> q=new ArrayDeque<>();
        while (k>0){
            bitK[c]=(int)k%2;
            if(k%2==1)q.add(c);
            c++;
            k/=2;
        }

        //2^iの位が1であるようなaの個数（2^iの位に1がいくつあるか）を数える
        long[] cnt=new long[40];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < n; j++) {
                cnt[i]+=bit[j][i];
            }
        }

/*
        out.print("K:");
        for (int m:bitK)out.print(m);
        out.println();
*/

        /*
        kのbitを上から見ていく。
        bitK[i]==1のとき

         */
        long ans=0;
        if(q.isEmpty()) {
            ans=k0case;
        }
        //out.println(q);
        for (Integer p:q) {
            long temp = 0;
            for (int i = 39; i >= 0; i--) {
                //out.println("bitK="+bitK[i]);
                if (i==p) {
                    temp = temp + power(2, i) * cnt[i] + greedy(cnt, i - 1, n);
                    break;
                } else {
                    if(bitK[i]==0){
                        temp += power(2, i) * cnt[i];
                    }else {
                        temp += power(2, i) * (n - cnt[i]);
                    }
                }
            }
            ans=max(ans,temp);
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