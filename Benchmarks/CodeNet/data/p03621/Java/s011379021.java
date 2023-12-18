import java.util.Scanner;

class CulcMod{

    int N;
    long mod;
    long[] factorial;

    CulcMod(int n,long m){
        N = n;
        mod = m;
        init();
    }

    private void init(){
        factorial = new long[N+1];
        factorial[0] = 1;
        for(int i=1;i<=N;++i){
            factorial[i] = (factorial[i-1]*i)%mod;
        }
    }

    public long reverse(long a){
        long res = 1;
        long dab = a;
        for(int i = 0;i<33;++i){
            if((((mod-2)>>i)&1)==1){
                res =(res*dab)%mod;
            }
            dab = (dab*dab)%mod;
        }
        return res;
    }

    public long conbination(int n, int m){
        return (factorial[n] * reverse((factorial[n-m]*factorial[m])%mod))%mod;
    }

}

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        int n = 0;
        int m = 0;
        for(int i=0;i<A.length();++i){
            if(A.charAt(i) == '1'){
                if(B.charAt(i) == '1')++m;
                else ++n;
            }
        }
        long mod =998244353;
        CulcMod culc = new CulcMod(n+m,mod);
        long ans = 0;
        long two[] = new long[n+1];
        two[0] = 1;
        for(int i=1;i<=n;++i)two[i] = (two[i-1]*2)%mod;
        for(int k=Math.max(0,n-m);k<=n;++k){
            ans = (ans + (
                (
                    (
                        ((culc.conbination(n, k)*culc.conbination(m,n-k))%mod)
                        *((culc.factorial[n]*culc.factorial[m])%mod)
                    )%mod
                )*((culc.factorial[n+m] * culc.reverse(two[n-k]))%mod)
                )%mod
            )%mod;
            // System.out.println(culc.conbination(n, k)+"\n"+culc.conbination(m, n-k)+"\n"+
            //                     culc.factorial[n] + "\n" + culc.factorial[m] + "\n"+
            //                     culc.factorial[n+m] + "\n"+ culc.reverse(two[n-k]));
        }
        System.out.println(ans);

    }
}