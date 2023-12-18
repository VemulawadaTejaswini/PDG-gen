import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] num = new int[100001];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt() - 1;
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (a[a[i]] == i) {
				ans++;
			}
		}
		System.out.println(ans / 2);
	}
}
