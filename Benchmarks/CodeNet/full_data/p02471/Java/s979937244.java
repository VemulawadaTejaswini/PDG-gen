import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		scan.close();
		long[]ans = extendedGCD(a, b);
		System.out.println(ans[0] + " " + ans[1]);
	}
	// as + bt = gcd(a, b)
    static long[] extendedGCD(long a, long b) {
        long s = 0, old_s = 1;
        long t = 1, old_t = 0;
        long r = b, old_r = a;
        while(r != 0) {
            long q = old_r / r;
            long old_s0 = old_s, old_t0 = old_t, old_r0 = old_r;
            old_s = s;
            s = old_s0 - q * s;
            old_t = t;
            t = old_t0 - q * t;
            old_r = r;
            r = old_r0 - q * r;
        }
        return new long[] {old_s, old_t};
    }
}
