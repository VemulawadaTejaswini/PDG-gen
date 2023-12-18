import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] a = new long[N];
		long sum = 0L;
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			sum += a[i];
		}
		long min = sum + abs(a[0]) * 2 + 1;
		long sum2 = 0L;
		for (int i = 0; i < N - 1; i++) {
			sum -= a[i];
			sum2 += a[i];
			if (min > abs(sum - sum2)) {
				min = abs(sum - sum2);
			}
		}
		System.out.println(min);
	}

	private long abs(long n) {
		return n > 0 ? n : -n;
	}
}