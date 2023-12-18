import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		char aend = a.charAt(a.length()-1);
		String b = s.next();
		char bstart = b.charAt(0);
		String c = s.next();
		char cstart = c.charAt(c.length()-1);
		
		if(b.startsWith(String.valueOf(aend))) {
			if(b.endsWith(String.valueOf(cstart))) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}