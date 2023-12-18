import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] dCnt = new int[1000000000];
		int[] tCnt = new int[1000000000];

		for (int i = 0; i < 1000000000; i++) {
			dCnt[i] = 0;
			tCnt[i] = 0;
		}

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			dCnt[temp - 1]++;
		}

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int temp = sc.nextInt();
			tCnt[temp - 1]++;
		}

		boolean ans = true;
		for (int i = 0; i < 1000000000; i++) {
			if (dCnt[i] < tCnt[i]) {
				ans = false;
			}
		}
		if	(ans) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}

	}

}
