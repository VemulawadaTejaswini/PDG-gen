import java.util.Scanner;

public class Main
{
	static public int ans100 = -1;
	static public int ans10 = -1;
	static public int ans1 = -1;
	public static void main(String[] args)
	{
		ans100 = -1;
		ans10 = -1;
		ans1 = -1;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] substr = str.split(" ", 0);
		int n = Integer.parseInt(substr[0]);
		int m = Integer.parseInt(substr[1]);
		int ans = -1;
		if (m == 0) {
			if (n == 3) ans = 100;
			if (n == 2) ans = 10;
			if (n == 1) ans = 1;
			System.out.println(ans);
			return;
		}
		for (int i=0; i<m; i++) {
			str = scan.nextLine();
			substr = str.split(" ", 0);
			int s= Integer.parseInt(substr[0]);
			int c = Integer.parseInt(substr[1]);
			if (n > 1 && s == 1 && c == 0) {
				System.out.println(ans);
				return;
			}
			if (n == 1 && s == 1 && c == 0) {
				System.out.println(0);
				return;
			}

			if (s ==1) {
				if (n == 3) {
					if (check100(c) == -1) return;
				}
				if (n == 2) {
					if (check10(c) == -1) return;
				}
				if (n == 1) {
					if (check1(c) == -1) return;
				}

			}
			if (s ==2) {
				if (n == 3) {
					if (check10(c) == -1) return;
				}
				if (n == 2) {
					if (check1(c) == -1) return;
				}
				if (n == 1) {
					System.out.println(ans);
					return;
				}
			}
			if (s ==3) {
				if (n == 3) {
					if (check1(c) == -1) return;
				}
				if (n == 2) {
					System.out.println(ans);
					return;
				}
				if (n == 1) {
					System.out.println(ans);
					return;
				}

			}
		}
		scan.close();
		if (n == 3 && ans100 == -1) ans100=1;
		if (n == 2 && ans10 == -1) ans10=1;
		if (n == 1 && ans1 == -1) ans1=1;
		if (n > 2 && ans10 == -1) ans10=0;
		if (n > 1 && ans1 == -1) ans1=0;

		if (n == 3) {
			ans = ans100 * 100 + ans10 *10 +ans1;
		}
		if (n == 2) {
			ans = ans10 *10 +ans1;
		}
		if (n == 1) {
			ans = ans1;
		}
		System.out.println(ans);
	}

	static int check100(int c) {
		if (ans100 == -1) {
			ans100 = c;
		} else if (ans100 != c) {
			System.out.println(-1);
			return -1;
		}
		return 0;
	}
	static int check10(int c) {
		if (ans10 == -1) {
			ans10 = c;
		} else if (ans10 != c) {
			System.out.println(-1);
			return -1;
		}
		return 0;
	}
	static int check1(int c) {
		if (ans1 == -1) {
			ans1 = c;
		} else if (ans1 != c) {
			System.out.println(-1);
			return -1;
		}
		return 0;
	}
}
