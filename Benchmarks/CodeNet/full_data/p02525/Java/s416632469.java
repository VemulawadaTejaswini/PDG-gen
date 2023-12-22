import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] point = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				point[i] = sc.nextInt();
				sum += point[i];
			}
			double ave = (double) sum / n;
			double vsum = 0;
			for (int p : point) {
				vsum += Math.pow(p - ave, 2);
			}
			double sigma = vsum / n;
			double alpha = Math.sqrt(sigma);
			System.out.println(alpha);
		}
		sc.close();
	}
}