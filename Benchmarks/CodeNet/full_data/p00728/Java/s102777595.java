import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] scores = new int[n];

			for (int i = 0; i < n; i++) {
				scores[i] = sc.nextInt();
			}

			int average = 0;
			int max = checkMax(scores);
			int min = checkMin(scores);
			for (int i = 0; i < n; i++) {
				if (i == max || i == min) {
					continue;
				}
				average += scores[i];
			}
			average /= n - 2;
			System.out.println(average);
		}
	}

	public static int checkMax(int num[]) {
		int max = -1;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max)
				max = i;
		}
		return max;
	}

	public static int checkMin(int num[]) {
		int min = 1001;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min)
				min = i;
		}
		return min;
	}

}