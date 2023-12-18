// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	long ch(int n, int k) {
		return k == 0 ? 1 : ch(n - 1, k - 1) * n / k;
	}
	void main() {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long[] vv = new long[n];
		for (int i = 0; i < n; i++)
			vv[i] = sc.nextLong();
		vv = Arrays.stream(vv).boxed().sorted((u, v) -> Long.signum(v - u)).mapToLong($->$).toArray();
		long sum = 0; int cnt = 0;
		long sum_ = 0; int cnt_ = 1; long ways = 0;
		for (int i = 0, j; i < n; i = j) {
			j = i + 1;
			while (j < n && vv[j] == vv[i])
				j++;
			int k = j - i;
			for (j = i; j < n && vv[j] == vv[i]; j++) {
				sum += vv[j];
				cnt++;
				if (a <= j + 1 && j + 1 <= b) {
					if (sum_ * cnt < sum * cnt_) {
						sum_ = sum;
						cnt_ = cnt;
						ways = ch(k, j - i + 1);
					} else if (sum_ * cnt == sum * cnt_)
						ways += ch(k, j - i + 1);
				}
			}
		}
		printf("%f\n%d\n", (double) sum_ / cnt_, ways);
	}
}
