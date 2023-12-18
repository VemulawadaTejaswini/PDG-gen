import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++)
			l[i] = in.nextInt();
		int r = solve(l);
		System.out.println(r);
		in.close();
	}

	private static int solve(int[] l) {
		Arrays.sort(l);
		int r = 0;
		for (int i = l.length - 1; i >= 0; i--)
			for (int j = i - 1; j >= 0; j--) {
				if (l[j] * 2 < l[i])
					break;
				for (int k = j - 1; k >= 0; k--)
					if (l[j] + l[k] <= l[i])
						break;
					else
						r++;
			}
		return r;
	}
}