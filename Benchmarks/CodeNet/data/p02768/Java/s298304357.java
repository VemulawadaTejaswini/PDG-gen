import java.util.*;

 

class Main {
    static int mod = (int) 1e9 + 7;
    static int factorials[];
    static int factorialDivs[];

    static void pre_factrials(int n) {
        factorials = new int[n + 1];
        factorialDivs = new int[n + 1];//割算の結果を格納する配列
        factorials[0] = 1;
        for (int i = 0; i < n; i++) {
            factorials[i + 1] = mul(i + 1, factorials[i]);
        }
        factorialDivs[n] = div(1, factorials[n]);//最初に1/(n!)を求める事で、1/(n-1)!からは掛け算で求める事ができる。
        for (int i = n - 1; i >= 0; i--) {
            factorialDivs[i] = mul(factorialDivs[i + 1], i + 1);
        }
    }

    static int fastFermatComb(int a, int b) {
        if (factorials.length == 0)
            System.err.println("error : factorials has not been culculated!! do [pre_factorial] method");
        int af = factorials[a];
        int bf = factorialDivs[b];
        int abf = factorialDivs[a - b];
        int res = mul(mul(af, bf), abf);
        return res;
    }

    static int plus(int x, int y) {
        x %= mod;
        y %= mod;
        int res = (x + y) % mod;
        return res;
    }

    static int sub(int x, int y) {
        x %= mod;
        y %= mod;
        int res = (x - y + mod) % mod;
        return res;
    }

    static int mul(int x, int y) {
        x %= mod;
        y %= mod;
        int res = x * y % mod;
        return res;
    }

    static int div(int x, int y) {
        x %= mod;
        y %= mod;
        int res = x * modpow(y, mod - 2) % mod;
        return res;
    }

    static int modpow(int a, int p) {
        if (p == 0)
            return 1;
        if (p % 2 == 0) {
            int halfP = p / 2;
            int root = modpow(a, halfP);
            return root * root % mod;
        } else
            return a * modpow(a, p - 1) % mod;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        pre_factrials(n);
        int ans = 1;
        for(int i=1; i<=n; i++){
            if(i != a && i != b){
                ans = (ans*(int)fastFermatComb(n,i))%mod;
            }
        }
        System.out.println(ans);
    }

}