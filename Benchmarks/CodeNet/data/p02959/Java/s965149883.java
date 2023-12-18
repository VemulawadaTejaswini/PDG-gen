import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n + 1];
		int[] b = new int[n + 2];

		for (int i = 0; i < n + 1; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sc.next());
		}

		long sum = 0;
		int c = 0;
		int diff = 0;

		for (int i = 0; i < n + 1; i++) {
			diff = a[i] - b[i] - c;
			if (diff > 0) {
				sum += b[i] + c;
			} else if (diff == 0) {
				sum += a[i];
			} else {
				sum += a[i];
				if (a[i] - c > 0) {
					diff = b[i] - a[i] + c;
				} else {
					diff = b[i];
				}
				c = diff;
			}
		}

		System.out.println(sum);

	}

}
