import java.util.*;

public class Main {
    static int MAX = 510000;
    static int MOD = 1000000007;
    static long[] fac = new long[MAX];
    static long[] finv= new long[MAX];
    static long[] inv = new long[MAX];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        COMinit();
        for (int i=1;i<=k;i++){
            System.out.println(HCOM(k-i+1,i-1)*HCOM(n-k-i+2,i)%MOD);
        }
    }
    static void COMinit(){
        fac[0]=1;
        fac[1]=1;
        finv[0]=1;
        finv[1]=1;
        inv[1]=1;
        for (int i=2;i<MAX;i++){
            fac[i]=fac[i-1]*i%MOD;
            inv[i]=MOD-inv[MOD%i]*(MOD/i)%MOD;
            finv[i]=finv[i-1]*inv[i]%MOD;
        }
    }
    static long COM(int n, int k){
        if (n<k)return 0;
        if (n<0||k<0)return 0;
        return fac[n]*(finv[k]*finv[n-k]%MOD)%MOD;
    }
    static long HCOM(int n, int k){
        return COM(n+k-1,k);
    }
}
