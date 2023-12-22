import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = scanner.nextInt();
		}

		
		
//		System.out.println(Arrays.toString(ar));
		
		int q = scanner.nextInt();

		for (int i = 0; i < q; i++) {
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			for (int j = 0; j < n; j++) {
				if (ar[j] == b) {
					ar[j] = ar[c - 1];
				}
			}

			IntSummaryStatistics iStatistics = Arrays.stream(ar).summaryStatistics();
			System.out.println(iStatistics.getSum());
		}

	}

}
