import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		long[] A = new long[N];

		for (int i = 0; i < N; i++) {
			long ai = sc.nextLong();
			A[i] = ai;
		}

		long cnt = 0;
		if (A[0] == 0) {
			if (A[1] > 0) {
				A[0] = -1;
			} else {
				A[0] = 1;
			}
			cnt++;
		}
		long sum = A[0];

		for (int i = 1; i < N; i++) {
			if (sum > 0) {
				if (sum + A[i] >= 0) {
					cnt += sum + A[i] + 1;
					A[i] = -sum - 1;
					sum = -1;
				} else {
					sum = sum + A[i];
				}
			} else {// sum <0
				if (sum + A[i] <= 0) {
					cnt += (sum + A[i]) * -1 + 1;
					A[i] = -sum + 1;
					sum = 1;
				}else{
					sum = sum + A[i];
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
