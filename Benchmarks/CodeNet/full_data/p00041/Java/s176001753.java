
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int a[] = new int[4];
			boolean flg = true;
			for(int i=0;i<4;i++) { a[i] = sc.nextInt(); flg &= a[i] == 0; }
			if(flg) break;
			
			Permutation p = new Permutation(a);
			String form = "" + 0;
			for(;p.hasNext();) {
				for(int i=0;i<3;i++) for(int j=0;j<3;j++) for(int k=0;k<3;k++) {
					int ans = 0;
					System.arraycopy(p.next(), 0, a, 0, 4);
					ans = calc(a[0], a[1], i);
					ans = calc(ans, a[2], j);
					ans = calc(ans, a[3], k);
//					debug(ans(a, i, j, k) + "=" + ans);
					if(ans == 10) {
						form = ans1(a, i, j, k);
					}
					
					ans = calc(a[0], a[1], i);
					int tmp = calc(a[2], a[3], k);
					ans = calc(ans, tmp, j);
					if(ans == 10) form = ans2(a, i, j, k);
				}
			}
			System.out.println(form);
		}
	}
	
	int calc(int a, int b, int op) {
		if(op == 0) return a+b;
		if(op == 1) return a-b;
		return a*b;
	}
	
	String ans1(int[] a, int op1, int op2, int op3) {
		String ans = "(((" + a[0];
		int[] ops = {op1, op2, op3};
		for(int i=0;i<3;i++) {
			if(ops[i] == 0)ans += " + " + a[i+1] + ")";
			if(ops[i] == 1)ans += " - " + a[i+1] + ")";
			if(ops[i] == 2)ans += " * " + a[i+1] + ")";
		}
		return ans;
	}
	
	String ans2(int[] a, int op1, int op2, int op3) {
		char[] ops = {'+', '-', '*'};
		String ans = "((" + a[0] + " " + ops[op1] + " " + a[1] + ") " + ops[op2] + " (" + a[2] + " " + ops[op3] + " " + a[3] + "))";
		return ans;
	}
	
	class Permutation {
		int[] a;
		boolean isFirst;
		Permutation(int[] s) {
			a = new int[s.length];
			System.arraycopy(s, 0, a, 0, s.length);
			sort(a);
			isFirst = true;
		}
		
		boolean hasNext() {
			if(isFirst) {
				isFirst = false;
				return true;
			}
			
			int n = a.length;
			for(int i=n-1;i>0;i--) {
				if(a[i-1] < a[i]) {
					int j = n;
					while(a[i-1] >= a[--j]);
					swap(a, i-1, j);
					reverse(a, i, n);
					return true;
				}
			}
			reverse(a, 0, n);
			return false;
		}
		
		int[] next() {
			return a;
		}
		
		void swap(int[] a, int x, int y) {
			int tmp = a[x];
			a[x] = a[y];
			a[y] = tmp;
		}
		
		void reverse(int[]a, int from, int to) {
			while( from < --to ) swap(a, from++, to);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}