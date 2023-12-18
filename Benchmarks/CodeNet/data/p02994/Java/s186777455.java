import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int l = in.nextInt();
		System.out.println(solve(n, l));
		in.close();
	}

	private static int solve(int n, int l) {
		int r = 0;
		int e = 99999;
		for (int i = 1; i <= n; i++) {
			int a = l + i - 1;
			r += a;
			if (Math.abs(e) > Math.abs(a))
				e = a;
		}
		return r - e;
	}

}
