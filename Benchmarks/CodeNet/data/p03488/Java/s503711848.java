import java.util.Scanner;

public class Main {

	int px, py, pd;
	static int mx[] = { -1, 0, 1, 0 };
	static int my[] = { 0, -1, 0, 1 };
	static String s;
	static int x, y;

	public Main(int x, int y, int d) {
		px = x;
		py = y;
		pd = d;
	}
	
	public void update(Main tmp) {
		px = tmp.px;
		py = tmp.py;
		pd = tmp.pd;
	}
	
	public void update(int x, int y, int d) {
		px = x;
		py = y;
		pd = d;
	}

	public boolean solve(int pc, int d) {
		int n = s.length();
		pd = d;
		Main tmprobo = new Main(px, py, pd);
		if (pc == n) {
			if (px == x && py == y)
				return true;
			else
				return false;
		}
		for (int i = pc; i < n; ++i) {
			if (s.charAt(i) == 'F') {
				px += mx[pd];
				py += my[pd];
				tmprobo.update(px, py, pd);
			} else {
				int tmp = d + 3;
				int tmp2 = tmp + 2;
				tmp2 %= 4;
				tmp %= 4;
				if (solve(i + 1, tmp)) {
					return true;
				} else {
					update(tmprobo);
					return solve(i + 1, tmp2);
				}
			}
		}
		if (px == x && py == y)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		Main robot = new Main(0, 0, 2);
		x = sc.nextInt();
		y = sc.nextInt();
		String ans[] = { "Yes", "No" };
		sc.close();
		int a = 1;
		if (robot.solve(0, 2))
			a = 0;
		System.out.println(ans[a]);
	}

}
