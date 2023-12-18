import java.util.Scanner;

public class Main {
	static long mod;
	static long right;
	static long left;
	static long tate = 1;
	static long mid;
	static long index;
	static long max;
	static long x;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();

		max = 0;
		for (int i = 2; i >= 0; i--) {
			for (int j = 2; j >= 0; j--) {
				// System.out.println(n-i+" "+(7-j));
				long sell = 7 * (n - i) + (7 - j) - 7;
				// System.out.println(sell);
				max += sell;
			}
		}
		//System.out.println(max);

		long j = 0;
		x = k;
		long pattern = 0;
		while (x <= max) {// 一回数が見つかれば、あとは99を足していくだけでいい
			// System.out.println(x);
			if (!(x - 81 < 0) && (x - 81) % 9 == 0) {
				for (int i = 0; i < 5; i++) {
					if (((x - 81) / 9 - i) % 7 == 0 && ((x - 71) / 9 - i) / 7 + 1 <= n) {
						// System.out.println("縦"+(((x-71)/9-i)/7+1)+"
						// 横"+(i+1));
						// System.out.println(x);
						right = (4 - i);// * 9;
						left = -i;// * 9;
						mid = i;
						mod = 0;
						pattern++;
						break;
					}
				}
			}
			if (pattern == 1)
				break;
			x += 11;// どうやってxの増やす数を変える？
		}
		//System.out.println(x);

		if (pattern != 0) {
			while (x + increase() <= max) {
				//System.out.println("a");
				pattern++;
			}
		}

		System.out.println(pattern);
	}

	static long increase() {
		mod += 11;
		boolean flag = false;
		while (mod <= max-x) {// 縦、横を先に指定する。
			for (int i = 0; i < 5; i++) {
				long move = i - mid;
				if ((mod - move * 9) % 63 == 0)flag = true;
			}
			tate++;
			if(flag)break;
			mod += 11;
		}
		//System.out.println(mod);
		return mod;
	}
}