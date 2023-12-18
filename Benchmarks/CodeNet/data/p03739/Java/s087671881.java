import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int ops = 0;
		int[] sums = new int[n];

		for (int i = 0; i < n; i++) {
			int ai = sc.nextInt();
			sums[i] = (i == 0) ? ai : sums[i - 1] + ai;
			if (sums[i] == 0) {
				ops++;
				sums[i] = (sums[i - 1] > 0) ? -1 : 1;
			} else if (i > 0 && sums[i - 1] * sums[i] > 0) {
				if (sums[i] > 0) {
					ops += sums[i] + 1;
					sums[i] = -1;
				} else if (sums[i] < 0) {
					ops += 1 - sums[i];
					sums[i] = 1;
				}
			}
		}

		System.out.println(ops);

		sc.close();
	}

}
