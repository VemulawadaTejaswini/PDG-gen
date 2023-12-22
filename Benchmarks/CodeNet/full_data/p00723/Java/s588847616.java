import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	public static void main(String[] args) {
		N = sc.nextInt();
		while (read())
			solve();
	}
	
	static String str;
	static boolean read() {
		if ((N--) <= 0) return false;
		str = sc.next();
		return true;
	}
	
	static void solve() {
		HashSet<String> set = new HashSet<String>();
		String a,b,ra, rb;
		for (int i = 1; i < str.length(); i++) {
			a = str.substring(0, 0 + i);
			b = str.substring(i);
			ra = new StringBuffer(a).reverse().toString();
			rb = new StringBuffer(b).reverse().toString();
			set.add(a + b);
			set.add(b + a);

			set.add(ra + rb);
			set.add(rb + ra);
			
			set.add(ra + b);
			set.add(rb + a);
			
			set.add(a + rb);
			set.add(b + ra);
			
			set.add(ra + b);
			set.add(b + ra);
			
			set.add(a + rb);
			set.add(rb + a);
		}
			
		System.out.println(set.size());
	}
}