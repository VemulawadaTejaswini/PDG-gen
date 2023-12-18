import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	static final int MAX = 1900000;
	static final long MOD = 1000000000 + 7;
	static long[]fact = new long[MAX];
	static long[]factInv = new long[MAX];
	static long[]inv = new long[MAX];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.close();
		List<Integer> list = new ArrayList<Integer>();

		if(M % 2 == 0) {
			int cnt = 1;
			M = M / 2;
			while(M % 2 == 0) {
				M = M / 2;
				cnt ++;
			}
			list.add(cnt);
		}

		for(int i = 3; i <= M; i += 2) {
			if(M % i == 0) {
				int cnt = 1;
				M = M / i;
				while(M % i == 0) {
					M = M / i;
					cnt++;
				}
				list.add(cnt);
			}
		}
		factMOD();
		invMOD();
		factInvMOD();
		long ans = 1;
		for(int i : list) {
			ans *= combMOD(N + i - 1, i) % MOD;
		}
		System.out.println(ans % MOD);
	}

	//
	static void factMOD() {
		fact[0] = 1;
		for(int i = 1; i < MAX; i++) {
			fact[i] = fact[i - 1] * i % MOD;
		}
	}
	static void invMOD() {
		inv[0] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			inv[i] = MOD - inv[(int)MOD % i] * (MOD / i) % MOD;
		}
	}
	static void factInvMOD() {
		factInv[0] = 1;
		for(int i = 1; i < MAX; i++) {
			factInv[i] = factInv[i - 1] * inv[i] % MOD;
		}
	}
	static long combMOD(int n, int k) {
		if(n < k) return 0;
		if(n < 0 || k < 0) return 0;
		return fact[n] * (factInv[k] * factInv[n - k] % MOD) % MOD;
	}
}
