import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N, K;
	int[] a;
	int sum;
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	/**
	 * アルゴリズム本体
	 */
	private void calc() {
		N = sc.nextInt();
		K = sc.nextInt();
		a = new int[N+1];
		sum = 0;
		for (int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		// sort しておく
		
		// 解は sum の約数の中にある
		// 約数の集合を divisor に入れる
		Set<Integer> divs = new TreeSet<>(); // 昇順
		
		int sqrt = (int)Math.sqrt(sum);
		for (int d = 1; d <= sqrt; d++) {
			if (sum % d != 0) continue;
			divs.add(d);
			divs.add(sum/d);
		}
		List<Integer> divisors = new ArrayList<>();
		divisors.addAll(divs);

		// check(n) <= K となる最大の n を見つける(binary search)
		int min = 0;
		int max = divisors.size();
		int div = -1;
		while (true) {
			if (max - min <= 1) break; // min が答え
			int n = (min+max)/2;
			div = divisors.get(n);
			int k = check(div);
			if (k < K) {
				min = n;
			} else if (k > K) {
				max = n;
			} else {
				min = n;
				break;
			}
		}
		div = divisors.get(min);
		out(div);
	}
	
	/**
	 * d で割り切れる数にできる最小の K を求める。
	 * (1) 各数字を d の倍数(の小さいほう)に設定
	 * (2) sum との差分(d の倍数)を差が大きいものから d ずつ配分
	 */
	private int check(int d) {
		int[] diff = new int[N+1];
		int remain = 0; // 配分すべき sum の残り
		for (int i = 1; i <= N; i++) {
			diff[i] = a[i] % d;
			remain += diff[i];
		}
		Arrays.sort(diff, 1, diff.length); // diff 昇順
		int result = remain; // K
		for (int i = N; i >= 1; i--) { // 必ず途中で終わる
			if (remain == 0) break;
			remain -= d;
			result = result + (d-diff[i]) - diff[i];
			diff[i] -= d;
		}
		return result/2;
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
//======
// main
//
	public static void main(String[] args) {
		Main m = new Main();
		m.calc();
	}

}