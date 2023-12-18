import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		double bestTemp = Math.abs((t-h[0]*0.006) - a);
		int num = 1;

		for (int i = 1; i < n; i++) {
			if (Math.abs((t-h[i]*0.006) - a) < bestTemp) {
				bestTemp = Math.abs((t-h[i]*0.006) - a);
				num = i + 1;
			}
		}

		System.out.println(num);

	}
}