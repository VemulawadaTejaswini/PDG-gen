import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = scanner.nextInt();
		}

		
		
//		System.out.println(Arrays.toString(ar));
		
		int q = scanner.nextInt();

		for (int i = 0; i < q; i++) {
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			for (int j = 0; j < n; j++) {
				if (ar[j] == b) {
					ar[j] = ar[c - 1];
				}
			}
			
			int sum=0;
			for (int j = 0; j < ar.length; j++) {
				sum+=ar[j];
			}

			System.out.println(sum);
		}

	}

}