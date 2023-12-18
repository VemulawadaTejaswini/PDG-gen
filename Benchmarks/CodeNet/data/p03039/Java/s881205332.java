import java.util.*;

class Main{
    static long MOD=1000000007;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final long n=sc.nextLong(), m=sc.nextLong(), k=sc.nextLong();
        sc.close();
        long inv3=modinv(3);
        long inv2=modinv(2);
        long[] ey={n-1, n, n+1, inv3, m, m};
        long[] ex={m-1, m, m+1, inv3, n, n};
        long Y=m(ey), X=m(ex);
        long C=comb(n*m-2, k-2);
        long[] ea={X+Y, C, inv2};
        long ans=m(ea);
        System.out.println(ans);
    }
    public static long m(long[] e){
        long res=1;
        for(long el:e) res=(res*el)%MOD;
        return res;
    }
    public static long modinv(long a){
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
    public static long comb(long n, long r){
        if(n<r) return 0;
        r=Math.min(r, n-r);
        long res=1;
        for(int d=1;d<=r;d++){
            res*=n;
            res%=MOD;
            n--;
            res*=modinv(d);
            res%=MOD;
        }
        return res;
    }
}