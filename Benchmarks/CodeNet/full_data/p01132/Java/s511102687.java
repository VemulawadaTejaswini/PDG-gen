import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int tc;
	public static void main(String[] args) {
		tc = 0;
		while (read()) {
			solve();
			tc++;
		}
	}
	
	static int M;
	static int[] nc = new int[4], cv = {10, 50, 100, 500, 10000};
	static boolean read() {
		M = sc.nextInt();
		if (M == 0) return false;
		if (tc > 0) System.out.println();
		for (int i = 0; i < 4; i++) nc[i] = sc.nextInt();
		return true;
	}

	static void solve() {
		int[] ans = new int[4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < nc[i]; j++) {
				if (M > 0) {
					M -= cv[i];
					ans[i]++;
				}
			}
		}
		
		for (int i = 0; i < 4; i++) 
			if (ans[i] > 0) 
				System.out.println(cv[i] + " " + ans[i]);
	}	
}