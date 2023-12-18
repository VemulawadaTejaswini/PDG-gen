import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		if (N % 2 == 1) {
			System.out.println((N / 2));
		} else {
			System.out.println((N / 2 - 1));
		}
	}
}
