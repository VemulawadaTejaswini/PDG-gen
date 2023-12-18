import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[][] x = new int[n][d];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				x[i][j] = in.nextInt();
			}
		}
		int c = 0;

		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				int sum = 0;
				for(int k = 0; k < d; k++) {
					sum += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
				}
				if(Math.sqrt((double)sum) % (double)1 == (double)0) {
					c++;
				}

			}
		}

		System.out.println(c);
	}
}
