import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			b[i] = a[n - i - 1];
			System.out.print(b[i]);
			if (i == a.length)
				break;
			System.out.print(" ");
		}
		System.out.println();
		sc.close();
	}
}
