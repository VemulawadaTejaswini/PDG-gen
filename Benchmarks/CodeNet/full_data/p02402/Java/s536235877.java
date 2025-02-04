import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int min = a[0], max = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
			sum += a[i];
		}

		System.out.println(min + " " + max + " " + (int) sum);

		sc.close();
	}
}