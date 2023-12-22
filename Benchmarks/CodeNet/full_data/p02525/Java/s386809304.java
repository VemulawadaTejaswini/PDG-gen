import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double alpha;
		int score[];
		int sum = 0;
		int dsum = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			score = new int[n];
			for (int i = 0; i < score.length; i++) {
				score[i] = sc.nextInt();
				sum += score[i];
			}
			double m = sum / n;
			for (int j = 0; j < score.length; j++) {
				double dev = (score[j] - m) * (score[j] - m);
				dsum += dev;
			}

			double alpha2 = dsum / n;
			alpha = Math.sqrt(alpha2);
			System.out.println(alpha);
			
		}
	}

}