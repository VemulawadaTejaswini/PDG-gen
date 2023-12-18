import java.util.Scanner;



public class Main {

    static int mod = (int) 1e9 + 7;
    public static final long pow(long x, long n) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {  //ビットが立っていたら
                sum *= x;        //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
            }
            x *= x;              //((x^2)^2)^2・・・
            n >>= 1;
        }
        return sum;
    }

    public static final long modPow(long a,long n,long p) {
        if (n == 1) return a % p;
        if (n % 2 == 1) return (a * modPow(a, n - 1, p)) % p;
        long t = modPow(a, n / 2, p);
        return (t * t) % p;
    }

    static long fermatComb(long a, long b) {
        if (b > a - b)
            return fermatComb(a, a - b);
        long mul = 1; //分子
        long div = 1; //分母
        for (int i = 0; i < b; i++) {
            mul *= (a - i);
            mul %= mod;
            div *= (i + 1);
            div %= mod;
        }
        long ans = mul * modpow(div, mod - 2) % mod; //フェルマーの小定理を利用して掛け算で計算
        return ans;
    }

    //mod条件下の高速pow
    static long modpow(long a, long p) {
        if (p == 0)
            return 1;
        if (p % 2 == 0) {
            long root = modpow(a, p / 2);
            return root * root % mod;
        } else
            return a * modpow(a, p - 1) % mod;
    }

    static long calc(long a, long b, long p) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            long d = calc(a, b / 2, p);
            return (d * d) % p;
        } else {
            return (a * calc(a, b - 1, p)) % p;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
        long result=modPow(2,a,mod)-1;
        long bresult=fermatComb(a,b);
        long cresult=fermatComb(a,c);
        long ans=result-bresult-cresult;
        while(ans<=0){
            ans+=mod;
        }

        System.out.println(ans);
    }
}
