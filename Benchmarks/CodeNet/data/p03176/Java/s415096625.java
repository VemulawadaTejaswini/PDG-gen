import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] H = new int[N];
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		BIT bit = new BIT(N);
		int[] pos = new int[N];
		for (int i = 0; i < N; i++) {
			pos[H[i] - 1] = i;
		}
		for (int i = 0; i < N; i++) {
			int p = pos[i];
			long max = bit.cumulativeSum(p);
			bit.add(p + 1, max + A[p]);
		}
		long ans = 0;
		for (int i = 0; i <= N; i++) {
			ans = Math.max(ans, bit.v[i]);
		}
		System.out.println(ans);
	}

	static class BIT {
		long[] v;

		BIT(int size) {
			int len = 1;
			while (len < size) {
				len *= 2;
			}
			this.v = new long[len + 1];
		}

		long cumulativeSum(int index) {
			long ret = 0;
			while (index > 0) {
				ret = Math.max(ret, v[index]);
				index &= index - 1;
			}
			return ret;
		}

		void add(int index, long val) {
			while (index < v.length) {
				v[index] = Math.max(v[index], val);
				index += (index & -index);
			}
		}
	}


}