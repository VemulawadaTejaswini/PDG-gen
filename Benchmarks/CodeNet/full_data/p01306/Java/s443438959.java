import java.math.BigDecimal;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static int TC;
	public static void main(String[] args) {
		TC = new Integer(sc.nextLine());
		for (int i = 0; i < TC; i++) {
			read();
			solve();
		}
	}
	
	static String A, B, C;
	static boolean read() {
		String[] ss = sc.nextLine().split(" ");
		if (ss.length == 3) {
			A = ss[0];
			B = ss[1];
			C = ss[2];
		} else {
			A = ss[0];
			B = "";
			C = ss[1];
		}
		return true;
		
	}

	static void solve() {
		int n = conv(B), dn = 0;
		int g = 0; boolean cnt = false;
		for (int i = 0; i < A.length(); i++) {
			if (cnt && A.charAt(i) != '.') g++;
			else {
				if (A.charAt(i) != '.' && A.charAt(i) != '0') {
					cnt = true;
					g++;
				}
			}
		}
		
		BigDecimal d = new BigDecimal(A), dx = null;
		if (d.compareTo(new BigDecimal("1")) > 0) {
			dx = new BigDecimal("0.1");
			dn = 1;
		} else {
			dx = new BigDecimal("10");
			dn = -1;
		}
		BigDecimal ub = new BigDecimal("9.999999999999999999999999"), lb = new BigDecimal("0.99999999999999999999999999");
		while (d.compareTo(ub) > 0 || d.compareTo(lb) < 0) {
			n += dn;
			d = d.multiply(dx);
		}
		
		String dd = d.toString().substring(0, g + 1);
		if (dd.charAt(dd.length() - 1) == '.') dd = dd.substring(0, dd.length() - 1);
		System.out.println(dd + " * 10^" + n + " " + C);
		
	}	
	
	static int conv(String s) {
		int ret = 0;
		if (s.equals("yotta")) {
			ret = 24; 
		} else if (s.equals("zetta")) {
			ret = 21; 
		} else if (s.equals("exa")) {
			ret = 18;
		} else if (s.equals("peta")) {
			ret = 15;
		} else if (s.equals("tera")) {
			ret = 12;
		} else if (s.equals("giga")) {
			ret = 9;
		} else if (s.equals("mega")) {
			ret = 6;
		} else if (s.equals("kilo")) {
			ret = 3;
		} else if (s.equals("hecto")) {
			ret = 2;
		} else if (s.equals("deca")) {
			ret = 1;
		} else if (s.equals("deci")) {
			ret = -1;
		} else if (s.equals("centi")) {
			ret = -2;
		} else if (s.equals("milli")) {
			ret = -3;
		} else if (s.equals("micro")) {
			ret = -6;
		} else if (s.equals("nano")) {
			ret = -9;
		} else if (s.equals("pico")) {
			ret = -12;
		} else if (s.equals("femto")) {
			ret = -15;
		} else if (s.equals("ato")) {
			ret = -18;
		} else if (s.equals("zepto")) {
			ret = -21;
		} else if (s.equals("yocto")) {
			ret = -24;
		}
		
		return ret;
	}
}