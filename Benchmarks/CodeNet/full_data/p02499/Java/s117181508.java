import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		int count;
		String line = sc.nextLine();
		line = line.toLowerCase();

		if (line.length() >= 1200) {
			return;
		}

		for (char c = 'a'; c <= 'z'; c++) {
			count = 0;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == c) {
					count++;
				}
			}
			System.out.println(c + " : " + count);
		}
	}
}