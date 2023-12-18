import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		int x1 = IN.nextInt();
		int y1 = IN.nextInt();
		int x2 = IN.nextInt();
		int y2 = IN.nextInt();
		
		int x3 = x2 + (y1 - y2);
		int y3 = y2 + (x2 - x1);
		int x4 = x1 + (y1 - y2);
		int y4 = y1 + (x2 - x1);
		puts(x3 + " " + y3 + " " + x4 + " " + y4);
		flush();
	}

	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
