import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M;
	List<Pair> answers;
	Set<Integer> accepts;
	Map<Integer, Integer> penalties;

	static class Pair {
		int p;
		String S;

		Pair(int p, String S) {
			this.p = p;
			this.S = S;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		this.answers = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			this.answers.add(new Pair(Integer.parseInt(tokens[0]), tokens[1]));
		}
	}

	void calc() {
		this.accepts = new HashSet<>();
		this.penalties = new HashMap<>();
		for (Pair pair : answers) {
			if (!this.penalties.containsKey(pair.p)) {
				this.penalties.put(pair.p, 0);
			}
		}
		for (Pair pair : answers) {
			if (pair.S.equals("AC")) {
				this.accepts.add(pair.p);
			} else {
				if (!this.accepts.contains(pair.p)) {
					this.penalties.put(pair.p, this.penalties.get(pair.p) + 1);
				}
			}
		}

	}

	void showResult() {
		int acceptNum = this.accepts.size();
		int penaltyNum = 0;
		for (Integer key : this.accepts) {
			penaltyNum += this.penalties.get(key);
		}
		System.out.println(acceptNum + " " + penaltyNum);
	}
}