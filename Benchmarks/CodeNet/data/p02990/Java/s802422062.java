import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = (int)1e9 + 7;
        
        Combination com = new Combination(2000);
        
        int A = Math.min(N-K+1, K);
        long ans = 0;
        for(int i = 1; i <= A; i++){
            ans = com.nCk(N-K+1,i) * com.nCk(K-1,i-1) % mod;
            System.out.println(ans);
        }
        
        for(int i = 0; i < K-A; i++){
            System.out.println(0);
        }
        
    }
}

class Combination {

    long factorial[];
    long inverse[];
    int MOD;

    public Combination(int size){
        this(size, (int)1e9 + 7);
    }

    public Combination(int size, int mod){
        this.factorial = new long[size + 1];
        this.inverse = new long[size + 1];
        this.MOD = mod;

        this.factorial[0] = 1;
        this.inverse[0] = 1;

        for(int i = 1; i <= size; i++){
            factorial[i] = (factorial[i-1] * i) % MOD;
            inverse[i] = pow(factorial[i], (int) MOD - 2 ) % MOD;
        }
    }

    long nCk(int n, int k){
        return factorial[n] * inverse[k] % MOD * inverse[n-k] % MOD;
    }

    long nPk(int n, int k){
        return factorial[n] * inverse[n-k] % MOD;
    }

    private long pow(long x, int n){
        long ans = 1;
        while(n > 0){
            if( (n & 1) == 1 ){
                ans = ans * x % MOD;
            }
            n >>= 1;
            x = x * x % MOD;
        }

        return ans;
    }
}
