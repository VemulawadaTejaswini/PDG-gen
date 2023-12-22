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
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0536-input.txt"));

		while (scan.hasNext()) {

			int n = scan.nextInt();
			int m = scan.nextInt();
			int s = scan.nextInt();
			if (n == 0 && m == 0 && s == 0)
				break;

			Card c = new Card(n, m, s);

			System.out.println(c.countMod(100000));
		}

		scan.close();
		System.exit(0);
	}
}

class Card {
	int N, M, S;

	public Card(int n, int m, int s) {
		N = n;
		M = m;
		S = s;
		combTb = new int[n * n + 1][m + 1][s + 1];
	}

	int[][][] combTb;

	private void clearCombTb() {
		for (int i = 0; i < combTb.length; i++)
			for (int j = 0; j < combTb[i].length; j++)
				for (int k = 0; k < combTb[i][j].length; k++)
					combTb[i][j][k] = -1;
	}

	public int countMod(int round) {
		this.clearCombTb();
		return this.comb(1, 0, S, round);
	}

	private int comb(int pos, int preNum, int remS, int round) {
		if (preNum >= M)
			return 0;
		if (remS <= preNum)
			return 0;
		if (pos == N * N)
			if (remS > preNum && remS <= M)
				return 1;
			else
				return 0;
		if (combTb[pos][preNum][remS] != -1)
			return combTb[pos][preNum][remS];

		int result = 0;
		for (int i = preNum + 1; i <= M; i++)
			result += this.comb(pos + 1, i, remS - i, round);
		result %= round;
		combTb[pos][preNum][remS] = result;
		return result;
	}

}