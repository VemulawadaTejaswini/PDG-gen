import java.util.*;

public class Main {
	boolean test = false;
	
	Scanner sc;
	String s;
	String t;
	
/*-------------
 * constructor
 */
	public Main() {
	}
	
/*------------------
 * instance methods
 */
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	String append(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}
	
	public void exec(String input) throws Exception {
		sc = new Scanner(input);
		execImpl();
	}
	
	
	public void exec() throws Exception {
		sc = new Scanner(System.in);
		execImpl();
	}
	
	public void execImpl() throws Exception {
		s = sc.next();
		t = sc.next();
		
		int al = s.length();
		int bl = t.length();
		
		if (al >= bl) {
			// A>B となるケース
			// BB.B (length は A 以下) がAAに含まれる => 有限個
			// ただし、AAに含まれた次からもBB,B となっていた場合、無限個
			int nb = al/bl+1;
			String AAA = append(s, 3);
			for (; nb >= 0; nb--) {
				if (AAA.contains(append(t, nb))) break;
			}
			if (nb == al/bl+1) out(-1);
			else out(nb);
		} else {
			// A<B となるケース
			// AA.A に B が含まれる => 有限個
			// ただし、含まれた次も B になっていたら(AA.Ax2 が BB を含む)無限個
			int na = bl/al+1;
			String AAA = append(s, na);
			if ((AAA+AAA).contains(append(t,2))) out(-1);
			else if (AAA.contains(t)) out(1);
			else out(0);
		}
	}
	
/*------
 * main
 */
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}
}

