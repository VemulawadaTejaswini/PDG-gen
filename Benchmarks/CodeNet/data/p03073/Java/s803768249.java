import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		boolean[] s = new boolean[S.length()];
		for (int i = 0; i < S.length(); i++)
			s[i] = S.charAt(i) == '1';
		int ans = 0;
		for (int i = 0; i < S.length() - 1; i++) {
			if (s[i] == s[i + 1]) {
				s[i + 1] = !s[i + 1];
				ans++;
			}
		}
		System.out.println(ans);
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}
