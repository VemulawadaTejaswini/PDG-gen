import java.math.BigInteger;
import java.util.*;

public class Main {

	static String expr;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		if(!sc.hasNext()) return false;
		expr = sc.next();
		return true;
	}
	
	static String solve() {
		int pos1 = expr.indexOf("="), pos2 = expr.indexOf("+");
		String sa = expr.substring(0, pos2), sb = expr.substring(pos2 + 1, pos1), sc = expr.substring(pos1 + 1);
		
		for(int i = 0; i <= 9; i++) {
			if(i == 0) {
				if(sa.charAt(0) == 'X' || sb.charAt(0) == 'X' || sc.charAt(0) == 'X') {
					continue;
				}
			}
			BigInteger a = new BigInteger(sa.replaceAll("X", "" + i));
			BigInteger b = new BigInteger(sb.replaceAll("X", "" + i));
			BigInteger c = new BigInteger(sc.replaceAll("X", "" + i));
			if(a.add(b).equals(c)) {
				return "" + i;
			}
		}
		return "NA";
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}
}