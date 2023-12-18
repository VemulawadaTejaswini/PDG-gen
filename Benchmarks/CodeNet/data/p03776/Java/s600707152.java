import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = Integer.parseInt(scn.next());
		int A = Integer.parseInt(scn.next());
		int B = Integer.parseInt(scn.next());

		long[] vs = new long[N];
		for (int i = 0; i < N; i++) {
			vs[i] = Long.parseLong(scn.next());
		}
		scn.close();

		Arrays.sort(vs);

		boolean flag = false;

		long sum = 0;
		int i;
		for (i = 0; i < A; i++) {
			sum += vs[N - i - 1];
			if (vs[N - 1] != vs[N - i - 1]) {
				flag = true;
			}
		}
		long tmp = vs[N - i];

		int count = 0;
		if (flag == false) {
			for (; i < B; i++) {
				if (tmp <= vs[N - i - 1]) {
					sum += vs[N - i - 1];
					count++;
				}
			}
		}

		System.out.printf("%.6f\n", sum / i + ((double) (sum % i) / (double) i));

		if (flag) {
			System.out.println(A + 1);
		} else {
			System.out.println("AAAAA");
			System.out.printf("%.0f\n", Math.pow(2, count + 1) - 1);
		}
	}
}
