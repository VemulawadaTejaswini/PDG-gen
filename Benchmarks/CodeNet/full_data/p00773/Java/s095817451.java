import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			int s = Integer.parseInt(str[2]);

			if (x == 0 && y == 0 && s == 0)
				break;

			int max = 0;

			for (int i = 1; i < s; i++) {
				for (int j = 1; j < s; j++) {
					int a = changeTax(x, i);
					int b = changeTax(x, j);
					// System.out.println(a + " " + b);
					if (a + b == s) {
						int c = changeTax(y, i);
						int d = changeTax(y, j);
						max = Math.max(max, c + d);
					}
				}
			}
			System.out.println(max);
		}
	}

	static int changeTax(int x, int p) {
		double d = (double) (p * (100 + x)) / 100;
		return (int) Math.floor(d);
	}
}

