import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		int K = IN.nextInt();
		puts((K / 2) * ((K + 1) / 2));
		flush();
	}

	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
