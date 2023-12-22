import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] point = new int[n];
			for (int i = 0; i < n; i++) {
				point[i] = sc.nextInt();
			}
			int max = 0;
			int min = 1000;
			for (int i = 0; i < n; i++) {
				if (point[i] >= max) {
					max = point[i];
				}
				if (point[i] <= min) {
					min = point[i];
				}
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += point[i];
			}
			int ave;
			ave = (sum - max - min) / (n - 2);
			System.out.println(ave);
		}

		sc.close();
	}

}