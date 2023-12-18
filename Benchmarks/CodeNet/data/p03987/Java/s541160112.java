import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		long sum = 0;
		int min = 1000000;
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			for (int j = i; j < a.length; j++) {
				if (min > a[j])
					min = a[j];
				sum += min;
			}
		}
		System.out.println(sum);

	}
}