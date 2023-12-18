import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int counter = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == counter + 1) counter++;
		}

		if (counter == 0 && a[0] != 1) {
			System.out.println(-1);
			return;
		}

		System.out.println(n - counter);
	}
}
