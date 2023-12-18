import java.util.Scanner;

public class Main {
	static int cnt = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		if (k <= n)
			div(n, k);
		System.out.println(cnt);
	}

	private static void div(int n, int k) {
		cnt++;
		int val = n / k;
		if (k <= val) {
			div(val, k);
		}
	}

}