import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static Scanner r=new Scanner(System.in);
    public static long []fac=new long[2000010];
    public static long mod=1000000007;
    public static long mul(long a,long b){
        return a*b%mod;
    }
    public static void init(){
        fac[0]=fac[1]=1;
        for(int i=2;i<2000010;++i){
            fac[i]=mul(fac[i-1],1l*i);
        }
    }
    public static long poww(long a,long b){
        long r=1;
        while(b>0){
            if(b%2==1) r=mul(r,a);
            a=mul(a,a);
            b/=2;
        }
        return r;
    }
    public static long inv(long x) {
        return poww(x, mod - 2);
    }
    public static long bino(int n,int k){
        if(k<0) return 0;
        if(k==0) return 1;
        return mul(fac[n],mul(inv(fac[n-k]),inv(fac[k])));
    }
    public static void main(String[] args) {
        init();
        long ans=0;
        int k=r.nextInt();
        String s=r.next();
        int n=s.length();
        long maxx=n+k;
        for(int len=n;len<=maxx;++len){
            long last=maxx-len;
            long ch_last=poww(26,last);
            long pos=bino(len-1,n-1);
            long ch25=poww(25,len-n);
            long cur=mul(mul(pos,ch25),ch_last);
            ans+=cur;
            ans%=mod;
        }
        System.out.println(ans);
    }
}
