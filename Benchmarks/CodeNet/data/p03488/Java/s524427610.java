
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int x = sc.nextInt();
		int y = sc.nextInt();

		String[] f = s.split("T");
		ArrayList<Integer> fcx = new ArrayList<Integer>();
		ArrayList<Integer> fcy = new ArrayList<Integer>();
		for (int i = 0; i < f.length; i++) {
			if (i % 2 == 0) {
				fcx.add(f[i].length());
			} else {
				fcy.add(f[i].length());
			}
		}
		boolean bx = false;
		for (int all = 0; all < (1 << fcx.size()); all++) {
			int tmpx = 0;
			for (int i = 0; i < fcx.size(); i++) {
				if (i == 0) {
					tmpx = fcx.get(i);
					continue;
				}
				if ((all & (1 << i)) != 0) {
					tmpx = tmpx + fcx.get(i);
				} else {
					tmpx = tmpx - fcx.get(i);
				}
			}
			if (tmpx == x) {
				bx = true;
				break;
			}
		}
		if (!bx) {
			System.out.println("No");
			return;
		}
		for (int all = 0; all < (1 << fcy.size()); all++) {
			int tmpy = 0;
			for (int i = 0; i < fcy.size(); i++) {
				if ((all & (1 << i)) != 0) {
					tmpy = tmpy + fcy.get(i);
				} else {
					tmpy = tmpy - fcy.get(i);
				}
			}
			if (tmpy == y) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
