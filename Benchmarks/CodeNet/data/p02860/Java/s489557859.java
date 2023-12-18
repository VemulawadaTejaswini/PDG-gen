import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		String s = in.next();
		System.out.println(solve(n, s));
	}

	private static String solve(int n, String s) {
		if (n % 2 != 0)
			return "No";
		for (int i = 0, j = n / 2; i < n / 2; i++, j++)
			if (s.charAt(i) != s.charAt(j))
				return "No";
		return "Yes";
	}
}