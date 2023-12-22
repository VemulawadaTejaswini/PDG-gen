import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			String s = sc.next();
			int[] a = new int[14];
			for (int i = 0; i < s.length(); i++) {
				a[i] = (int)(s.charAt(i) - '0');
			}
			
			List<Integer> ans = new ArrayList<Integer>();
			for (int t = 1; t <= 9; t++) {
				a[13] = t;
				if (check(a.clone())) {
					ans.add(t);
				}
			}
			if (ans.size() == 0) 
				System.out.println(0);
			else {
				System.out.print(ans.get(0));
				for (int i = 1; i < ans.size(); i++)
					System.out.print(" " + ans.get(i));
				System.out.println();
			}
		}
	}
	
	boolean ok;
	boolean check(int[] a) {
		int[] b = new int[10];
		int sum = 0;
		for (int x: a) {
			b[x]++;
			sum++;
		}
		for (int i = 1; i <= 9; i++) if (b[i] > 4) return false;
		ok = false;
		rec(b, sum);
		return ok;
	}
	void rec(int[] b, int sum) {
		if (ok) return;
		if (sum == 0) {
			ok = true;
			return;
		}
		if (sum == 2) {
			for (int i = 1; i <= 9; i++) {
				if (b[i] == 2) {
					b[i] -= 2;
					rec(b, sum - 2);
					b[i] += 2;
				}
			}
		} 
		else 
		{
			for (int i = 1; i <= 9; i++) {
				if (b[i] >= 3) {
					b[i] -= 3;
					rec(b, sum - 3);
					b[i] += 3;
				}
			}
			for (int i = 1; i + 2 <= 9; i++) {
				if (b[i] >= 1 && b[i+1] >= 1 && b[i+2] >= 1) {
					b[i]--; b[i+1]--; b[i+2]--;
					rec(b, sum - 3);
					b[i]++; b[i+1]++; b[i+2]++;
				}
			}
		}
	}
}