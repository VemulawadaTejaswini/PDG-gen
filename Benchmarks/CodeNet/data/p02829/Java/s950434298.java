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
		int a = in.nextInt();
		int b = in.nextInt();
		int r = solve(a, b);
		System.out.println(r);
	}

	private static int solve(int a, int b) {
		if (Math.min(a, b) == 1)
			if (Math.max(a, b) == 2)
				return 3;
			else
				return 2;
		else
			return 1;
	}
}