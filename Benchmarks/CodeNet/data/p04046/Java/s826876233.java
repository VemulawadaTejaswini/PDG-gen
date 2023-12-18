import java.util.*;

class Main{
    static final long Mod = 1000000000+7;
    static long[] fact;
    static long[] inv;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int maxN = 200000+10;
        int H = sc.nextInt();
        int W = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        fact = new long[maxN+1];
        fact[0]=1;
        for(int i=1;i<=maxN;i++) fact[i]=(fact[i-1]*i)%Mod;
        inv = new long[maxN+1];
        inv[0]=1;
        inv[maxN]=pow(fact[maxN],Mod-2)%Mod;
        for(int i=maxN-1;i>=1;i--){
            inv[i]=((i+1)*inv[i+1])%Mod;
        }
        long ans=0;
        for(int i=b+1;i<=W;i++){
            ans = (ans+com(H-a+i-2,i-1)*com(a+W-i-1,a-1)%Mod)%Mod;
        }
        System.out.println(ans);
    }
    static long pow(long base, long p){
        long ans = 1;
        while(p>0){
            if((p&1)>0) ans = ans*base%Mod;
            base=base*base%Mod;
            p=p/2;

        }
        return ans;
    }
    static long com(int m, int n){
        return fact[m]*inv[n]%Mod*inv[m-n]%Mod;
    }
}
