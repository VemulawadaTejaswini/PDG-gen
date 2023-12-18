import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			int xor = a[i];
			int sum = a[i];
			for (int j = i + 1; j < n; j++) {
				xor = ~((xor & a[j]) | (~(xor | a[j])));
				sum = sum += a[j];
				if (xor == sum) {
					count++;
				}
			}
		}
		System.out.println(count + n);
	}
}
