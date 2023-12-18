import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String S = in.readLine();
		boolean oddCond = true;
		boolean evenCond = true;
		for (int i = 0; i < S.length(); ++i) {
			if (i % 2 != 0) {
				if (S.charAt(i) == 'R') {
					evenCond = false;
				}
			} else {
				if (S.charAt(i) == 'L') {
					oddCond = false;
				}
			}
		}
		if (evenCond && oddCond) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}