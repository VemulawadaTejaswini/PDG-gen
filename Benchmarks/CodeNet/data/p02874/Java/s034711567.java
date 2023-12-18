import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	List<Tuple> segments, segments2;
	List<Long> LList, RList;

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
		this.RList = new ArrayList<>();
		this.LList = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			Tuple tuple = new Tuple(in.readLine());
			this.segments.add(tuple);
			this.segments2.add(tuple);
			RList.add(tuple.R);
			LList.add(tuple.L);
		}
		Collections.sort(this.segments, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				if (o1.L != o2.L) {
					return Long.compare(o1.L, o2.L);
				} else {
					return -1 * Long.compare(o1.R, o2.R);
				}
			}
		});
		Collections.sort(this.segments2, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				if (o1.R != o2.R) {
					return -1 * Long.compare(o1.R, o2.R);
				} else {
					return Long.compare(o1.L, o2.L);
				}
			}
		});
		Collections.sort(RList);
		Collections.sort(LList, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return -1 * Long.compare(o1, o2);
			}
		});
		calc();
	}

	long sub2(List<Tuple> segments, int target) {
		Tuple seg = segments.get(target);
		// 中抜きパターン
		long result = seg.R - seg.L + 1;
		long R = 0, L = 0;
		if (seg.R != RList.get(0)) {
			R = RList.get(0);
		} else {
			R = RList.get(1);
		}
		if (seg.L != LList.get(0)) {
			L = LList.get(0);
		} else {
			L = LList.get(1);
		}
		result += Math.max(0, R - L + 1);
		return result;
	}

	long sub(List<Tuple> segments) {
		List<Long> upper = new ArrayList<>();
		upper.add(segments.get(0).R - segments.get(0).L + 1);
		long lMax = segments.get(0).L;
		long rMin = segments.get(0).R;
		for (int i = 1; i < segments.size(); ++i) {
			Tuple seg = segments.get(i);
			lMax = Math.max(lMax, seg.L);
			rMin = Math.min(rMin, seg.R);
			upper.add(Math.max(0, rMin - lMax + 1));
		}
		List<Long> lower = new ArrayList<>();
		lMax = segments.get(segments.size() - 1).L;
		rMin = segments.get(segments.size() - 1).R;
		lower.add(rMin - lMax + 1);
		for (int i = segments.size() - 2; i >= 0; --i) {
			Tuple seg = segments.get(i);
			lMax = Math.max(lMax, seg.L);
			rMin = Math.min(rMin, seg.R);
			lower.add(Math.max(0, rMin - lMax + 1));
		}
		Collections.reverse(lower);
		long result = 0;
		for (int i = 0; i + 1 < upper.size(); ++i) {
			result = Math.max(result, lower.get(i + 1) + upper.get(i));
		}
		return result;
	}

	void calc() {
		long calcA = sub(this.segments);
		long calcB = sub(this.segments2);
		long result = Math.max(calcA, calcB);
		for (int i = 0; i < segments.size(); ++i) {
			long sub2Result = sub2(segments, i);
			result = Math.max(result, sub2Result);
		}
		/*
		 * Collections.reverse(this.segments2); for (int i = 0; i < segments2.size();
		 * ++i) { long sub2Result = sub2(segments2, i); result = Math.max(result,
		 * sub2Result); }
		 */
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
	}
};