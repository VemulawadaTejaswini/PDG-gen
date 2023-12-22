
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, sum = 0, j = 0;
		double ave = 0, var = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] point = new int[n];
			for (i = 0; i < n; i++) {
				point[i] = sc.nextInt();
				sum += point[i];
			}
			ave = (double) sum / n;
			for (i = 0; i < n; i++) {
				j += (point[i] - ave) * (point[i] + ave);
			}
			var = (double) j / n;
			System.out.println(Math.sqrt(var));
		}
	}

}