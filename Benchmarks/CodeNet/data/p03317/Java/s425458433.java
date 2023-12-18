import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int[] a = new int[n];
		int t = n / (k-1);
		int r = n % (k-1);
		int s;
		s = (n == k) ? 1 : ((r == 0 || r == 1) ? t : t + 1);
		if (k == 2)
			s = n - 1;
		System.out.println(s);
	}
}