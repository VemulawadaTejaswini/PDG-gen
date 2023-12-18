import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		boolean flag = false;
 
		for (int i = 0; i < s.length; i++) {
			String end = s.substring(s.length-1,s.length);
			s = s.substring(0,s.length-1);
			s = end + s;
 
			if (t.equals(s)) {
				judge = "Yes";
				break;
			}
		}
		System.out.println("No");
	}
}
