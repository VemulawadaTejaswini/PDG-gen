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

	int getShiftNum() {
		// まずAにも出てきて，かつBの一番多い要素を求める
		int maxCount = -1;
		int val = -1;
		for (Integer v : bCount.keySet()) {
			if (aCount.containsKey(v)) {
				if (maxCount < bCount.get(v)) {
					maxCount = bCount.get(v);
					val = v;
				}
			}
		}
		if (val < 0) {
			int shiftNum = N / 2;
			if (N % 2 == 1) {
				shiftNum += 1;
			}
			return shiftNum;
		}
		// valがAの中で最後に出る位置を探す
		int aIndex = 0;
		for (int i = 0; i < N; ++i) {
			if (A[i] == val) {
				aIndex = i;
			}
		}
		// valがBの中で最初に出てくる位置を探す
		int bIndex = 0;
		for (int i = 0; i < N; ++i) {
			if (B[i] == val) {
				bIndex = i;
				break;
			}
		}
		// bIndexが，aIndex+1になれば嬉しい
		int shiftNum = aIndex + 1 - bIndex;

		return shiftNum;
	}

	int[] getShiftArray(int shiftNum) {
		int[] result = new int[N];
		for (int i = 0; i < N; ++i) {
			int index = (i + shiftNum + N) % N;
			result[i] = B[index];
		}
		return result;
	}

	boolean isOK(int[] shiftArray) {
		for (int i = 0; i < N; ++i) {
			if (A[i] == shiftArray[i]) {
				return false;
			}
		}
		return true;
	}

	void showResult() {
		if (enable) {
			System.out.println("Yes");
			if (N >= 2) {
				int shiftNum = getShiftNum();
				int[] shiftArray = getShiftArray(shiftNum);
				if (!isOK(shiftArray)) {
					shiftArray = getShiftArray(-1 * shiftNum);
				}
				System.out.print(shiftArray[0]);
				for (int i = 1; i < N; ++i) {
					System.out.print(" " + shiftArray[i]);
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
