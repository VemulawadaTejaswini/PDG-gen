import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	Map<Integer, Integer> map;
	int[] A;
	int pairNum;
	Map<Integer, Boolean> isEven;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		this.map = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!this.map.containsKey(A[i])) {
				this.map.put(A[i], 0);
			}
			this.map.put(A[i], this.map.get(A[i]) + 1);
		}
		pairNum = 0;
		for (Integer key : this.map.keySet()) {
			pairNum += map.get(key) * (map.get(key) - 1) / 2;
		}
		this.isEven = new HashMap<>();
		for (Integer key : this.map.keySet()) {
			int num = map.get(key);
			if (num % 2 == 0) {
				this.isEven.put(key, true);
			} else {
				this.isEven.put(key, false);
			}
		}

	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			int a = A[i];
			int val = pairNum;
			int num = map.get(a);
			val -= (num * (num - 1)) / 2;
			val += (num - 1) * (num - 2) / 2;
			System.out.println(val);
		}
	}

	void showResult() {
	}

}
