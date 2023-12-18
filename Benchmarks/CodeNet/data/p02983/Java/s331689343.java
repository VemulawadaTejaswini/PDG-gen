import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int l = in.nextInt();
		int r = in.nextInt();
		System.out.println(solve(l, r));
		in.close();
	}

	private static int solve(int l, int r) {
		int x = l / 2019;
		x *= 2019;
		if (x == l)
			return 0;
		x += 2019;
		if (x <= r)
			return 0;
		return (l % 2019) * (l % 2019 + 1);
	}
}
