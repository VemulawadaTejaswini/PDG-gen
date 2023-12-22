import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0 && m == 0)
				break;

			Cup c = new Cup(n, m);
			Cup d = new Cup(n, m);
			for (int L = 0; L < 3; L++) {
				int nl = scan.nextInt();
				for (int j = 0; j < nl; j++) {
					int cup = scan.nextInt();
					c.set(L, cup);
					d.set(L, cup);
				}
			}
			c.move(0, 1);
			d.move(2, 1);
			if (c.getOper() > m && d.getOper() > m)
				System.out.println(-1);
			else
				System.out.println(Math.min(c.getOper(), d.getOper()));
		}

		scan.close();
		System.exit(0);
	}
}

class Cup {
	int max;
	boolean[][] c;
	int oper;
	int operLimit;

	public Cup(int n, int limit) {
		max = n;
		oper = 0;
		operLimit = limit;
		c = new boolean[3][n];
		for (int l = 0; l < 3; l++)
			for (int i = 0; i < n; i++)
				c[l][i] = false;
	}

	public int getOper() {
		return oper;
	}

	public void move(int toLoc, int cup) {
		if (oper > operLimit)
			return;

		if (cup > max)
			return;

		if (c[toLoc][cup - 1]) {
			this.move(toLoc, cup + 1);
			return;
		}

		int wkLoc;
		if (toLoc == 0)
			wkLoc = 2;
		else
			wkLoc = 0;

		if (c[wkLoc][cup - 1]) {
			this.move(toLoc, cup + 1);
			this.moveOne(1, cup);
		}
		this.move(wkLoc, cup + 1);
		this.moveOne(toLoc, cup);
		this.move(toLoc, cup + 1);
		return;

	}

	private void moveOne(int toLoc, int cup) {
		for (int i = 0; i < 3; i++)
			if (i == toLoc)
				c[i][cup - 1] = true;
			else
				c[i][cup - 1] = false;
		oper++;
	}

	public void set(int loc, int cup) {
		c[loc][cup - 1] = true;
	}
}