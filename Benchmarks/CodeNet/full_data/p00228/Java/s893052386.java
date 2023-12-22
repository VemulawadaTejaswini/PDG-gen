import java.util.Scanner;

public class Main {
	final static String zero = "0000000";

	public static void main(String[] args) {
		int[] num = { 077, 06, 0133, 0117, 0146, 0155, 0175, 047, 0177, 0157 };
		int n;
		Scanner in = new Scanner(System.in);
		while ((n = in.nextInt()) != -1) {
			int now = 0;
			int next;
			while (n-- > 0) {
				next = num[in.nextInt()];
				final String binaryString = Integer.toBinaryString(now ^ next);
				System.out.print(zero.substring(binaryString.length()));
				System.out.println(binaryString);
				now = next;
			}
		}
	}

}