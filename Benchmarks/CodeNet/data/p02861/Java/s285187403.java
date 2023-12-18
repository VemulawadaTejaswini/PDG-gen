import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = i + 1;
		}
		double[] x = new double[N];
		double[] y = new double[N];
		for (int i = 0; i < N; i++) {
			x[i] = in.nextDouble();
			y[i] = in.nextDouble();
		}
		double count = 0;
		double ans = 0;
		do {
			for (int i = 0; i < N - 1; i++) {
				ans += Math
						.sqrt(Math.pow(x[p[i] - 1] - x[p[i + 1] - 1], 2) + Math.pow(y[p[i] - 1] - y[p[i + 1] - 1], 2));
			}
			count++;
		} while (nextPermutation(p));
		System.out.println(String.format("%.6f", ans / count));
		in.close();
	}

	static boolean nextPermutation(int[] array) {
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;

		if (i <= 0)
			return false;

		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;

		int temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return true;
	}
}