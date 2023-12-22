import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		BigDecimal A = new BigDecimal(tokens[0]);
		BigDecimal B = new BigDecimal(tokens[1]);
		A = A.multiply(B);
		BigInteger result = A.toBigInteger();
		System.out.println(result);

	}

	void calc() {
	}

	void showResult() {
	}
}
