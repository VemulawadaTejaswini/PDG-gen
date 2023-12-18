import java.util.Scanner;

public class test {
	static int N;
	static int W;
	static int[] w;
	static int[] v;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		W = sc.nextInt();

		w = new int[N];
		v = new int[N];

		for(int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		long value = dp(0, W);

		System.out.println(value);
	}
	static long dp(int i, int u) {
		if(i >= N)
			return 0;
		long value;
		long v1 = 0;
		long v2 = 0;
		if(u >= w[i]) {
			v1 = dp(i + 1, u - w[i]) + v[i];
		}
		value = v2 = dp(i + 1, u);
		if(v1 > v2) {
			value = v1;
		}
		return value;
	}
}
