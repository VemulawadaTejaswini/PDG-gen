import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	static final boolean debugMode = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = readInt(sc);
		int[][] memo = new int[k + 1][k + 1]; // 0

		int ans = 0;

		for (int a = 1; a <= k; a++) {
			for (int b = a; b <= k; b++) {
				for (int c = b; c <= k; c++) {
					int bc = 0;

					if (memo[b][c] != 0)
						bc = memo[b][c];
					else {
						bc = gcd(b, c);
						memo[b][c] = bc;
					}

					int g = 0;
					if (memo[a][bc] != 0)
						g = memo[a][bc];
					else {
						g = gcd(a, bc);
						memo[a][bc] = g;
					}

					if (a == b && b == c)
						ans += g;
					else if (a == b || b == c)
						ans += g * 3;
					else
						ans += g * 6;

				}
			}
		}

		System.out.println(ans);
	}

	// con.) a >= b
	static int gcd(int a, int b) {
		while (true) {
			if (b == 0)
				break;

			int mod = a % b;
			a = b;
			b = mod;
		}
		return a;
	}

	static int readInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	static void log(String s) {
		if (debugMode) {
			System.out.println(s);
		}
		return;
	}
}

class Pair {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Pair() {

	}

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}