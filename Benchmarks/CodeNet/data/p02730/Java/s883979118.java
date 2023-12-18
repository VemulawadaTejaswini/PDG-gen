import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String l1 = scan.nextLine();
		scan.close();

		String S = l1;
		int N = S.length();

		String source = S;
		if (!judge(source)) {
			System.out.println("No");
			return;
		}

		source = S.substring(0, (N - 1) / 2);
		if (!judge(source)) {
			System.out.println("No");
			return;
		}

		source = S.substring(((N + 3) / 2) - 1, N);
		if (!judge(source)) {
			System.out.println("No");
			return;
		}

		System.out.println("Yes");
	}

	static boolean judge(String source) {
		char[] cArray = source.toCharArray();

		boolean result = true;

		for (int i = 0; i < ((cArray.length + 1) / 2); i++) {
			char a = cArray[i];
			char b = cArray[cArray.length - 1 - i];
			if (a != b) {
				result = false;
				break;
			}
		}

		return result;
	}
}