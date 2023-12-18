import java.util.*;

class Main{
    static long Mod = 1000000000+7;
    static int maxn = 200000;
    static long[] fac = new long[maxn+1];
    static long[] inv = new long[maxn+1];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int up = (int)Math.sqrt(M);
        boolean[] pri = new boolean[up+1];
        Arrays.fill(pri,true);
        for(int i=2;i<=up;i++){
            if(!pri[i]) continue;
            for(int k=i*i;k<=up;k*=i) pri[k]=false;
        }
        ini();
        ArrayList<Integer> dic = new ArrayList<>();
        for(int i=2;i<=up;i++){
            if(!pri[i]) continue;
            if(M%i==0){
                int cnt=0;
                while(M%i==0){
                    cnt++;
                    M = M/i;
                }
                dic.add(cnt);
            }
            if(M<i) break;
        }
        long ans = 1;
        for(int i=0;i<dic.size();i++){
            ans = ans*com(N-1+dic.get(i),N-1)%Mod;
        }
        System.out.println(ans);
    }

    static void ini(){
        fac[0]=1;
        for(int i=1;i<=maxn;i++) fac[i]=fac[i-1]*i%Mod;
        inv[0]=1;
        inv[maxn] = pow(fac[maxn],Mod-2);
        for(int i=maxn-1;i>=1;i--) inv[i]=inv[i+1]*(i+1)%Mod;
    }
    static long com(int m, int n){
        return fac[m]*inv[n]%Mod*inv[m-n]%Mod;
    }
    static long pow(long base, long p){
        long ans = 1;
        while(p>0){
            if(p%2==1) ans = ans*base%Mod;
            base = base*base%Mod;
            p /= 2;
        }
        return ans;
    }
}
