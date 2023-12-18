import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int M = Integer.parseInt(tokens[0]);
		long K = Long.parseLong(tokens[1]);
		in.close();
		if (K != 0) {
			System.out.println("-1");
		} else {
			for (int j = 0; j < 2; ++j) {
				for (long i = 0; i < Math.pow(2.0, (double) M); ++i) {
					System.out.print(i + " ");
				}
			}
		}
	}
}