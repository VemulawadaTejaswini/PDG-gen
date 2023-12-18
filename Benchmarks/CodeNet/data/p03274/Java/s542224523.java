import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception {

		int N = 0;
		int K = 0;
		int X;
		int lOCATION[] = null;
		int ans = (int) (2 * Math.pow(10, 15));

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		if (N >= 1 && N <= (int) Math.pow(10, 5)) {
			lOCATION = new int[N];
			K = sc.nextInt();
			sc.nextLine();
			if (K >= 1 && K <= N) {
				for (int i = 0; i <= N - 1; i++) {
					X = sc.nextInt();
					if (Math.abs(X) >= 1 && Math.abs(X) <= Math.pow(10, 8)) {
						lOCATION[i] = X;

					}

				}

			}

		}
		for (int i = 0; i + K - 1 <= N - 1; i++) {
			int l = i;
			int r = i + K - 1;
			ans = Math.min(ans, lOCATION[r] - lOCATION[l] + Math.min(Math.abs(lOCATION[l]), Math.abs(lOCATION[r])));
		}
		System.out.println(ans);
	}
}
