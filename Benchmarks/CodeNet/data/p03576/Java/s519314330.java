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
	long result = Long.MAX_VALUE - 1;

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
				int result = Long.compare(o1.x, o2.x);
				if (result != 0) {
					return result;
				} else {
					return Long.compare(o1.y, o2.y);
				}
			}
		});
	}

	int count(Tuple p1, Tuple p2, Tuple p3, Tuple p4) {
		Tuple[] array = new Tuple[3];
		array[0] = p2;
		array[1] = p3;
		array[2] = p4;
		long minX = p1.x;
		long minY = p1.y;
		long maxX = p1.x;
		long maxY = p1.y;
		for (int i = 0; i < 3; ++i) {
			minX = Math.min(minX, array[i].x);
			minY = Math.min(minY, array[i].y);
			maxX = Math.max(maxX, array[i].x);
			maxY = Math.max(maxY, array[i].y);
		}
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
			for (int j = i; j < N; ++j) {
				Tuple p2 = p[j];
				for (int k = j; k < N; ++k) {
					Tuple p3 = p[k];
					for (int l = k; l < N; ++l) {
						Tuple p4 = p[l];
						int c = count(p1, p2, p3, p4);
						if (c >= K) {
							Tuple[] array = new Tuple[3];
							array[0] = p2;
							array[1] = p3;
							array[2] = p4;
							long minX = p1.x;
							long minY = p1.y;
							long maxX = p1.x;
							long maxY = p1.y;
							for (int m = 0; m < 3; ++m) {
								minX = Math.min(minX, array[m].x);
								minY = Math.min(minY, array[m].y);
								maxX = Math.max(maxX, array[m].x);
								maxY = Math.max(maxY, array[m].y);
							}
							long x = maxX - minX;
							long y = maxY - minY;
							long val = x * y;
							result = Math.min(result, val);
						}
					}
				}
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}
}