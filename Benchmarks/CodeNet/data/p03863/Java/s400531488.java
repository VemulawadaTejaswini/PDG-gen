import java.util.*;
// warm-up
// Knew it.. Some quirky deduction which will always defeat the obvious approach
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		boolean isEven = (t.length() & 1)==0, areEqual=t.charAt(0)==t.charAt(t.length()-1);
		System.out.println(isEven^areEqual ? "Second" : "First");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}