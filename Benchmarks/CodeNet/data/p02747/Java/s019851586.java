import java.io.*;
import java.util.*;

class Main {
	static final String YES = "Yes";
	static final String NO = "No";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		for (int i = 0; i < S.length; i++) {
			if (i % 2 == 0 && S[i] != 'h') {
				System.out.println(NO);
				return;
			}

			if (i % 2 == 1 && S[i] != 'i') {
				System.out.println(NO);
				return;
			}
		}
		System.out.println(YES);
	}
}
