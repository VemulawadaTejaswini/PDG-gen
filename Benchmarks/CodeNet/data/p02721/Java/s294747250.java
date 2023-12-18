import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, K, C;
	String S;
	List<Integer> result;

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
		K = Integer.parseInt(tokens[1]);
		C = Integer.parseInt(tokens[2]);
		S = in.readLine();
	}

	List<Integer> searchFromTop(int currentIndex, int remainNum) {
		if (S.charAt(currentIndex) == 'o') {
			if (remainNum == 1) {
				List<Integer> result = new ArrayList<>(K);
				result.add(currentIndex);
				return result;
			} else {
				List<Integer> result = searchFromTop(currentIndex + C + 1, remainNum - 1);
				result.add(currentIndex);
				return result;
			}
		} else {
			return searchFromTop(currentIndex + 1, remainNum);
		}
	}

	List<Integer> searchFromEnd(int currentIndex, int remainNum) {
		if (S.charAt(currentIndex) == 'o') {
			if (remainNum == 1) {
				List<Integer> result = new ArrayList<>(K);
				result.add(currentIndex);
				return result;
			} else {
				List<Integer> result = searchFromEnd(currentIndex - C - 1, remainNum - 1);
				result.add(currentIndex);
				return result;
			}
		} else {
			return searchFromEnd(currentIndex - 1, remainNum);
		}
	}

	void calc() {
		List<Integer> indexes = searchFromTop(0, K);
		List<Integer> indexes2 = searchFromEnd(N - 1, K);
		Collections.reverse(indexes);
		result = new ArrayList<>();
		for (int i = 0; i < indexes.size(); ++i) {
			if (indexes.get(i) == indexes2.get(i)) {
				result.add(indexes.get(i));
			}
		}
		Collections.sort(result);
	}

	void showResult() {
		for (int i = 0; i < result.size(); ++i) {
			System.out.println((result.get(i) + 1));
		}
	}

}
