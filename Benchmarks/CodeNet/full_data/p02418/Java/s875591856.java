import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String s = in.nextLine().trim();
		String p = in.nextLine().trim();
		s += s;
		if (s.indexOf(p) < 0) {
			out.println("No");
		} else {
			out.println("Yes");
		}
	}
}