import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		int[] rate = new int[N];
		int over = 0;
		int minColors = 0;
		int maxColors = 0;

		boolean[] c = new boolean[8];
		
		for (int i = 0; i < N; i++) {
			rate[i] = sc.nextInt();
			if(rate[i]>=3200) {
				over++;
			}
			else {
				c[(int)(rate[i]/400)] = true;
			}
		}

		for (boolean b: c) {
			if (b) {
				minColors++;
			}
		}
		
		maxColors = minColors + over;
		System.out.printf("%d %d\n", Math.max(minColors, 1), maxColors);
		sc.close();
	}

}
