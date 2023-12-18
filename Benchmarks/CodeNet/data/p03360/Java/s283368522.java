import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		int K = sc.nextInt();

		Arrays.sort(x);
		for (int i = 0; i < K; i++) {
			x[2] *= 2;
		}

		int sum = 0;
		for (int a : x) {
			sum += a;
		}

		System.out.println(sum);

	}
}