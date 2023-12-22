public class Main {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var pw = new java.io.PrintWriter(System.out);
        int t = Integer.parseInt(sc.next());
        while (t --> 0) {
            long n = Long.parseLong(sc.next());
            long m = Long.parseLong(sc.next());
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());
            pw.println(floorSum(n, m, a, b));
        }
        sc.close();
        pw.flush();
        pw.close();
    }

    public static long floorSum(long n, long m, long a, long b) {
        long ans = 0;
        long modsum = 0;
        long v;
        v = (n * (n - 1)) / 2;
        ans += (v / m) * a + ((v % m) * a) / m; modsum += ((v % m) * a) % m;
        ans += (n / m) * b + ((n % m) * b) / m; modsum += ((n % m) * b) % m;
        long s = gcd(m, a), t = m / s;
        long k = n / t, l = n % t;
        v = n - l;
        ans -= (v / m) * (b % s) + ((v % m) * (b % s)) / m; modsum -= ((v % m) * (b % s)) % m;
        ans -= (k * (t - 1)) / 2;
        if ((k * (t - 1)) % 2 == 1) modsum -= m / 2;
        for (long i = 0; i < l; i++) {
            modsum -= (a * i + b) % m;
        }
        ans += modsum / m;
        if (modsum % m != 0) System.out.println("????????????????");
        return ans;
    }

    public static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        if (a == 0) return b;
        for (long r = a % b; r != 0; r = a % b) {
            a = b; b = r;
        }
        return b;
    }
}
