import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();

		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long next = 1;
		for(int num = 0; num < k; num++) {
			next = a[(int)next-1];
		}
		System.out.println(next);
	}
}
