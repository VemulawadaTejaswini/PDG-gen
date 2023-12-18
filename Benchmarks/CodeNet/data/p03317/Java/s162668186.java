import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		System.out.println((int)Math.ceil((n - 1) / (c - 1)));
	}
}
