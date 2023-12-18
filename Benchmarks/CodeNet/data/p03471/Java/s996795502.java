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

	int N, Y;
	int x = -1, y = -1, z = -1;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		Y = Integer.parseInt(tokens[1]);
	}

	void calc() {
		for (int i = 0; i * 10000 <= Y; ++i) {
			int remain0 = Y - i * 10000;
			for (int j = 0; j * 5000 <= remain0; ++j) {
				int remain1 = remain0 - j * 5000;
				if (remain1 / 1000 + i + j == N) {
					x = i;
					y = j;
					z = remain1 / 1000;
					return;
				}
			}
		}
	}

	void showResult() {
		System.out.println(x + " " + y + " " + z);
	}
}