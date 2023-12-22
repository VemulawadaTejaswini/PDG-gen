import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        ModLib modlib = ModLib.create(998244353);
        ModCombination modCombination = ModCombination.create(N, modlib);

        long ans = 0;
        for(int i = 0 ; i <= K ; i++){
            long ltimes = modCombination.comb(N-1, i);
            ltimes = modlib.mult(ltimes, M);
            ltimes = modlib.mult(ltimes, modlib.pow(M-1, N-i-1));
            ans = modlib.add(ans, ltimes);
        }

        System.out.println(ans);
    }
}

class ModLib {
    static public final long NO_MOD = (Long.MAX_VALUE >> 2);
    private final long mod;

    private ModLib(long mod) {
        this.mod = mod;
    }

    static public ModLib create(long mod){
        return new ModLib(mod);
    }

    static public ModLib create(){
        return new ModLib(NO_MOD);
    }

    public long add(long a, long b) {
        return (a + b) % mod;
    }

    public long sub(long a, long b) {
        return (a - b + mod) % mod;
    }

    public long mult(long a, long b) {
        return ((a % mod) * (b % mod)) % mod;
    }

    /*
        aのx乗を求める。
        O(logx)
     */
    public long pow(long a, long x) {
        long res = 1;
        while (x > 0) {
            if (x % 2 == 1) res = mult(res, a);
            a = mult(a, a);
            x >>= 1;
        }

        return res;
    }

    public long inv(long a) {
        return pow(a, mod - 2);
    }

    public long div(long a, long b) {
        return mult(a, inv(b));
    }
}

class ModCombination {
    private final ModLib modLib;

    private final long[] fact;
    private final long[] invfact;

    private ModCombination(ModLib modLib, long[] fact, long[] invfact) {
        this.modLib = modLib;
        this.fact = fact;
        this.invfact = invfact;
    }

    static public ModCombination create(int size, ModLib modLib) {
        long[] fact = new long[size];
        fact[0] = 1;
        for (int i = 0; i < size - 1; i++) {
            fact[i+1] = modLib.mult(fact[i], i + 1);
        }
        long[] invfact = new long[size];
        invfact[size-1] = modLib.div(1, fact[size-1]);
        for (int i = size - 2; i >= 0; i--) {
            invfact[i] = modLib.mult(invfact[i+1], i + 1);
        }
        return new ModCombination(modLib, fact, invfact);
    }

    public long fact(int x) {
        return fact[x];
    }

    public long invfact(int x) {
        return invfact[x];
    }

    public long comb(int a, int b) {
        if (b > a) {
            return 0;
        }
        return modLib.mult(fact[a], modLib.mult(invfact[b], invfact[a-b]));
    }
}