
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String s = sc.next();
        int rCount = 0;
        int gCount = 0;
        int bCount = 0;
        boolean[] rArr = new boolean[(int) n];
        boolean[] gArr = new boolean[(int) n];
        boolean[] bArr = new boolean[(int) n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                rArr[i] = true;
                rCount++;
            } else if (s.charAt(i) == 'G') {
                gArr[i] = true;
                gCount++;
            } else {
                bArr[i] = true;
                bCount++;
            }
        }


//        Combination combi = new Combination(n + 100, (long) 1e9);

        long opposite = 0;

//        debug(combi.facts);
        // 同じものが2個ある
//        debug(rCount, combi.nck(rCount, 2), (n - rCount));
//        opposite += combi.nck(rCount, 2) * (n - rCount);
//        opposite += combi.nck(gCount, 2) * (n - gCount);
//        opposite += combi.nck(bCount, 2) * (n - bCount);
        opposite += (rCount * (rCount - 1) /  2) * (n - rCount);
        opposite += (gCount * (gCount - 1) /  2) * (n - gCount);
        opposite += (bCount * (bCount - 1) /  2) * (n - bCount);

//        debug(opposite);
        // 3個
        opposite += (rCount * (rCount - 1) * (rCount - 2) / 6);
        opposite += (gCount * (gCount - 1) * (gCount - 2) / 6);
        opposite += (bCount * (bCount - 1) * (bCount - 2) / 6);
//        debug(opposite);

        // j - i == k - j
        for (int i = 2; i < n; i = i + 2) {
            for (int j = 0; j <= n - i - 1; j++) {
//                debug(i ,j);
                if (s.charAt(j) != s.charAt(j + (i / 2)) && s.charAt(j + (i / 2)) != s.charAt(j + i) && s.charAt(j) != s.charAt(j + i)) {
                    opposite++;
                }
            }
        }
//        debug(opposite);
//        debug(combi.nck(n, 3));

        long total = n * (n - 1) * (n - 2) / 6;
        debug(total);

        System.out.println(total - opposite);


    }

    public class Combination {
        int n;
        long mod;
        long[] facts;

        public Combination(int n, long mod) {
            this.n = n;
            this.mod = mod;
            facts = new long[n];
            facts[0] = 1;
            for (int i = 1; i < n; i++) {
                facts[i] = facts[i - 1] * i % mod;
            }
        }

        long modpow(long a, long b) {
            if (b == 0) return 1;
            else if (b == 1) return a;

            long x = modpow(a, b / 2);
            return b % 2 == 0 ? x * x % mod : x * (x * a % mod) % mod;
        }

        long inv(long n) {
            return modpow(n, mod - 2);
        }

        public long nck(int n, int k) {
            if (n < k) return 0;
            return facts[n] * (inv(facts[n - k]) * inv(facts[k]) % mod) % mod;
        }
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
