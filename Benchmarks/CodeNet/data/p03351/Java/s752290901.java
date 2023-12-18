import java.util.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(canTalk(scanInt(), scanInt(), scanInt(), scanInt()) ? "Yes" : "No");
	}
	
	private static boolean canTalk(int a, int b, int c, int d) {
		if (Math.abs(c - a) <= d) {
			return true;
		}
		if (Math.abs(b - a) <= d && Math.abs(c - b) <= d) {
			return true;
		}
		return false;
	}

	
	private static final Scanner SC = new Scanner(System.in);

	private static int scanInt() {
		return SC.nextInt();
	}

	private static  String scanString() {
		return SC.next();
	}
}
