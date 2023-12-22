import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			int[] num = new int[n];

			for (int i = 0; i<n; i++) {
				num[i] = sc.nextInt();
			}

			for (int i = n - 1; i >= 0; i--) {
				System.out.print(num[i]);
				if (i != 0)System.out.print(' ');
			}
			System.out.print('\n');
		}
	}
}
