import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] S = in.nextLine().toCharArray();
		String result = "WA";
		if (S[0] == 'A') {
			if (hasC(S) && smallCheck(S)) {
				result = "AC";
			}
		}
		System.out.println(result);
		in.close();
	}

	public static boolean hasC(char[] C) {
		int count = 0;
		for (int i = 2; i < C.length - 1; ++i) {
			if (C[i] == 'C') {
				++count;
			}
		}
		if (count == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean smallCheck(char[] C) {
		int count = 0;
		for (int i = 0; i < C.length; ++i) {
			if (Character.isUpperCase(C[i])) {
				++count;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}
}