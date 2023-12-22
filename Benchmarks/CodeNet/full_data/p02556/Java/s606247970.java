import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();

			int[] x = new int[n];
			int[] y = new int[n];

			int minValue = Integer.MAX_VALUE;
			int minIndex = -1;
			int maxValue = Integer.MIN_VALUE;
			int maxIndex = -1;

			for (int i = 0; i < n; i++) {
				int a = x[i] = sc.nextInt();
				int b = y[i] = sc.nextInt();

				int u = a + b;
				if (u < minValue) {
					minValue = u;
					minIndex = i;
				}
				if (maxValue < u) {
					maxValue = u;
					maxIndex = i;
				}
			}
			
			System.out.println(Math.abs(x[minIndex]-x[maxIndex]) + Math.abs(y[minIndex]-y[maxIndex]));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}