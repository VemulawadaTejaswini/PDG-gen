
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

	int N;
	int[] A, B;
	Map<Integer, Integer> aCount, bCount;
	boolean enable = true;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new int[N];
		B = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			B[i] = Integer.parseInt(tokens[i]);
		}
		aCount = new HashMap<>();
		bCount = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (aCount.containsKey(A[i])) {
				aCount.put(A[i], aCount.get(A[i]) + 1);
			} else {
				aCount.put(A[i], 1);
			}
		}
		for (int i = 0; i < N; ++i) {
			int key = B[i];
			if (bCount.containsKey(key)) {
				bCount.put(key, bCount.get(key) + 1);
			} else {
				bCount.put(key, 1);
			}
		}
	}

	boolean isEnable() {
		int threshold = N / 2 + 1;
		for (Integer key : aCount.keySet()) {
			if (bCount.containsKey(key)) {
				if (aCount.get(key) >= threshold && bCount.get(key) >= threshold) {
					return false;
				}
			}
		}
		return true;
	}

	void calc() {
		if (!isEnable()) {
			enable = false;
			return;
		}
	}

	void showResult() {
		if (enable) {
			System.out.println("Yes");
			if (N >= 2) {
				int shiftNum = N / 2;
				if (N % 2 == 1) {
					shiftNum += 1;
				}
				System.out.print(B[shiftNum]);
				for (int i = shiftNum + 1; i < shiftNum + N; ++i) {
					int index = i % N;
					System.out.print(" " + B[index]);
				}
				System.out.println("");
			} else {
				System.out.println(B[0]);
			}
		} else {
			System.out.println("No");
		}
	}
}