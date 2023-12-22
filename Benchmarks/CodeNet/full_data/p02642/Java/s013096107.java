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

	int N;
	int[] A;
	boolean[] flags;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		Arrays.sort(A);
		flags = new boolean[N];
		Arrays.fill(flags, true);
	}

	Set<Integer> check(Set<Integer> targets, int baseIndex) {
		Set<Integer> set = new HashSet<>();
		set.add(baseIndex);
		if (baseIndex + 1 < N && A[baseIndex] == A[baseIndex + 1]) {
			flags[baseIndex] = false;
		}
		targets.remove(baseIndex);
		for (Integer i : targets) {
			if (A[i] % A[baseIndex] == 0) {
				flags[i] = false;
				set.add(i);
			}
		}
		return set;
	}

	void calc() {
		int count = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < N; ++i) {
			set.add(i);
		}
		for (int i = 0; i < N; ++i) {
			if (flags[i]) {
				Set<Integer> s = check(set, i);
				set.removeAll(s);
			}
		}
		for (int i = 0; i < N; ++i) {
			if (flags[i]) {
				++count;
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}
}