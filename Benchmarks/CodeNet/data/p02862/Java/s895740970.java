import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong(), y=sc.nextLong();
        sc.close();
        if((x*2-y)%3!=0 || (y*2-x)%3!=0){
            System.out.println(0);
            return;
        }
        long mod=1_000_000_007;
        long a=(x*2-y)/3;
        long b=(y*2-x)/3;
        if(a>=0 && b>=0) System.out.println(comb(a+b, a, mod));
        else System.out.println(0);
    }
    public static long modinv(long a, long MOD){
        long b=MOD, u=1, v=0;
        long tmp;
        while(b>=1){
            long t=a/b;
            a-=t*b;
            tmp=a; a=b; b=tmp;
            u-=t*v;
            tmp=u; u=v; v=tmp;
        }
        u%=MOD;
        return u>=0?u:u+MOD;
    }
    public static long comb(long n, long r, long MOD){
        if(n<r) return 0;
        r=Math.min(r, n-r);
        long res=1;
        for(int d=1;d<=r;d++){
            res*=n;
            res%=MOD;
            n--;
            res*=modinv(d, MOD);
            res%=MOD;
        }
        return res;
    }
}
