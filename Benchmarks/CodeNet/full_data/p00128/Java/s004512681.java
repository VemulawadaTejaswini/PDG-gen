/**
 * @author yuichirw
 *
 */
import java.util.*;

public class Main {

	static String n;
	static Scanner sc = new Scanner(System.in);
	static char[][] abacus = {
		"* = ****".toCharArray(),
		"* =* ***".toCharArray(),
		"* =** **".toCharArray(),
		"* =*** *".toCharArray(),
		"* =**** ".toCharArray(),
		" *= ****".toCharArray(),
		" *=* ***".toCharArray(),
		" *=** **".toCharArray(),
		" *=*** *".toCharArray(),
		" *=**** ".toCharArray()
	};
		
	static boolean read() {
		if(!sc.hasNext()) return false;
		n = sc.next();
		return true;
	}
	
	static void solve() {
		char[][] ans = new char[5][8];
		for(int i = 5 - n.length(); i > 0; i--) {
			n = "0" + n;
		}
		
		int a;
		for(int i = 0; i < n.length(); i++) {
			a = n.charAt(i) - '0';
			for(int j = 0; j < 8; j++) {
				ans[i][j] = abacus[a][j];
			}
		}
		
		for(int j = 0; j < 8; j++) {
			for(int i = 0; i < 5; i++) {			
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}
}