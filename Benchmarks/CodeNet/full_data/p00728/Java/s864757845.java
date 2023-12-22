import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int n;
	static int[] s;
	static boolean read() {
		
		n = sc.nextInt();
		if (n == 0) return false;
		
		s = new int[n];
		for (int i = 0; i < n; i++)
			s[i] = sc.nextInt();
		
		return true;
	}

	static void solve() {
		sort(s);
		int res = 0;

		for (int i = 1; i < n - 1; i++) {
			//System.out.println(s[i]);
			res += s[i];
		}
		
		System.out.println(res / (n - 2));
	}	
}