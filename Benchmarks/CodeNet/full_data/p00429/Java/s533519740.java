import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		String string;
		StringBuffer string2 = new StringBuffer();;
		String s;
		int count;

		n = scanner.nextInt();
		while (n != 0) {
			count = 1;
			string = scanner.next();

			for (int j = 0; j < n; j++) {
				for (int i = 1; i < string.length(); i++) {
					if (string.charAt(i) == string.charAt(i - 1)) {
						count++;
					} else {
						string2.append(count);
						string2.append(string.charAt(i - 1));
						count = 1;
					}
				}
				string2.append(count);
				string2.append(string.charAt(string.length() - 1));
				count = 1;
				string = string2.toString();
				string2 = new StringBuffer();
			}
			System.out.println(string);
			n = scanner.nextInt();
		}
	}
}