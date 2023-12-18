import java.util.Scanner;

public class Main {
	static int ans = 1;
	static int min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		min = a[0];
		for (int i = 1; i < n; i++) {
			check(n, a, i);
		}

		System.out.println(ans);
	}

	public static void check(int n, int[] a, int i) {
		if (a[i] < min) {
			min = a[i];
			ans++;
		}
	}

}
