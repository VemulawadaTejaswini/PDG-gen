import java.util.*;

public class Main {
    // global
    static long fact[];
    static long inverse[];
    static int mod = 1_000_000_007;

    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a%mod;
            }
            a=a*a%mod;
            n>>=1;
        }
        return res;
    }

    static long modinv(long n) {
        return pow(n, mod-2);
    }

    static long comb(int n,int k){
        if(n<0 || k<0 || n<k)return 0;
        return fact[n]*(inverse[k]*inverse[n-k]%mod) %mod;
    }
    static ArrayList<int[]> factorization (int n) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int tmp= n ;
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (tmp%i==0) {
                int cnt=0;
                while (tmp%i==0) {
                    cnt++;
                    tmp/=i;
                }
                int[] x = {i, cnt};
                list.add(x);
            }
        }
        if (tmp!=1) {
            int[] x = {tmp, 1};
            list.add(x);
        }

        if (list.size()==0) {
            int[] x = {n, 1};
            list.add(x);
        }
        return list;
    }
    public static void main(String[] args) {
        // main method
        fact=new long[200000];
        fact[0]=1;
        inverse=new long[200000];
        inverse[0]=1;
        for(int i=1;i<200000;i++){
            fact[i]=(fact[i-1]*(long)i)%mod;
            inverse[i]=modinv(fact[i]);
        }
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        long ans = 1L;
        for (int[] s : factorization(M)) {
            ans = ans*comb(N-1+s[1], s[1])%mod;
        }
        if (M==1) {
            System.out.println(1);
        } else {
            System.out.println(ans);
        }
    }
}