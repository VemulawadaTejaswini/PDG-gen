import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String st = t.substring(0,s.length());
		if (s.matches(st) && s.length() + 1 == t.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}	
		sc.close();
	}

}