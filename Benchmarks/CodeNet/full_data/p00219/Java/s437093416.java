import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count;
		StringBuilder sb = new StringBuilder();
		while ((count = in.nextInt()) > 0) {
			int[] ice = new int[10];
			while (count-- > 0) {
				ice[in.nextInt()]++;
			}
			for (int b : ice) {
				if (b != 0) {
					char[] c = new char[b];
					Arrays.fill(c, '*');
					sb.append(c);
				} else {
					sb.append('-');
				}
				sb.append('\n');
			}
		}
		System.out.println(sb.toString());
	}
}