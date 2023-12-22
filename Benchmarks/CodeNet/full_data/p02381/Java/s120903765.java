import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();

			if(n == 0) break;

			int[] scores = new int[n];

			int sum = 0;
			for (int i = 0; i < n; i++) {
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
			double ave = (double)sum/n;

			double dev = 0;
			for (int i = 0; i < n; i++) {
				double tmp = scores[i] - ave;
				dev += tmp * tmp;
			}
			dev = Math.pow(dev/n, 0.5);

			System.out.println(dev);
		}
	}
}