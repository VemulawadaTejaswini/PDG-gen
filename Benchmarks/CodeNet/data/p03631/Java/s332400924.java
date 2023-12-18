import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length() % 2 == 1) {
			int b = s.length() / 2;
			s = s.substring(0,b) + s.substring(b+1,s.length());
		}
		System.out.println(isKaibun(s) ?"Yes" : "No");
	}
	static boolean isKaibun(String s) {
		if(s.equals(Hanten(s))) {
			return true;
		} else {
			return false;
		}
	}
	static String Hanten(String s) {
		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString();
		return s;
	}
}
