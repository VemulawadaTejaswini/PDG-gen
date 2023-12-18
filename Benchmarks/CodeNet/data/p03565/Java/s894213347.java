import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		for(int i = s.length() - t.length() ; i >= 0  ; i--) {
			boolean ok = true;
			for(int j = 0 ; j < t.length() ; j++) {
				if(s.charAt(i + j) != '?' && s.charAt(i + j) != t.charAt(j)) ok = false;
			}
			if(ok) {
				String temp = s.substring(0, i) + t + s.substring(i + t.length());
				System.out.println(temp.replaceAll("\\?", "a"));
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}
