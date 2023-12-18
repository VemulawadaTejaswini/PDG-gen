import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		char[] S = sc.next().toCharArray();
		final char OPEN = '(';
		final char CLOSE = ')';

		StringBuilder a = new StringBuilder();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < N; i++) {
			if (S[i] == OPEN) {
				a.append(OPEN);
				st.push(OPEN);
			} else {
				if (!st.isEmpty()) {
					st.pop();
					a.append(CLOSE);
				} else {
					a.append(OPEN);
					a.append(CLOSE);
				}
			}
		}
		while (!st.isEmpty()) {
			st.pop();
			a.append(CLOSE);
		}

		System.out.println(a.toString());
	}
}
