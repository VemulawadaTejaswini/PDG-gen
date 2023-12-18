import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	long K;

	Main(BufferedReader in) throws IOException {
		K = Long.parseLong(in.readLine());
	}

	void calc() {
		if (K % 2 == 0) {
			System.out.println(2);
			long a0 = 1L + K / 2L;
			long a1 = 0L + (K / 2L);
			System.out.println(a0 + " " + a1);
		} else {
			System.out.println(2);
			long a0 = 1L + ((K - 1L) / 2L) - 1L;
			long a1 = 0L + ((K - 1L) / 2L) + 2L;
			System.out.println(a0 + " " + a1);
		}
	}

	void showResult() {
	}
}