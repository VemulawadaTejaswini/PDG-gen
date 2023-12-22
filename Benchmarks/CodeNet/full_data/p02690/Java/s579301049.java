import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long X;
	Map<Integer, Long> map;
	int A, B;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		X = Long.parseLong(tokens[0]);
		map = new HashMap<>();
		for (int i = -100; i <= 100; ++i) {
			long val = (long) Math.pow(i, 5);
			map.put(i, val);
		}
	}

	void calc() {
		List<Integer> keys = new ArrayList<>();
		keys.addAll(map.keySet());
		for (int i = 0; i < keys.size(); ++i) {
			long aPow = map.get(keys.get(i));
			for (int j = 0; j < keys.size(); ++j) {
				long bPow = map.get(keys.get(j));
				if (aPow - bPow == X) {
					A = keys.get(i);
					B = keys.get(j);
					return;
				}
			}
		}
	}

	void showResult() {
		System.out.println(A + " " + B);	
	}
}
