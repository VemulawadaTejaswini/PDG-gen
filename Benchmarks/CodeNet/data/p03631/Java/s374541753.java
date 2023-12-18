import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		int i=0, j=t.length()-1;
		boolean ok = true;
		while (i<j) ok&=(t.charAt(i++)==t.charAt(j--));
		System.out.println(ok ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}