import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		int[] b = new int[k];
		for (int i = 0; i < k; i++) {
			b[i] = sc.nextInt();
		}
		
		for (int i = n; ; i++) {
			if (!containtsDigit(i, b)) {
				so.println(i);
				return;
			}
		}
	}
	
	static boolean containtsDigit(final int in, final int[] digits) {
		int i = in;
		while (i > 0) {
			int digit = i % 10;
			for (int d: digits)
				if (digit == d)
					return true;
			i = i / 10;
		}
		return false;
	}
}
