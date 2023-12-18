import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		char[] S = in.readLine().toCharArray();
		Deque<Character> deque = new ArrayDeque<>();
		deque.addLast(S[0]);
		for (int i = 1; i < N; ++i) {
			if (S[i] != deque.getLast()) {
				deque.addLast(S[i]);
			}
		}
		System.out.println(deque.size());
	}
}
