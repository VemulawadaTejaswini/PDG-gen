import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int h, w, a, b;
		h = in.nextInt();
		w = in.nextInt();
		a = in.nextInt();
		b = in.nextInt();
		solve(h, w, a, b);
		in.close();
	}

	private static void solve(int h, int w, int a, int b) {
		String x = "";
		String y = "";
		for (int i = 0; i < w; i++)
			if (i < a) {
				x = x.concat("0");
				y = y.concat("1");
			} else {
				x = x.concat("1");
				y = y.concat("0");
			}
		for (int i = 0; i < h; i++) {
			if (i < b)
				System.out.println(x);
			else
				System.out.println(y);
		}
	}
}