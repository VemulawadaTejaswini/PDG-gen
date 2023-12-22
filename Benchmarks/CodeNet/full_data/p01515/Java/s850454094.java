import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static int id;
	static String S;
	static int V;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			S = sc.next();
			if(S.equals("#")) break;
			boolean ans = true;
			for(V = 0; V < (1 << 12); V++) {
				id = 0;
				ans &= equation();
				if(!ans) break;
			}
			System.out.println(ans?"YES":"NO");
		}
	}
	static boolean equation() {
		boolean a = formula();
		id++;
		boolean b = formula();
		return a == b;
	}
	static boolean formula() {
		if(S.charAt(id) == 'T') {
			id++;
			return true;
		}
		if(S.charAt(id) == 'F') {
			id++;
			return false;
		}
		for(int i = 0; i < 12; i++) {
			
			if(S.charAt(id) == (char)('a' + i)) {
				id++;
				return (V & (1 << i)) != 0;
			}
			
		}
		if(S.charAt(id) == '-') {
			id++;
			return !formula();
		}
		if(S.charAt(id) == '(') {
			id++;
			boolean A = formula();
			char B = S.charAt(id);
			if(B == '-') {
				id++;
			}
			id++;
			boolean C = formula();
			id++;
			if(B == '-') {
				if(A && !C) return false;
				return true;
			}
			if(B == '+') {
				return A | C;
			}
			if(B == '*') {
				return A & C;
			}
		}
		return true;
		
		
	}
 }