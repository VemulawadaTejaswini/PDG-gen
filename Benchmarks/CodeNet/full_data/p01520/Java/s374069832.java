import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int e = in.nextInt();
		int t1 = t - e;
		int t2 = t + e;
		int num = -1;
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (num == -1) {
				for (int j = t1; j <= t2; j++) {
					if (j % x == 0) {
						num = i + 1;
					}
				}
			}
		}
		System.out.println(num);
	}
}