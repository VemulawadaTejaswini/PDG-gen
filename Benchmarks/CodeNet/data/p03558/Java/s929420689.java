import java.util.*;
import java.util.stream.Collectors;
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

	int K;

	Main(BufferedReader in) throws IOException {
		K = Integer.parseInt(in.readLine());
	}

	int count(long val) {
		String str = Long.toString(val);
		int count = 0;
		for (int i = 0; i < str.length(); ++i) {
			count += Integer.parseInt(str.substring(i, i + 1));
		}
		return count;
	}

	void calc() {
		int min = Integer.MAX_VALUE / 2;
		long val = K;
		for(int i = 0; i < 100000; ++i) {
			min = Math.min(min, count(val));
			val += (long)K;
		}
		System.out.println(min);
	}

	void showResult() {
	}
}
