import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	long N;
	long count = 0;

	Main(BufferedReader in) throws IOException {
		N = Long.parseLong(in.readLine());
	}

	long count(long a) {
		long mod = N % a;
		long val = N - mod;
		if (mod > 0) {
			return val / a;
		} else {
			return val / a - 1L;
		}
	}

	void calc() {
		for (long a = 1L; a <= N; ++a) {
			count += count(a);
		}
		System.out.println(count);
	}

	void showResult() {
	}
}
