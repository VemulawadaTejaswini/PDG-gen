
import static java.lang.Math.abs;
import static java.lang.Math.atan2;
import static java.lang.Math.sqrt;
import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			
			final int premeiji = 0;
			final int meiji = 1;
			final int taisho = 2;
			final int showa = 3;
			final int heisei = 4;

			int res = -1;
			if (y < 1868 || 
				(y == 1868 && m < 9) ||
				(y == 1868 && m == 9 && d < 8)) {
				res = premeiji;
			}
			else if (y < 1912 || 
					(y == 1912 && m < 7) ||
					(y == 1912 && m == 7 && d < 30)) {
				res = meiji;
			}
			else if (y < 1926 || 
					(y == 1926 && m < 12) ||
					(y == 1926 && m == 12 && d < 25)) {
				res = taisho;
			}
			else if (y < 1 || 
					(y == 1989 && m < 1) ||
					(y == 1989 && m == 1 && d < 8)) {
				res = showa;
			}
			else {
				res = heisei;
			}
			
			if (res == premeiji) {
				System.out.println("pre-meiji");
			} else {
				int yy = 0;
				String nengou = "";
				if (res == meiji) { nengou = "meiji"; yy = y - 1868 + 1; }
				if (res == taisho) { nengou = "taisho"; yy = y - 1912 + 1; }
				if (res == showa) { nengou = "showa"; yy = y - 1926 + 1; }
				if (res == heisei) { nengou = "heisei"; yy = y - 1989 + 1; }
				System.out.printf("%s %d %d %d\n", nengou, yy, m, d);
			}
		}
	}
	boolean premeiji(int y, int m, int d) {
		if (y < 1868) return true;
		if (y >= 1869) return false;
		if (m < 9) return true;
		if (m >= 10) return false;
		if (d < 8) return true;
		return false;
	}
}