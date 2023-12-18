import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			x -= a[i];
			if (x < 0)
				break;
			ans++;
		}

		System.out.println(x > 0 ? --ans : ans);
		sc.close();
	}

}
