import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if (n == 1) {
			System.out.println("3");
			return;
		}
		String[] s = sc.next().split("");
		long c = 0;
		int index = 0;
		boolean before;
		int mod = 1000000007;
		if (s[0].equals(s[1])) {
			c = 6;
			index = 2;
			before = true;
		}
		else {
			c = 3;
			index = 1;
			before = false;
		}
		for (; index < n;) {
			if (index < n - 1 && s[index].equals(s[index + 1])) {
				if (before) {
					c = c * 3 % mod;
				}
				else {
					c = c * 2 % mod;
				}
				index += 2;
				before = true;
			}
			else {
				if (!before) {
					c = c * 2 % mod;
				}
				index++;
				before = false;
			}
		}
		System.out.println(c);
	}
}