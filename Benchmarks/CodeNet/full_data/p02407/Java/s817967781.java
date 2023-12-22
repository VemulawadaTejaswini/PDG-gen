import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[n - i - 1]);
			if (i < n - 1)
				System.out.print(' ');
		}
		System.out.println();
	}

}

