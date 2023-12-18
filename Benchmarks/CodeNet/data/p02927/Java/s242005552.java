import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int M = Integer.parseInt(tokens[0]);
		int D = Integer.parseInt(tokens[1]);
		int count = 0;
		
		for (int d0 = 2; d0 < 10; ++d0) {
			for (int d1 = 2; d1 < 10; ++d1) {
				int day = d0 * 10 + d1;
				if (day > D) {
					continue;
				}
				if (d0 * d1 <= M) {
					++count;
				}
			}
		}
		System.out.println(count);
	}
}