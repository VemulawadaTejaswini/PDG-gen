
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair {
		int l, r;
		long c;

		Pair(int l, int r, long c) {
			this.l = l;
			this.r = r;
			this.c = c;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N, M;
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		List<Pair> sections = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			sections.add(new Pair(Integer.parseInt(tokens[0]) - 1, Integer.parseInt(tokens[1]) - 1,
					Long.parseLong(tokens[2])));
		}
		long[] distances = new long[N];
		Arrays.fill(distances, Long.MAX_VALUE / 2);
		distances[0] = 0L;
		Collections.sort(sections, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				if (o1.c != o2.c) {
					return Long.compare(o1.c, o2.c);
				} else {
					return -1 * Integer.compare(o1.r - o1.l, o2.r - o2.l);
				}
			}
		});
		Set<Integer> covered = new HashSet<>();
		List<Pair> useSecs = new ArrayList<>();
		for (int i = 0; i < sections.size(); ++i) {
			Pair sec = sections.get(i);
			useSecs.add(sec);
			for (int j = sec.l + 1; j <= sec.r; ++j) {
				covered.add(j);
			}
			if (covered.size() >= N - 1) {
				break;
			}
		}
		Collections.sort(useSecs, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				if (o1.l != o2.l) {
					return Integer.compare(o1.l, o2.l);
				} else if (o2.r != o2.r) {
					return Integer.compare(o1.r, o2.r);
				} else {
					return Long.compare(o1.c, o2.c);
				}
			}
		});

		int left = 0;
		for (int i = 0; i < useSecs.size(); ++i) {
			Pair sec = useSecs.get(i);
			long baseDist = distances[sec.l];
			for (int j = left; j <= sec.r; ++j) {
				distances[j] = Math.min(distances[j], baseDist + sec.c);
			}
			left = sec.r;
		}
		if (distances[N - 1] >= Long.MAX_VALUE / 2) {
			System.out.println(-1);
		} else {
			System.out.println(distances[N - 1]);
		}
	}
}