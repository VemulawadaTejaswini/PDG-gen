import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int num = stdin.nextInt();
		int[] x = new int[num];
		for (int i = 0; i < num; i++) {
			x[i] = stdin.nextInt();
		}

		for (int i = 0; i < num; i++) {
			int cost = 0;
			int prev = 0;
			for (int j = 0; j < num; j++) {
				if (j != i) {
					cost += Math.abs(x[j] - prev);
					prev = x[j];
				}
			}
			cost += Math.abs(prev);

			System.out.println(cost);
		}
	}

}
