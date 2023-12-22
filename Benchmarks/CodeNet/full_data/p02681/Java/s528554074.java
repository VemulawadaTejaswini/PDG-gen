import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		
		char[] s1c = s1.toCharArray();
		char[] s2c = s2.toCharArray();
		
		boolean ok = true;
		
		for(int i = 0; i < s1c.length; i++) {
			if(s1c[i] != s2c[i])
				ok = false;
		}
		
		if(ok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		s.close();
	}
}
