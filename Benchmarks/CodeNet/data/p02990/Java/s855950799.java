import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prepareFact();
		int num = sc.nextInt();
		int k = sc.nextInt();
		for(int i = 1; i <= k; i ++) {
			long ans = combiMod(num - k + 1, i);
			long mul = combiMod(k - i + i - 1, i - 1);
			ans = mod(ans * mul);
			System.out.println(ans);
		}
	}

	static long MOD = (long)Math.pow(10, 9) + 7;
	public static long mod(long i) {
		return i % MOD + ((i % MOD) < 0 ? MOD : 0);
	}
	
	static long powerMod(long x, long y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;
		} else if (y % 2 == 0) {
			long tmp = powerMod(x, y / 2);
			return mod(tmp * tmp);
		} else {
			long tmp = powerMod(x, y / 2);
			return mod(mod(tmp * tmp) * x);
		}
	}
	
	static long invMod(long x) {
		return powerMod(x, MOD - 2);
	}
	
	static int MAX_FACT = 20_100;
	static long factMod[] = new long[MAX_FACT];
	static void prepareFact() {
		factMod[0] = 1;
		for(int i = 1; i < MAX_FACT; i ++) {
			factMod[i] = mod(factMod[i - 1] * i);
		}
	}
	
	static long combiMod(int n, int r) {
		if(n < 0 || n < r) { return 0; }
		if(r == 0 || r == n) { return 1; }
		return mod(mod(factMod[n] * invMod(factMod[r])) * invMod(factMod[n - r]));
	}
}