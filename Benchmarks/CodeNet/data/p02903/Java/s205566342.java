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
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++)
				if ((i < b) ^ (j < a))
					System.out.print("1");
				else
					System.out.print("0");
			System.out.print("\n");
		}
	}
}