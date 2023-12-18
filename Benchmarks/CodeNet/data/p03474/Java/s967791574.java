import java.util.*;
// warm-up
// Have to check the post hyphen string for digit as well.
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), i=A+1;
		String s = sc.next();
		boolean ok = s.charAt(A)=='-';
		if (ok) while (i<A+B+1) ok&=Character.isDigit(s.charAt(i++));
		i=0;
		if (ok) while (i<A) ok&=Character.isDigit(s.charAt(i++));
		System.out.println(ok ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}