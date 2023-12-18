import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String[] sArray = new String[s.length()];

		for (int i = 0; i < s.length(); i++) {
			sArray[i] = String.valueOf(s.charAt(i));
		}

		int count = 0;
		int sLength = s.length();

		for (int i = 0; i < sLength / 2; i++) {
			if (!sArray[i].equals(sArray[sLength - (i + 1)])) {
				count++;
			}
		}

		System.out.print(count);

	}

}
