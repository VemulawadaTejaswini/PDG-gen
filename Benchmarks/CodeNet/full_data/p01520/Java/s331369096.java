import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int e = in.nextInt();
		int t1 = t - e;
		int t2 = t + e;
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int a = t % x;
			if (a <= e || x - a <= e) {
				System.out.println(i + 1);
				System.exit(0);
			}
		}
		System.out.println(-1);
	}
}