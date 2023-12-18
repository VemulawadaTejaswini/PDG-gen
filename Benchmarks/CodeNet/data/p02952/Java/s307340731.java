import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		int count = 0;
		if (N <= 9) {
			count = N;
		} else if (N <= 99) {
			count = 9;
		} else if (N <= 999) {
			count = 9 + (N - 99);
		} else if (N <= 9999) {
			count = 9 + (999 - 99);
		} else if (N <= 99999) {
			count = 9 + (999 - 99) + (N - 9999);
		} else {
			count = 9 + (999 - 99) + (99999 - 9999);
		}
		System.out.println(count);
	}
}