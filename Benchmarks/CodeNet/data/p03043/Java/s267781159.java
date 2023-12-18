import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		double ans = 0;
		for (int i = 1; i <= n; i++) {
			int tmp = i;
			int j = 0;
			for (j = 0; tmp <= k; j++)
				tmp *= 2;
			ans += Math.pow(0.5, j) / (double) n;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		new Main().run();
	}

}
