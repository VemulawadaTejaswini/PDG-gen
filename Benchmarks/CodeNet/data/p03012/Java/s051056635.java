
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] w = new int[n];
		int s = 0;
		int[] sum = new int[n];

		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			s += w[i];
			sum[i] = s;
		}

		int min = 10000;

		for (int i = 0; i < n; i++) {
			min = Math.min(min, Math.abs(s - 2 * sum[i]));
		}

		System.out.println(min);
	}

}
