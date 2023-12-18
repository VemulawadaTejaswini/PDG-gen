import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int H, W, N;
	int result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		this.H = Integer.parseInt(in.readLine());
		this.W = Integer.parseInt(in.readLine());
		this.N = Integer.parseInt(in.readLine());
	}

	void calc() {
		int row = Math.max(H, W);
		result = N / row;
		if (N % row != 0) {
			result++;
		}
	}

	void showResult() {
		System.out.println(result);
	}
}
