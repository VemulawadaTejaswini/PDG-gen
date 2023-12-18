import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long N;
	long result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Long.parseLong(in.readLine());
	}

	void calc() {
		if (N % 2 == 1) {
			// 0のまま
			return;
		}
		for (long div = 10; div <= N; div *= 10) {
			// result += getAddVal(N / div);
			result += N / div;
		}
		long n = N / 10;
		for (; n > 0; n = n / 10) {
			result += (n / 5) - (n / 10);
		}
	}

	long getAddVal(long val) {
		long div = val / 10;
		long mod = val % 10;
		long result = 0;
		result += div * 11;
		result += mod;
		if (mod >= 5) {
			++result;
		}
		return result;
	}

	void showResult() {
		System.out.println(result);
	}
}
