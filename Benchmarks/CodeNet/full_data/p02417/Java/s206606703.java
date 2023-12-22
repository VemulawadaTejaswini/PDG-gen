import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		char[] line;
		char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		Scanner stdIn = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		while (true) {
			String s = stdIn.nextLine();
			if(s.length() == 0) {
				break;
			}
			sb.append(s);
		}
		line = sb.toString().toCharArray();

		for (int i = 0; i < 26; i++) {
			int count = 0;

			for (char c : line) {
				if (c == alphabets[i]) {
					count++;
				}
			}
			System.out.println(alphabets[i] + " : " + count);
		}
		stdIn.close();
	}

}