package Blog;

import static java.lang.System.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			int n = sc.nextInt();
			if (n == 0) break;
			
			String s = Integer.toOctalString(n);
			s = s.replace("7","9").replace("6","8").replace("5","7").replace("4","5");
			
			out.println(s);
		}
	}
}

