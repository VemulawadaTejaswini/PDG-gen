import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int pre = sc.nextInt();
		for (int i = 0; i < n - 1; i++) {
			int cur = sc.nextInt();
			sum += Math.min(a * (cur - pre), b);
			pre = cur;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
