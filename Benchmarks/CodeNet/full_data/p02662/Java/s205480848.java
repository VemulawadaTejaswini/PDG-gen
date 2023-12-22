import java.util.*;

public class Main {
    static int MAX = 510005;
    static int MOD = 998244353;

    private static long[] FAC = new long[MAX];
    private static long[] INV_FAC = new long[MAX];

    private static void initCom(){
        FAC[0]=FAC[1]=1;
        INV_FAC[0]=INV_FAC[1]=1;
        for(int i=2;i<MAX;i++){
            FAC[i]=FAC[i-1]*i % MOD;
            INV_FAC[i]=modinv(FAC[i]);
        }
    }

    private static long comb(int n, int k){
        return (((FAC[n] * INV_FAC[n-k]) % MOD) * INV_FAC[k]) % MOD;
    }


    private static long modpow(long a, long b){
        if(b == 1){
            return a % MOD;
        }
        if(b == 0){
            return 1;
        }
        long res = b/2;
        long rem = b%2;
        long p = modpow(a, res) % MOD;
        if(rem == 1){
            return (((p*p) % MOD)*a) % MOD;
        }else{
            return (p*p) % MOD;
        }
    }

    private static long modinv(long a){
        return modpow(a, MOD-2);
    }


    private static long lucus(int n, int k, int mod){
        long res = 1L;
        while(n > 0){
            int n1 = n % mod;
            int k1 = k % mod;
            if(n1 == k1){
                res *= 1;
                n /= mod;
                k /= mod;
                continue;
            }else if(n1 < k1){
                res = 0;
                break;
            }else {
                res *= (long) comb(n1, k1);
                res %= mod;
                n /= mod;
                k /= mod;
            }
        }
        return res;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        initCom();
        List<Map<Integer, Long>> mps = new ArrayList<>();
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<=3000;i++){
            mps.add(new HashMap<>());
        }
        Arrays.sort(A);
        mps.get(0).put(0,1L);
        //mps.get(A[0]).put(1,1L);//1 ko de 1 toori
        for(int i=0;i<N;i++){
            for(int j=S;j>=0;j--){
                if(j+A[i] > S){continue;}
                Map<Integer, Long> target = mps.get(j+A[i]);
                for(int kosuu: mps.get(j).keySet()){
                    target.putIfAbsent(kosuu+1, 0L);
                    target.put(kosuu+1, target.get(kosuu+1) + mps.get(j).get(kosuu));
                }
            }
        }
        Map<Integer, Long> ansMap = mps.get(S);
        long sum = 0;
        for(int kosuu:ansMap.keySet()){
            long add = ansMap.get(kosuu) * modpow(2, N-kosuu);
            add %= MOD;
            sum += add;//2^(N-kosuu);
            sum %= MOD;
        }
        System.out.println(sum);
    }


}
