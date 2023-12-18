import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long T1, T2;
	long A1, A2;
	long B1, B2;
	long times = 1;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		T1 = Long.parseLong(tokens[0]);
		T2 = Long.parseLong(tokens[1]);
		tokens = in.readLine().split(" ");
		A1 = Long.parseLong(tokens[0]);
		A2 = Long.parseLong(tokens[1]);
		tokens = in.readLine().split(" ");
		B1 = Long.parseLong(tokens[0]);
		B2 = Long.parseLong(tokens[1]);
	}

	void calc() {
		long diff1 = B1 - A1;
		long diff2 = B2 - A2;
		if ((diff1 * T1 + diff2 * T2) == 0L) {
			times = -1;
		} else if (notMeet(diff1, diff2)) {
			times = 0;
		} else {
			long middlePos = Math.abs(diff1 * T1);
			long cyclePos = Math.abs(diff1 * T1 + diff2 * T2);
			if (middlePos < cyclePos) {
				times = 1;
			} else if (middlePos % cyclePos == 0) {
				times = middlePos / cyclePos * 2;
			} else {
				times = middlePos / cyclePos * 2 + 1;
			}
		}
	}

	boolean notMeet(long diff1, long diff2) {
		if (diff1 * T1 < 0 && diff2 * T2 < 0) {
			return true;
		} else if (diff1 * T1 > 0 && diff2 * T2 > 0) {
			return true;
		}
		return false;
	}

	void showResult() {
		if (times < 0) {
			System.out.println("infinity");
		} else {
			System.out.println(times);
		}
	}
}