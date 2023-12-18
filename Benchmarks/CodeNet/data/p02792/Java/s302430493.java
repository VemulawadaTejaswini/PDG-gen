import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	List<Integer>[][] array;
	long result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.array = new List[10][10];
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				this.array[i][j] = new ArrayList<Integer>();
			}
		}

		// arrayの生成
		for (int i = 1; i <= N; ++i) {
			int[] indexes = sub(i);
			if (indexes != null) {
				this.array[indexes[0]][indexes[1]].add(i);
			}
		}

	}

	int[] sub(int val) {
		String str = Integer.toString(val);
		if (str.charAt(str.length() - 1) == '0') {
			return null;
		}
		int[] result = new int[2];

		result[0] = Integer.parseInt(str.substring(0, 1));
		result[1] = Integer.parseInt(str.substring(str.length() - 1, str.length()));
		return result;
	}

	void calc() {
		// カウントする
		for (int i = 1; i < 10; ++i) {
			for (int j = 1; j < 10; ++j) {
				result += this.array[i][j].size() * this.array[j][i].size();
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}
}
