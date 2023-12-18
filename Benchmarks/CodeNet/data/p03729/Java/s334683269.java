import java.util.*;
import java.io.*;

class Main {

	void solve() {

		String a = instr(), b = instr(), c = instr();
		String aLast = a.substring(a.length() - 1, a.length());
		String bFirst = b.substring(0, 1);
		String bLast = b.substring(b.length() - 1, b.length());
		String cFirst = c.substring(0, 1);
		out.println(aLast.equals(bFirst) && bLast.equals(cFirst) ? "YES" : "NO");

	}

	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

	public int inint() {
		return in.nextInt();
	}

	public long inlong() {
		return in.nextLong();
	}

	public String instr() {
		return in.next();
	}

	public char inchar() {
		return in.next().charAt(0);
	}

	public int[] inintar(int num) {
		int[] a = new int[num];
		for (int i=0; i<num; i++) {
			a[i] = in.nextInt();
		}
		return a;
	}

	public char[] incharar() {
		return in.next().toCharArray();
	}

}