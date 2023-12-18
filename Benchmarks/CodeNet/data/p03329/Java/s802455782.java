import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	List<Integer> list;
	int result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.list = new ArrayList<>();
		list.add(1);
		for (int i = 6; i <= N; i *= 6) {
			list.add(i);
		}
		for (int i = 9; i <= N; i *= 9) {
			list.add(i);
		}
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -1 * Integer.compare(o1, o2);
			}
		});
	}

	void calc() {
		result = N;
		for (int i = 0; i < 6; ++i) {
			result = Math.min(result, i + getTimes(N - i, list));
		}
	}

	int getTimes(int val, List<Integer> list) {
		if (list.size() == 1) {
			// 最後の要素は1のはず
			return val;
		}
		int top = list.get(0);
		if (top > val) {
			return getTimes(val, list.subList(1, list.size()));
		}
		int result = val / top + getTimes(val % top, list.subList(1, list.size()));
		if (val >= top * 2) {
			result = Math.min(result, val / top - 1 + getTimes(val % top + top, list.subList(1, list.size())));
		}
		result = Math.min(result, getTimes(val, list.subList(1, list.size())));
		return result;
	}

	void showResult() {
		System.out.println(result);
	}
}
