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

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);

		int[] d = new int[K];
		List<Integer>[] A = new List[K];
		for (int i = 0; i < K; ++i) {
			d[i] = Integer.parseInt(in.readLine());
			tokens = in.readLine().split(" ");
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < d[i]; ++j) {
				list.add(Integer.parseInt(tokens[j]));
			}
			A[i] = list;
		}

		Set<Integer> set = new HashSet<>();
		for (int i = 1; i <= N; ++i) {
			set.add(i);
		}
		for (List<Integer> list : A) {
			for (int j = 0; j < list.size(); ++j) {
				set.remove(list.get(j));
			}
		}
		System.out.println(set.size());
	}

	void calc() {
	}

	void showResult() {
	}

}
