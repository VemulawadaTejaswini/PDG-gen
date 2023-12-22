import java.util.Scanner;

public class ScoreTotalizer {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			int n = s.nextInt();

			if (n == 0)
				break;

			int[] a = new int[n];
			int max = 0;
			int min = 0;
			int sum = 0;
			int ave = 0;

			for (int t = 0; t < n; t++) {
				a[t] = s.nextInt();
			}

			max = a[0];
			min = a[0];

			for (int i = 0; i < n; i++) {
				if (max <= a[i])
					max = a[i];

				if (min >= a[i])
					min = a[i];

				sum += a[i];
			}

			sum = sum - max - min;
			ave = sum / (n - 2);

			System.out.println(ave);
		}
	}
}