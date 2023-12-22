import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		String[] consonant = { "w", "", "k", "s", "t", "n", "h", "m", "y", "r"};
		for (int i = 0; i < input.length(); i++) {
			char value = input.charAt(i);
			switch (value) {
			case 'T':
				System.out.print("a");
				break;
			case 'L':
				System.out.print("i");
				break;
			case 'U':
				System.out.print("u");
				break;
			case 'R':
				System.out.print("e");
				break;
			case 'D':
				System.out.print("o");
				break;
			default:
				if (value == '0' && input.charAt(i + 1) == 'U') {
					System.out.print("nn");
					i++;
					break;
				}
				System.out.print(consonant[Integer.parseInt(value+"")]);
			}
		}
		System.out.println("");
	}
}