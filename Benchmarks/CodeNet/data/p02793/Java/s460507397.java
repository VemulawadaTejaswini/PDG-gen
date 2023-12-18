import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EFlatten solver = new EFlatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFlatten {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 各素数について考える
            ArrayList<Integer> primes = Prime.eratosthenesSieve(1000000);
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            ModInt[] res = new ModInt[n];
            for (int i = 0; i < n; i++) {
                res[i] = new ModInt(1);
            }
            int[] primeCnt = new int[n];
            int max;

            for (int prime : primes) {
                max = 0;
                for (int i = 0; i < n; i++) {
                    primeCnt[i] = 0;
                    while (a[i] % prime == 0) {
                        a[i] /= prime;
                        primeCnt[i]++;
                    }
                    max = Math.max(max, primeCnt[i]);
                }

                // 素数prime * max にしたいので、それぞれpow(prime, max - primeCnt[i])
                for (int i = 0; i < n; i++) {
                    res[i] = res[i].mul(Arith.pow(prime, max - primeCnt[i], (int) 1e9 + 7));
                }
            }

            ModInt ans = new ModInt(0);
            for (ModInt mi : res) {
                ans = ans.add(mi);
            }
            out.println(ans.getVal());

        }

    }

    static class Arith {
        public static long pow(long a, long n, long MOD) {
            return n == 0 ? 1 : (pow(a * a % MOD, n / 2, MOD) * (n % 2 == 1 ? a : 1)) % MOD;
        }

    }

    static class Prime {
        public static ArrayList<Integer> eratosthenesSieve(int n) {
            // n 以下の素数を列挙する, O(N*log(log N))
            ArrayList<Integer> prime = new ArrayList<>();
            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                nums.add(i);
            }
            while (nums.get(0) <= Math.sqrt(n)) {
                int nxtPrime = nums.get(0);
                prime.add(nxtPrime);
                nums.removeIf(x -> (x % nxtPrime == 0));
            }
            prime.addAll(nums);
            return prime;
        }

    }

    static class ModInt {
        public long val;
        final int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (i + MOD) % MOD;
        }

        public ModInt mul(long l) {
            return new ModInt(this.val * l);
        }

        public ModInt add(ModInt m) {
            return new ModInt(this.val + m.val);
        }

        public long getVal() {
            return val;
        }

        public String toString() {
            return Long.toString(val);
        }

    }
}

