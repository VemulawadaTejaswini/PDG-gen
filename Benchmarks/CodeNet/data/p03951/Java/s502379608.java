import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		if(s.equals(t)) {
			System.out.println(s.length());
			return;
		}
		for(int i = 0 ; i < t.length() ; i++) {
			if(i == 0 && s.charAt(s.length() - 1) == t.charAt(i));
			else {
				s += t.charAt(i);
			}
		}
		System.out.println(s.length());
	}
}
