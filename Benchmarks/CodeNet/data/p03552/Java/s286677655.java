import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveD();
	}

    private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Z = sc.nextInt();
		int W = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int ans1 = Math.abs(a[N-1] - W);
		int ans2 = ans1;
		if (N > 1) {
			ans2 = Math.abs(a[N - 1] - a[N - 2]);
		}
		System.out.println(ans1 > ans2 ? ans1 : ans2);
	}
}