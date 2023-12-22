import java.util.*;
public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
 
		s2 = s2.substring(0, s2.length()-1);
		if(s1.equals(s2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}