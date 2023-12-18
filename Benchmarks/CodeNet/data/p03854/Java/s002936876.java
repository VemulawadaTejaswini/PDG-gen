import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintStream so = System.out;
	public static void main(String[] args) {

		String s = sc.next();
		
		String[] a = {"dreameraser", "dreamerase", "dreamer", "dream", "eraser", "erase"};
		
		outer: while (true) {
			for (String elem: a) {
				if (s.startsWith(elem)) {
					s = new String(s.substring(elem.length()));
					if (s.length() == 0) {
						so.println("YES");
						return;
					}
					continue outer;
				}
			}
			
			so.println("NO");
			return;
		}
	}
}
