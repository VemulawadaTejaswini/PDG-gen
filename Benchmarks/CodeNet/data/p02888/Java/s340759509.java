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
		int r = 0;
		for (int i = 0; i < l.length; i++)
			for (int j = i + 1; j < l.length; j++)
				for (int k = j + 1; k < l.length; k++)
					if (isTr(l[i], l[j], l[k]))
						r++;
		return r;
	}

	private static boolean isTr(int a, int b, int c) {
		if (a >= b + c)
			return false;
		if (b >= a + c)
			return false;
		if (c >= a + b)
			return false;
		return true;
	}
}