import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int time = 0;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int k = scan.nextInt();
		HS hs = new HS();

		for (int i = 0; i < k; i++) {
			int r = scan.nextInt();
			int c = scan.nextInt();
			hs.add(i, r, c);
		}
		hs.solve();

		for (int r = 0; r < 8; r++) {
			if (r > 0)
				System.out.println();
			for (int c = 0; c < 8; c++)
				if (hs.isQuenn(r, c))
					System.out.print("Q");
				else
					System.out.print(".");
		}

		scan.close();
		System.exit(0);
	}
}

class HS {

	int[] row;
	int[] col;

	public HS() {
		row = new int[8];
		col = new int[8];
		for (int i = 0; i < 8; i++) {
			row[i] = -1;
			col[i] = -1;
		}
	}

	public boolean isQuenn(int r, int c) {
		for (int k = 0; k < 8; k++)
			if (row[k] == r && col[k] == c)
				return true;
		return false;
	}

	public void solve() {
		int k = 0;
		for (; k < row.length; k++)
			if (row[k] == -1)
				break;
		sol(k);
	}

	private boolean sol(int k) {
		if (k == 8)
			return true;
		for (int r = 0; r < 8; r++)
			for (int c = 0; c < 8; c++)
				if (isAbl(r, c)) {
					row[k] = r;
					col[k] = c;
					if (sol(k + 1))
						return true;
					row[k] = -1;
					col[k] = -1;
				}
		return false;
	}

	private boolean isAbl(int r, int c) {
		for (int k = 0; k < 8; k++) {
			if (row[k] == -1)
				break;
			if (row[k] == r || col[k] == c || row[k] + col[k] == r + c || row[k] - col[k] == r - c)
				return false;
		}
		return true;
	}

	public void add(int i, int r, int c) {
		row[i] = r;
		col[i] = c;
	}
}