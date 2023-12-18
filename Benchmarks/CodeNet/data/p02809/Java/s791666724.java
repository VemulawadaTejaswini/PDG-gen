import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] a;
	Queue<Integer> que = new PriorityQueue<>();
	List<Integer> result = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.a = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			this.a[i] = Integer.parseInt(tokens[i]);
		}
		for(int i= 1; i <= N; ++i) {
			que.add(i);
		}
	}

	int getNext(int invalidValue) {
		int result = -1;
		List<Integer> list = new ArrayList<>(que.size());
		while (!que.isEmpty()) {
			int val = que.poll();
			if (val != invalidValue) {
				result = val;
				break;
			} else {
				list.add(val);
			}
		}
		que.addAll(list);
		return result;
	}

	void calc() {
		// 順に入れていく
		// 最初の要素は自由に入れられる
		result.add(que.poll());
		int prevVal = result.get(0) - 1;
		for (int i = 0; i < N - 1; ++i) {
			int next = getNext(a[prevVal]);
			if (next < 0) {
				result = null;
				break;
			}
			result.add(next);
			prevVal = next - 1;
		}
	}

	void showResult() {
		if (result == null) {
			System.out.println("-1");
		} else {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(result.get(0));
			for (int i = 1; i < result.size(); ++i) {
				strBuilder.append(" " + result.get(i));
			}
			System.out.println(strBuilder.toString());
		}
	}
}