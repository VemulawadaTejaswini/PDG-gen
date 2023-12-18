import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n,m;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		int max = 1;
		int min = n;
		int ans = 0;

		for (int i = 0; i < m; i++) {

			int maxTmp,minTmp;

			maxTmp = sc.nextInt();
			minTmp = sc.nextInt();

			max = Math.max(max, maxTmp);
			min = Math.min(min, minTmp);

		}

		ans = min - max + 1;

		if (ans < 1) {
			System.out.println(0);
		} else {
			System.out.println(ans);
		}

	}
}
