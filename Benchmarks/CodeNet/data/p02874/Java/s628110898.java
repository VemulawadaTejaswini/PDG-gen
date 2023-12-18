
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	List<Tuple> segments, segments2;

	static class Tuple {
		long L, R;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			L = Long.parseLong(tokens[0]);
			R = Long.parseLong(tokens[1]);
		}
	}

	Main(BufferedReader in) throws IOException {
		this.N = Integer.parseInt(in.readLine());
		this.segments = new ArrayList<>();
		this.segments2 = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			Tuple tuple = new Tuple(in.readLine());
			this.segments.add(tuple);
			this.segments2.add(tuple);
		}
		Collections.sort(this.segments, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				if (o1.L != o2.L) {
					return Long.compare(o1.L, o2.L);
				} else {
					return Long.compare(o1.R, o2.R);
				}
			}
		});
		calc();
	}

	void calc() {
		List<Long> upper = new ArrayList<>();
		upper.add(this.segments.get(0).R - this.segments.get(0).L + 1);
		long lMax = this.segments.get(0).L;
		long rMin = this.segments.get(0).R;
		for (int i = 1; i < this.segments.size(); ++i) {
			Tuple seg = this.segments.get(i);
			lMax = Math.max(lMax, seg.L);
			rMin = Math.min(rMin, seg.R);
			upper.add(Math.max(0, rMin - lMax + 1));
		}
		List<Long> lower = new ArrayList<>();
		lMax = this.segments.get(this.segments.size() - 1).L;
		rMin = this.segments.get(this.segments.size() - 1).R;
		lower.add(rMin - lMax + 1);
		for (int i = this.segments.size() - 2; i >= 0; --i) {
			Tuple seg = this.segments.get(i);
			lMax = Math.max(lMax, seg.L);
			rMin = Math.min(rMin, seg.R);
			lower.add(Math.max(0, rMin - lMax + 1));
		}
		Collections.reverse(lower);
		long result = 0;
		for (int i = 0; i+1 < upper.size(); ++i) {
			result = Math.max(result, lower.get(i+1) + upper.get(i));
		}
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
	}
};