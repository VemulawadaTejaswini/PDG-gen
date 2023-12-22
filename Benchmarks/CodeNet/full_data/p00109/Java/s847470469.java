
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
		for(int i=0;i<n;i++) {
			l = sc.next(); p = 0;
			System.out.println(exp());
		}
	}
	
	String l; int p;
	char next() {
		return l.charAt(p++);
	}
	
	long exp() {
		long v1 = term();
		char c = next();
		if( c == '=' || c == ')' ) { p--; return v1; }
		long v2 = exp();
		if( c == '+' ) return v1 + v2;
		else return v1 - v2;
	}
	
	long term() {
		long v1 = val();
		char c = next();
		if( c == '=' || c == '+' || c == '-' || c == ')' ) {p--; return v1;}
		long v2 = term();
		if( c == '*' ) return v1 * v2;
		else return v1 / v2;
	}
	
	long val() {
		char c = next();
		if( c == '(' ) {long v = exp(); p++; return v;}
		String v = "" + c;
		for(c = next();'0'<=c && c<='9';c=next()) v += c;
		p--;
		return Long.parseLong(v);
	}
	
	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}