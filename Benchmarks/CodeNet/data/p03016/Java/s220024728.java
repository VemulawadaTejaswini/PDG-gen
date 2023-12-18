import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		long L = Long.parseLong(tokens[0]);
		long A = Long.parseLong(tokens[1]);
		long B = Long.parseLong(tokens[2]);
		BigInteger M = new BigInteger(tokens[3]);
		String line = getLine(L, A, B);
		BigInteger val = new BigInteger(line);

		BigInteger result = val.mod(M);
		System.out.println(result);

	}

	static String getLine(long L, long A, long B) {
		StringBuilder strBuilder = new StringBuilder();
		long val = A;
		for (long i = 0; i < L; ++i) {
			strBuilder.append(Long.toString(val));
			val += B;
		}
		return strBuilder.toString();
	}
}
