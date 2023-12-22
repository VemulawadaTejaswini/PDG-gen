
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
		int n = sc.nextInt();
		for(;n>0;n--) {
			l = sc.next() + ".."; p = 0;
			System.out.println(solve());
		}
	}
	
	String l; int p;
	char next() {
		return l.charAt(p++);
	}
	
	int solve() {
		char c = next();
		if(c != '[') return val();
		ArrayList<Integer> l = new ArrayList<Integer>();
		while(c == '[') {
			l.add(solve());
			c = next();
		}
//		if(c != ']') debug("err");
		int n = l.size();
		sort(l);
		int ret = 0;
		for(int i=0;i<n/2+1;i++) ret += l.get(i);
//		debug(ret, l);
		return ret;
	}
	
	int val() {
		p--;
		char c = next();
		String v = "";
		while( '0' <= c && c <= '9' ) {
			v += c; c = next();
		}
		return Integer.valueOf(v) / 2 + 1;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}