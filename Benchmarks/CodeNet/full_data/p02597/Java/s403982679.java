import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		int w = 0;
		char[] c = s.toCharArray();
		for (int i = 1; i < s.length(); i++) {
			if (c[i] == 'W')
				w++;
			if (c[i] == 'R' && c[i-1] == 'W') {
				ans++;
				c[i] = 'W';
			}

		}
		System.out.println(Math.min(w, ans));
	} 
}