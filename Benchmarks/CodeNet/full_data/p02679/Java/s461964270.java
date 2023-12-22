
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(scan.next());
            b[i] = Long.parseLong(scan.next());
        }
        scan.close();

        int zeroCount = 0;

        // a,b,個数
        Map<Pair, Pair> countMap = new HashMap<Pair, Pair>();
        countMap.put(new Pair(0, 1), new Pair(0, 0));
        for (int i = 0; i < n; i++) {
            if (a[i] == 0 && b[i] == 0) {
                zeroCount++;
                continue;
            }

            if (a[i] == 0) {
                countMap.get(new Pair(0, 1)).a++;
                continue;
            }
            if (b[i] == 0) {
                countMap.get(new Pair(0, 1)).b++;
                continue;
            }

            if (a[i] < 0) {
                a[i] *= -1;
                b[i] *= -1;
            }

            boolean rot90 = (b[i] < 0);
            if (rot90) {
                long temp = a[i];
                a[i] = -b[i];
                b[i] = temp;
            }
            long gcd = gcd(Math.abs(a[i]), Math.abs(b[i]));
            Pair count = countMap.get(new Pair(a[i] / gcd, b[i] / gcd));
            if (count == null) {
                count = new Pair(0, 0);
                countMap.put(new Pair(a[i] / gcd, b[i] / gcd), count);
            }
            if (rot90) {
                count.a++;
            } else {
                count.b++;
            }
        }

        long ans = 1;
        for (Pair p : countMap.values()) {
            long total = 1;
            total += modPow(2, p.a) - 1;
            total %= mod;
            total += modPow(2, p.b) - 1;
            total %= mod;
            ans *= total;
            ans %= mod;
        }

        ans += zeroCount;
        ans %= mod;
        ans -=1;
        ans %= mod;
        System.out.println(ans);
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    public static long modPow(long a, long b) {
        if (b == 0) {
            return 1;
        }

        if (b % 2 == 0) {
            return modPow(a * a % mod, b / 2);
        } else {
            return modPow(a * a % mod, (b - 1) / 2) * a % mod;
        }
    }

    static class Pair {
        long a;
        long b;

        public Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + (int)(a ^ (a >>> 32));
            result = prime * result + (int)(b ^ (b >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pair other = (Pair)obj;
            if (a != other.a)
                return false;
            if (b != other.b)
                return false;
            return true;
        }

    }

}
