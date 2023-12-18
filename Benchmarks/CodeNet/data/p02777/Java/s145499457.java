import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		String S;
		S = sc.next();
		String T;
		T = sc.next();
		long A;
		A = sc.nextLong();
		long B;
		B = sc.nextLong();

		Map<String, Long> h = new HashMap<>();
		h.put(S, A);
		h.put(T, B);
		String U = sc.next();
		if (h.containsKey(U)) {
			h.put(U, h.get(U) - 1);
		}

		System.out.println(h.get(S) + " " + h.get(T));
	}
}
