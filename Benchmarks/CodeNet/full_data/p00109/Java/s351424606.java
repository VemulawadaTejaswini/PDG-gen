
import java.util.*;
import java.io.*;
import java.math.BigDecimal;

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
	
	String exp() {
		BigDecimal v1 = new BigDecimal(term());
		char c = next();
		for( ;c != '=' && c != ')'; c = next() ) { 
			BigDecimal v2 = new BigDecimal(term());
			if( c == '+' ) v1 = v1.add(v2);
			else v1 = v1.subtract(v2);
		}
		p--; 
		return v1.toString();
	}
	
	String term() {
		BigDecimal v1 = new BigDecimal(val());
		char c = next();
		for( ;c != '=' && c != '+' && c != '-' && c != ')';c=next() ) {
			BigDecimal v2 = new BigDecimal(val());
			if( c == '*' ) v1 = v1.multiply(v2);
			else v1 = v1.divideToIntegralValue(v2);
		}
		p--; 
		return v1.toString();
	}
	
	String val() {
		char c = next();
		if( c == '(' ) {BigDecimal v = new BigDecimal(exp()); p++; return v.toString();}
		String v = "" + c;
		for(c = next();'0'<=c && c<='9';c=next()) v += c;
		p--;
		return v;
	}
	
	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}