import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++)
			h[i] = in.nextInt();
		boolean[] t = new boolean[n];
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			if (h[a] <= h[b])
				t[a] = true;
			if (h[a] >= h[b])
				t[b] = true;
		}
		int r = 0;
		for (int i = 0; i < n; i++)
			if (!t[i])
				r++;
		System.out.println(r);
	}
}