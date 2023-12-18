import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt()+1;
		int[] a = new int[n];
		int[] b = new int[n - 1];
		long sum = 0;
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < n - 1; i++)
			b[i] = sc.nextInt();
		for (int i = 0; i < n-1; i++) {
			if (b[i] > a[i]) {
				sum += a[i];
				b[i] = b[i] - a[i];
				if (b[i] > a[i + 1]) {
					sum += a[i + 1];
					a[i + 1] = 0;
				} else {
					sum += b[i];
					a[i + 1] = a[i + 1] - b[i];
				}
			}else {
				sum += b[i];
			}
		}
		System.out.println(sum);
	}
}