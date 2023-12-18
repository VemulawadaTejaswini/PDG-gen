import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintStream so = System.out;
	public static void main(String[] args) throws InterruptedException {

		String s = sc.next();
		
		String[] a = {"dreameraser", "dreamerase", "dreamer", "dream", "eraser", "erase"};
		
		Runtime rt = Runtime.getRuntime();
		int limit = 1024 * 1024 * 128;
		long l = rt.totalMemory();
		
		outer: while (true) {
			for (String elem: a) {
				if (s.startsWith(elem)) {
					s = s.substring(elem.length());
					if (s.length() == 0) {
						so.println("YES");
						return;
					}
					if (l - rt.freeMemory() > limit) {
						System.gc();
					}
					
					continue outer;
				}
			}
			
			so.println("NO");
			return;
		}
	}
}
