import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0520-input.txt"));

		while (scan.hasNext()) {
			int r = scan.nextInt();
			int c = scan.nextInt();
			if (r == 0)
				break;

			Senb s = new Senb(r, c);
			for (int i = 0; i < r; i++)
				for (int j = 0; j < c; j++)
					s.add(i, j, scan.nextInt());

			System.out.println(s.answer());
		}
		scan.close();
		System.exit(0);
	}
}

class Senb {
	private int[] senb;
	private int R, C;

	public Senb(int r, int c) {
		R = r;
		C = c;
		senb = new int[C];
	}

	public int answer() {
		int to = (1 << R);
		int max = 0;
		for (int i = 0; i < to; i++) {
			max = Math.max(this.testR(i), max);
		}
		return max;
	}

	private int testR(int pat) {
		int tot = 0;
		for (int i = 0; i < C; i++) {
			int n = Integer.bitCount(senb[i] ^ pat);
			tot += Math.max(n, R - n);
		}
		return tot;
	}

	public void add(int r, int c, int f) {
		if (f == 1)
			senb[c] |= (1 << r);
	}

}