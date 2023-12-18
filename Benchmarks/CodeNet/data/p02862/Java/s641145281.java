
import java.util.Scanner;

public class Main {

	public static long div = (long) (Math.pow(10, 9) + 7);

	public static long[] f = new long[1000000];
	public static long[] finv = new long[1000000];
	public static long[] inv = new long[1000000];

	public static void Init() {
		f[0] = 1;
		f[1] = 1;
		finv[0] = 1;
		finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < 1000000; i++) {
			f[i] = f[i - 1] * i % div;
			inv[i] = div - inv[(int) div % i] * (div / i) % div;
			finv[i] = finv[i - 1] * inv[i] % div;
		}
	}

	public static long Com(int n, int k) {
		if(n < k)
			return 0;
		if(n < 0 || k < 0)
			return 0;
		return f[n] * (finv[k] * finv[n - k] % div) % div;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		int xcnt = x - y;
		y -= xcnt;
		if(y % 3 != 0) {
			System.out.println(0);
		} else {
			xcnt += y / 3;
			int ycnt = y / 3;
			Init();
			long ans = Com(xcnt + ycnt, ycnt);
			System.out.println(ans);
		}

	}

}
