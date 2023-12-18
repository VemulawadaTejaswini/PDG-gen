import java.util.*;
import java.util.stream.Collectors;
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

	int N, K;
	Tuple[] p;
	long result = Long.MAX_VALUE / 2;

	static class Tuple {
		long x, y;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			x = Long.parseLong(tokens[0]);
			y = Long.parseLong(tokens[1]);
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
		p = new Tuple[N];
		for (int i = 0; i < N; ++i) {
			p[i] = new Tuple(in.readLine());
		}
		Arrays.parallelSort(p, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				int result = Long.compare(o1.x, o2.y);
				if (result != 0) {
					return result;
				} else {
					return Long.compare(o1.y, o2.y);
				}
			}
		});
	}

	int count(Tuple p1, Tuple p2) {
		long minX = Math.min(p1.x, p2.x);
		long maxX = Math.max(p1.x, p2.x);
		long minY = Math.min(p1.y, p2.y);
		long maxY = Math.max(p1.y, p2.y);
		int c = 0;
		for (int i = 0; i < N; ++i) {
			Tuple point = p[i];
			if (point.x >= minX && point.x <= maxX) {
				if (point.y >= minY && point.y <= maxY) {
					++c;
				}
			}
		}
		return c;
	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			Tuple p1 = p[i];
			for (int j = i + 1; j < N; ++j) {
				Tuple p2 = p[j];
				int c = count(p1, p2);
				if (c >= K) {
					long minX = Math.min(p1.x, p2.x);
					long maxX = Math.max(p1.x, p2.x);
					long minY = Math.min(p1.y, p2.y);
					long maxY = Math.max(p1.y, p2.y);
					result = Math.min(result, (maxX - minX) * (maxY - minY));
				}
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}
}