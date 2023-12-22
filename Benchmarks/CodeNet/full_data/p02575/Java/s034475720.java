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

	int H, W;
	int[] A, B;
	Map<Integer, Integer> posMap;
	int[] rightMoveMins;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		A = new int[H + 1];
		B = new int[H + 1];
		for (int i = 0; i < H; ++i) {
			tokens = in.readLine().split(" ");
			A[i] = Integer.parseInt(tokens[0]) - 1;
			B[i] = Integer.parseInt(tokens[1]) - 1;
		}
		A[H] = -1;
		B[H] = -1;
		this.posMap = new HashMap<>();
		for (int i = 0; i < W; ++i) {
			posMap.put(i, i);
		}
		rightMoveMins = new int[H];
		Arrays.fill(rightMoveMins, Integer.MAX_VALUE / 2);
	}

	void calc() {
		for (int h = 0; h < H; ++h) {
			int a = A[h];
			int b = B[h];
			if (b < W - 1) {
				for (Integer w : posMap.keySet()) {
					if (a <= posMap.get(w) && posMap.get(w) <= b) {
						posMap.put(w, b + 1);
					}
				}
			} else {
				Set<Integer> set = new HashSet<>();
				for (Integer w : posMap.keySet()) {
					if (a <= posMap.get(w) && posMap.get(w) <= b) {
						set.add(w);
					}
				}
				for (Integer i : set) {
					posMap.remove(i);
				}
			}
			int min = Integer.MAX_VALUE / 2;
			for (Integer w : posMap.keySet()) {
				min = Math.min(posMap.get(w) - w, min);
			}
			rightMoveMins[h] = min;
		}
	}

	void showResult() {
		for (int i = 0; i < H; ++i) {
			if (rightMoveMins[i] <= W) {
				int result = rightMoveMins[i] + (i + 1);
				System.out.println(result);
			} else {
				System.out.println("-1");
			}
		}
	}
}
