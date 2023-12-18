import java.util.*;
import java.io.*;

/**
 * 
 * @author glycine
 *
 */
public class Main {
	int N, Q;
	String s;
	char[] t, d;
	Map<Character, List<Integer>> cellTypes;
	int[] positions;

	int result;

	Main() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		Q = Integer.parseInt(tokens[1]);
		s = in.readLine();
		t = new char[Q];
		d = new char[Q];
		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			t[i] = tokens[0].charAt(0);
			d[i] = tokens[1].charAt(0);
		}
		in.close();
		init();
	}

	void calc() {
		int left = -1;
		int right = N;
		for (int i = Q - 1; i >= 0; --i) {
			char c = t[i];
			char dir = d[i];
			if (dir == 'L') {
				if (s.charAt(left + 1) == c) {
					++left;
				}
			} else {
				if (s.charAt(right - 1) == c) {
					--right;
				}
			}
		}
		this.result = N;
		if (left >= 0) {
			this.result -= (left + 1);
		}
		if (right <= N - 1) {
			this.result -= (N - right);
		}

	}

	void init() {
		// 最初にすべての位置に一つロボットがある
		this.positions = new int[N];
		Arrays.fill(this.positions, 1);

		// cellTypesの位置はソートされている
		this.cellTypes = new HashMap<>();
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (!this.cellTypes.containsKey(c)) {
				this.cellTypes.put(c, new ArrayList<Integer>());
			}
			this.cellTypes.get(c).add(i);
		}
	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);

	}

}
