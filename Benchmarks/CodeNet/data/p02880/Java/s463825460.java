import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());

		boolean result = false;
		for (int i = 1; i <= 9; ++i) {
			if (N % i == 0) {
				if (N / i <= 9) {
					result = true;
				}
			}
		}
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
