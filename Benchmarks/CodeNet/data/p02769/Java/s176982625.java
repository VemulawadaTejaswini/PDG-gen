import java.util.*;

public class Main {
	static final int r = 1000000000 + 7;
	static int n;
	static long fact[], finv[], inv[];
	
	public static void cominit() {
		fact = new long[n + 2];
		finv = new long[n + 2];
		inv = new long[n + 2];
		fact[0] = fact[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < n + 2; ++i) {
			fact[i] = (fact[i - 1] * i) % r;
			inv[i] = r - (inv[r % i] * (r / i)) % r;
			finv[i] = (finv[i - 1] * inv[i]) % r;
		}
	}
	
	public static int comb(int n, int k) {
		if(n < k)return 0;
		if(k < 0 || n < 0)return 0;
		if(k == 0)return 1;
		
		return (int)((fact[n] * (finv[k] * finv[n - k] % r)) % r);
	}

	public static int homogenerous(int x, int y) {
		return comb(x + y - 1, x - 1);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int k = sc.nextInt();
		cominit();
		sc.close();
		long ans = 0;
		for(int i = 0; i <= k; ++i){
			long tmp = (long)comb(n, i) % (long)r;
			tmp *= (long)homogenerous(n - i, i);
			tmp %= (long)r;
			ans += tmp;
			ans %= (long)r;
		}
		System.out.println(ans);
	}
}
