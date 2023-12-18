import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();

		long m = k % ((long)n);
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long next = 1;
		for(int num = 0; num < n; num++) {
			next = a[(int)next-1];
		}
		for(int num = 0; num < m; num++) {
			next = a[(int)next-1];
		}
		System.out.println(next);
	}
}
