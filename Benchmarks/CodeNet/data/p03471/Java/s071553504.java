import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = true;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n, y;
		n = in.nextInt();
		y = in.nextInt();
		solve(n, y);
		in.close();
	}

	private static void solve(int n, int y) {
		y /= 1000;
		y -= n;
		for (int i = y / 9; i >= 0; i--) {
			int m = y - i * 9;
			if (m / 4 > n - i)
				break;
			if (m % 4 == 0) {
				System.out.println(i + " " + (m / 4) + " " + (n - i - m / 4));
				return;
			}
		}
		System.out.println(-1 + " " + -1 + " " + -1);
	}
}