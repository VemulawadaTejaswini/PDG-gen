import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveE();
	}

    private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N + 1];
		long sum = 0L;
		for (int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		for (int x = 100; x > 0; x--) {
			long tmp = 0L;
			for (int nx = x; nx <= 100; nx += x) {
				tmp += a[nx];
			}
			if (tmp < 0) {
				for (int nx = x; nx <= 100; nx += x) {
					a[nx] = 0;
				}
				sum -= tmp;
			}
		}
		System.out.println(sum);
	}
}