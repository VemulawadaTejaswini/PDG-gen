import java.util.Scanner;

public class MOD {
    private static final long MOD = 1_000_000_007L;
    private static int TARGET = 2000002;
    private static long[] mod = new long[TARGET];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initmod();
        int r1,r2,c1,c2;
        r1=sc.nextInt();
        c1=sc.nextInt();
        r2=sc.nextInt();
        c2=sc.nextInt();
        assert(com(5,2) % MOD == 10);
        assert(com(4,2) % MOD == 6);
        long res;
        res = calc(r2, c2) - calc(r1-1, c2) - calc(r2, c1-1) + calc(r1-1, c1-1);
        res += MOD;
        res %= MOD;
        System.out.println(res);

    }

    private static long calc(int r, int c){
        if(r < 0 || c < 0){
            return 0;
        }
        long sum = 0;
        for(int i=1;i<=r+1;i++){
            sum += com(i+c, c);
            sum %= MOD;
        }
        return sum;
    }



    private static long com(int n, int k){
        long res = mod[n] * modinv(mod[n-k]) % MOD;
        res *= modinv(mod[k]);
        res %= MOD;
        return res;
    }


    private static void initmod(){
        mod[0]=1;
        mod[1]=1;
        for(int i=2;i<TARGET;i++){
            mod[i] = (mod[i-1] * i) % MOD;
        }
    }

    private static long modpow(long n, long k){
        if(k==0){
            return 1;
        }
        if(k==1){
            return n % MOD;
        }
        long res = modpow( n , k/2);
        res = (res * res) % MOD;
        if(k % 2 == 1){
            return (res * n) % MOD;
        }else{
            return res;
        }
    }


    public static long modinv(long n){
        return modpow(n, MOD-2);
    }
}
