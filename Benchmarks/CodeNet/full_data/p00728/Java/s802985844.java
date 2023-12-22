import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int sum = 0;
			int max = 0;
			int min = 1000;
			for (int i = 0; i < n; i++) {
				int point = sc.nextInt();
				sum += point;
				max = Math.max(point, max);
				min = Math.min(point, min);
			}
			int result = (sum - max - min) / (n - 2);
			System.out.println(result);
		}
		sc.close();
	}
}