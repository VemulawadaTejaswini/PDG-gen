import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int[] ans = new int['z' - 'a' + 1];
		while (scan.hasNextLine()) {
			String ins = scan.nextLine();
			for (int i = 0; i < ins.length(); i++) {
				if (ins.charAt(i) >= 'a' && ins.charAt(i) <= 'z')
					ans[ins.charAt(i) - 'a'] += 1;
				else if (ins.charAt(i) >= 'A' && ins.charAt(i) <= 'Z')
					ans[ins.charAt(i) - 'A'] += 1;
			}
		}
		for (int i = 0; i < 'z' - 'a' + 1; i++) {
			System.out.println((char)('a' + i) + " : " + ans[i]);
		}

		System.exit(0);
	}

}