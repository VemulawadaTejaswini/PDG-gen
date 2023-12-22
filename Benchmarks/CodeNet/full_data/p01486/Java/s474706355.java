import java.util.*;
public class Main {
	static String S;
	static int p;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		boolean ok = cat();
		if(ok) {
			System.out.println("Cat");
		}
		else {
			System.out.println("Rabbit");
		}
		
		
		
	}
	static boolean cat() {
		if(p == S.length()) return false;
		if(m()) return false;
		return true;
	}
	
	static boolean m() {
		if(S.length() == p) return false;
		if(S.charAt(p) != 'm') return false;
		p++;
		return e();
	}
	static boolean e() {
		if(S.length() == p) return false;
		while(S.length() > p && S.charAt(p) != 'e' && cat()) {
			
		}
		
		if(S.length() <= p || S.charAt(p) != 'e') return false;
		
		p++;
		
		return true;
	}
	static boolean w() {
		if(S.length() == p) return false;
		while(S.length() > p && S.charAt(p) != 'w' && cat()) {
			
		}
		
		if(S.length() <= p || S.charAt(p) != 'w') return false;
		
		p++;
		
		return true;
		
	}

}