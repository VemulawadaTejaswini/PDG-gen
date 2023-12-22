import java.util.*;
// warm-up
// PFF rookie mistakes..
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=0;
		char p='.';
		for (char ch : sc.next().toCharArray()) {
			n=(p=='.' && ch=='R') ? 1 : n;
			if (ch=='R' && p=='R') n++;
			p=ch;
		}
		System.out.println(n);
		sc.close();	
	}

	public static void main(String args[]) {
		solve();
	}

}
