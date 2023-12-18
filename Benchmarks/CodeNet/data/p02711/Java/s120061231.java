import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String seven = "No";
		try (Scanner scn = new Scanner(System.in)) {
			final char[] N = scn.next().toCharArray();
			for (int i = 0; i < N.length; i++) {
				if (N[i] == '7') {
					seven = "Yes";
					break;
				}
			}
		}
		System.out.println(seven);
	}
}
