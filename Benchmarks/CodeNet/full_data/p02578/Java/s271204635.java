import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();

		long ans = 0;
		int h = a[0];
		for (int i = 1; i < n; i++)
			if (a[i] < h)
				ans += h - a[i];
			else
				h = a[i];
		System.out.println(ans);
	}
}
