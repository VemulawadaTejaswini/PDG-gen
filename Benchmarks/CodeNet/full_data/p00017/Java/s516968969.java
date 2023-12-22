import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		String output = "";
		char[] t;
		char[] al = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z' };
		while (scan.hasNext()) {
			input = scan.nextLine();
			for (int d = 0; d < al.length; d++) {
				t = input.toCharArray();
				for (int i = 0; i < t.length; i++) {
					for (int j = 0; j < al.length; j++) {
						if (t[i] == al[j]) {
							t[i] = al[(j + d) % al.length];
						}
					}
				}
				output = String.valueOf(t);
				if (output.contains("the") || output.contains("this")
						|| output.contains("that")) {
					break;
				}
			}
			System.out.println(output);
		}
	}
}