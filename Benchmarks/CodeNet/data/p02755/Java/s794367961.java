import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	double A, B;
	double aMin, bMin, result;
	boolean enable = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		A = Double.parseDouble(tokens[0]);
		B = Double.parseDouble(tokens[1]);

		aMin = Math.floor(A / 0.08);
		if (aMin * 0.08 < A) {
			aMin += 1.0;
		}
		bMin = Math.floor(B / 0.1);
		if (bMin * 0.1 < B) {
			bMin += 1.0;
		}
		enable = check();

	}

	boolean check() {
		if ((int) Math.floor(aMin * 0.08) != (int) A) {
			return false;
		}
		if ((int) Math.floor(bMin * 0.1) != (int) B) {
			return false;
		}
		return true;

	}

	void calc() {
		if (!enable) {
			return;
		}
		result = Math.max(aMin, bMin);
		aMin = result;
		bMin = result;
		enable = check();
	}

	void showResult() {
		if (enable) {
			System.out.println((int) result);
		} else {
			System.out.println(-1);
		}
	}

}
