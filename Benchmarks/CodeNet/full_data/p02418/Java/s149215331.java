import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String s2 = s+s;
		String p = sc.next();
		
		if (s2.contains(p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		
	}
}
