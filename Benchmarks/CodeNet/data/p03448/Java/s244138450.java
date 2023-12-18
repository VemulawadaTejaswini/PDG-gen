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

	int A, B, C, X;
	int count = 0;

	Main(BufferedReader in) throws IOException {
		A = Integer.parseInt(in.readLine());
		B = Integer.parseInt(in.readLine());
		C = Integer.parseInt(in.readLine());
		X = Integer.parseInt(in.readLine());
	}

	void calc() {
		for (int i = 0; i <= A; ++i) {
			if (500 * i <= X) {
				int remain0 = X - 500 * i;
				for (int j = 0; j <= B; ++j) {
					if (100 * j <= remain0) {
						int remain1 = remain0 - 100 * j;
						if (remain1 % 50 == 0 && remain1 / 50 <= C) {
							++count;
						}
					}
				}
			}
		}
		System.out.println(count);

	}

	void showResult() {
	}
}