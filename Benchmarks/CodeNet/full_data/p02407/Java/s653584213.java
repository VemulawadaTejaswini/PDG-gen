import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		opi(a);
		for (int i = 0; i < n -1; i++)
			System.out.print(a[i] + " ");
		System.out.println(a[n-1]);
		sc.close();
	}

	static void opi(int[] x) {
		for (int i = 0; i < x.length / 2; i++) {
			int j = x.length - 1 - i;
			int temp = x[i];
			x[i] = x[j];
			x[j] = temp;
		}
	}
}
