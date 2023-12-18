import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	String X;
	List<Pair> playList;
	int result = 0;

	static class Pair {
		Pair(String s, int t) {
			this.s = s;
			this.t = t;
		}

		String s;
		int t;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.playList = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			this.playList.add(new Pair(tokens[0], Integer.parseInt(tokens[1])));
		}
		X = in.readLine();
	}

	void calc() {
		boolean isSleep = false;
		for (int i = 0; i < N; ++i) {
			if (isSleep) {
				result += this.playList.get(i).t;
			} else {
				if (this.playList.get(i).s.equals(X)) {
					isSleep = true;
				}
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}
}
