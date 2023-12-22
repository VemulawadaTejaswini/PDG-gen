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
	long X, M;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Long.parseLong(tokens[0]);
		X = Long.parseLong(tokens[1]);
		M = Long.parseLong(tokens[2]);
	}

	void calc() {
		Set<Long> set = new HashSet<>();
		List<Long> list = new ArrayList<>();
		set.add(X);
		list.add(X);

		long loopFirst = -1L;
		int count = 1;
		long val = X;
		while (true) {
			if (count >= N) {
				break;
			}
			val = (val * val) % M;
			if (set.contains(val)) {
				loopFirst = val;
				break;
			}
			set.add(val);
			list.add(val);
			++count;
		}

		if (loopFirst < 0) {
			// loopが始まる前に終了
			long result = 0;
			for (int i = 0; i < list.size(); ++i) {
				result += list.get(i);
			}
			System.out.println(result);
		} else {
			// loopが始まるまでの数
			int preNum = 0;
			for (int i = 0; i < list.size(); ++i) {
				if (list.get(i) == loopFirst) {
					preNum = i;
					break;
				}
			}
			int loopNum = list.size() - preNum;
			// loop中のsum
			long loopSum = 0;
			for (int i = preNum; i < list.size(); ++i) {
				loopSum += list.get(i);
			}
			long result = 0;
			// loopが始まるまでcount
			for (int i = 0; i < preNum; ++i) {
				result += list.get(i);
			}
			long afterLoopCount = (N - (long) preNum) / (long) loopNum;
			result += loopSum * afterLoopCount;
			for (int i = 0; i < (N-(long)preNum) % (long) loopNum; ++i) {
				result += list.get(preNum + i);
			}
			System.out.println(result);
		}

	}

	void showResult() {
	}
}