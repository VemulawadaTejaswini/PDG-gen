import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();

			int[] a = new int[n];
			int xor = 0;

			for (int i = 0; i < n; i++) {
				int value = sc.nextInt();
				a[i] = value;
				xor ^= value;
			}

			for (int i = 0; i < n; i++) {
				int value = a[i] ^= xor;
				System.out.print(value + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
