import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while ((n = sc.nextInt()) != 0) {
			int max = 0, min = 1000, sum = 0;
			for (int i = 0; i < n; i++) {
				int score = sc.nextInt();
				sum += score;
				if (max < score)
					max = score;
				if (min > score)
					min = score;
			}

			sum -= min;
			sum -= max;
			System.out.println(sum / (n - 2));
		}

	}
}