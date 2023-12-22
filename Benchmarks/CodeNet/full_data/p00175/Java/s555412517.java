/**
 * @author yuichirw
 *
 */
import java.util.*;
public class Main {
	static int n;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		n = sc.nextInt();
		return (n == -1) ? false : true;
	}
	
	static String solve() {
		int m, a;
		String ans = "";
		do {
			a = n / 4; m = n % 4;
			ans = m + ans;
			n = a;
		} while(a >= 4);
		if(a != 0) ans = "" + a + ans;
		return ans;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}

	}

}