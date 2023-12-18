import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			int pre = 0;
			sum = 0;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				sum += Math.abs(pre - a[j]);
				pre = a[j];
			}
			sum += Math.abs(pre);
			System.out.println(sum);
		}
		
		sc.close();
	}
}
