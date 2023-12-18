import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		//		int[] a = new int[n];

		//		int sum = 0;
		//		for (int i = 0; i < n; i++) {
		//			a[i] += sc.nextInt();
		//		}

		int min = Integer.MAX_VALUE;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				if (j < i) {
					if (s.charAt(j) == 'W') {
						count++;
					}
				}
				if (j > i) {
					if (s.charAt(j) == 'E') {
						count++;
					}
				}
			}
			min = Math.min(min, count);
		}

		System.out.println(count);

		sc.close();
	}
}