import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long k = Long.parseLong(sc.next());

		int[] a = new int[n+1];

		for(int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		int now = 1;

		for (int i = 1; i <= k; i++) {
			//System.out.println(now);
			now = a[now];
		}

		System.out.println(now);
	}

}