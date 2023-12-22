import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(tokens[i]);
		int h = a[0];
		long ans = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] <= h)
				ans += h-a[i];
			else
				h = a[i];
		}
		System.out.println(ans);
	}
}
