import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		int sum = 0;
		int i = 0;
		for (int j = i + 1; j < n; j++) {
			if (a[i] >= a[j]) {
				sum += a[i] - a[j];
			} else {
				i = j;
			}
		}
		System.out.println(sum);
	}
}