import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long sum = 0;
        ModLib modlib = new ModLib((long)1e9 + 7);
        for(int k = K ; k <= N+1 ; k++){
            long num = modlib.add(modlib.mult(k, modlib.sub(modlib.add(N, 1), k)), 1);
            sum = modlib.add(sum, num);
        }

        System.out.println(sum);
    }
}

class ModLib {
    final long mod;

    public ModLib(long mod) {
        this.mod = mod;
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