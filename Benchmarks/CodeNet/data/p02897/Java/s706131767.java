import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		//		//int k = Integer.parseInt(sc.next());
		//		int[] x = new int[n];
		//
		//		for (int i = 0; i < n; i++) {
		//			x[i] = Integer.parseInt(sc.next());
		//		}

		double e = 1 - (double) (n / 2) / n;

		System.out.println(e);
		sc.close();
	}
}