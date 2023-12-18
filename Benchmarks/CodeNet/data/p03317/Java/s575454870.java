import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		int t = n / (k-1);
		int s = (n == k) ? 1 : ((n % (k-1) == 0) ? t : t + 1);

		System.out.println(s);
	}
}