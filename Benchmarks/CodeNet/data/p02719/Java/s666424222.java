import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		long N = sc.nextLong();
		long K = sc.nextLong();
		long x = Math.abs(N - ((N / K) * K));
		
		int i = 0;
		while (i == 0) {
			long abs = Math.abs(x-K);
			if (abs < x) {
				x = abs;
			} else {
				break;
			}
		}
		System.out.println(x);			
	}

	
	// ユークリッドの控除法(最大公約数を求める)
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	// 複数の最大公約数を求める
	private static long gcdex(long param[]) {
		long g = gcd(param[0], param[1]);
		for (int i = 1; i < param.length-1; i++) {
			g = gcd(g, param[i+1]);
		}
		return g;
	}

	// 最小公倍数を求める
	private static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}

	//
	private static long all(long n, long count, int N) {
		if (count == N) {
			return count;
		}
		return all(1, count, N);
	}

}