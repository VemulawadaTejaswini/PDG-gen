import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		int N = 0;
		int S = 0;
		int E = 0;
		int W = 0;
		String mozi = null;
		
		for (int i = 0; i < l; i++) {
			if (i != l - 1) {
				mozi = s.substring(i, i+1);
			} else {
				mozi = s.substring(i);
			}
			if (mozi.equals("N")) {
				N++;
			} else if (mozi.equals("S")) {
				S++;
			} else if (mozi.equals("E")) {
				E++;
			} else {
				W++;
			}
		}
		
		if ((N == 0 && S > 0) || (N > 0 && S == 0) || (W == 0 && E > 0) || (W > 0 && E == 0)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
