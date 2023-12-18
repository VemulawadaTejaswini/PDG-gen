import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Harry on 5/10/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        long K = scanner.nextLong();
        long mod = 998244353;
        long[] fac = new long[(int)N+1];
        long[] modInv = new long[(int)N+1];
        fac[0] = 1;
        modInv[0] = 1;
        for(int i=1; i<=N; i++){
            fac[i] = (fac[i-1]*i)%mod;
            modInv[i] = pow(fac[i], mod-2, mod);
        }

        long res = 0;
        for(int k=0; k<=K; k++){
            res = (res + ((M * pow(M-1, N-1-k, mod)%mod)*comb(N-1, N-1-k, fac, modInv, mod))%mod)%mod;
        }
        System.out.println(res);
    }

    public static long comb(long n, long m, long[] fac, long[] modInv, long mod){
        return ((fac[(int)n] * modInv[(int)(n-m)])%mod*modInv[(int)m])%mod;
    }

    public static long pow(long num, long pow, long mod){
        if(pow==0){
            return 1;
        }
        if(pow==1){
            return num;
        }
        long half = pow(num, pow/2, mod);
        return ((half*half)%mod * (pow%2==1 ? num : 1))%mod;
    }
}
