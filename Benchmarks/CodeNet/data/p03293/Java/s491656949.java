import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		for(int i = 0; i < s.length(); i++) {
			String x =  s.substring(s.length() - i, s.length()) + s.substring(0, s.length() - i);
			if(x.equals(t)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
