import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		System.out.println(solve(a, b, c));
		in.close();
	}

	private static int solve(int a, int b, int c) {
		a = a - b;
		if (a >= c)
			return 0;
		else
			return c - a;
	}
}