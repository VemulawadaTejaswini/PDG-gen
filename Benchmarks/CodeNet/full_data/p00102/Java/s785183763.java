import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n;

	private void mainrun() {
		scan = new Scanner(System.in);

		for(;;) {
			n = scan.nextInt();

			if(n == 0) {
				break;
			}

			looprun();
		}

		scan.close();
	}

	private Integer[][] Matrix;
	private Integer[] sumr;

	private void looprun() {
		Matrix = new Integer[n + 1][n + 1];
		sumr = new Integer[n];

		Arrays.fill(sumr,0);

		for(int i = 0;i < n;i++) {
			int sumc = 0;
			Arrays.fill(Matrix[i], 0);

			for(int j = 0;j < n;j++) {
				Matrix[i][j] = scan.nextInt();

				sumc += Matrix[i][j];
				sumr[j] += Matrix[i][j];

				if(j == n-1) {
					Matrix[i][n] = sumc;
				}
			}
		}

		int sum = 0;

		for(int i = 0;i < n;i++) {
			Matrix[n][i] = sumr[i];
			sum += sumr[i];
		}

		Matrix[n][n] = sum;
		Arrays.asList(Matrix).forEach(e -> {
			Arrays.asList(e).forEach(f -> System.out.printf("%5d",f));
			System.out.println();
		});
	}
}
