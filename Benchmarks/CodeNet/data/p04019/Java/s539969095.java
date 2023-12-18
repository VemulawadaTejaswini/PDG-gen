import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		int x = 0, y = 0;
		boolean N = false, S = false, W = false, E = false;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'N') {
				N = true;
			} else if (s[i] == 'S') {
				S = true;
			} else if (s[i] == 'E') {
				E = true;
			} else if (s[i] == 'W') {
				W = true;
			}
		}
		System.out.println((N && S && E && W
				|| N & S & !E && !W
				|| !N & !S & E && W) ? "Yes" : "No");
	}
}
