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

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		int H1 = Integer.parseInt(tokens[0]);
		int M1 = Integer.parseInt(tokens[1]);
		int H2 = Integer.parseInt(tokens[2]);
		int M2 = Integer.parseInt(tokens[3]);
		int K = Integer.parseInt(tokens[4]);

		int time = 0;
		time += 60 * (H2 - H1);
		if (M2 >= M1) {
			time += M2 - M1;
		} else {
			time -= 60;
			time += (60 - (M1 - M2));
		}
		System.out.println((time - K));
	}

	void calc() {
	}

	void showResult() {
	}
}
