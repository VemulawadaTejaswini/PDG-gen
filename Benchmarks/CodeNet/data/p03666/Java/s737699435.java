import java.io.*;
import java.util.*;
import java.math.*;

public class Main implements Runnable {
	private static BufferedReader in;
	private static PrintWriter out;
	private static StringTokenizer st;
	private static Random rnd;
	
	static class Segment implements Comparable<Segment> {
		long left, right;

		public Segment(long left, long right) {
			this.left = left;
			this.right = right;
		}

		@Override
		public String toString() {
			return "Segment [left=" + left + ", right=" + right + "]";
		}
		
		public int compareTo(Segment other) {
			return Long.compare(left, other.left);
		}
		
	}

	private void solve() throws IOException {
		long count = nextLong();
		long left = nextLong();
		long right = nextLong();
		long min = nextLong();
		long max = nextLong();
		
//		if (left > right) {
//			long tmp = left;
//			left = right;
//			right = tmp;
//		}
		
//		long maxDiff = (count - 1) * max;
//		
//		if ((right - left) > maxDiff) {
//			out.println("NO");
//			return;
//		}
//		
		List<Segment> segments = new ArrayList<>();
		segments.add(new Segment(left, left));
//		long distanceBefore = getDistance(segments, right);
		
		boolean found = false;
		
		--count;
		
		for (long i = 0; i < count; i++) {
			long L = left - max * (count - i) + i * min;
			long R = left - min * (count - i) + i * max;
			//out.println(L + " " + R);
			if (L <= right && right <= R)
				found = true;
		}
		out.println(found ? "YES" : "NO");
		
//		for (long i = 0; i < count; i++) {
//			List<Segment> newSegments = new ArrayList<>();
//			for (Segment segment : segments) {
//				newSegments.add(new Segment(segment.left + min, segment.right + max));
//				newSegments.add(new Segment(segment.left - max, segment.right - min));
//			}
//			segments = newSegments;

			//long distance = getDistance(newSegments, right);
			
			//segments = merge(newSegments);
			//distanceBefore = distance;
		//}
//		Collections.sort(segments);
//		out.println(segments);
//		
		
		
	}

//	private long getDistance(List<Segment> segments, long right) {
//		long distance = Long.MAX_VALUE;
//		for (Segment segment : segments) {
//			if (segment.left <= right && right <= segment.right) {
//				distance = 0;
//			} else {
//				distance = Math.min(distance, Math.min(Math.abs(right - segment.left), Math.abs(right - segment.right)));
//			}
//		}
//		return distance;
//	}

	private List<Segment> merge(List<Segment> segments) {
		List<Segment> result = new ArrayList<>();
		Collections.sort(segments);
		int cursor = 0;
		while (cursor < segments.size()) {
			long left = segments.get(cursor).left;
			long right = segments.get(cursor).right;
			while (cursor < segments.size() && segments.get(cursor).left <= right) {
				right = Math.max(right, segments.get(cursor).right);
				++cursor;
			}
			if (Math.abs(left) < Integer.MAX_VALUE || Math.abs(right) < Integer.MAX_VALUE)
				result.add(new Segment(left, right));
		}
		return result;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);

			rnd = new Random();

			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			String line = in.readLine();

			if (line == null)
				return null;

			st = new StringTokenizer(line);
		}

		return st.nextToken();
	}

	private int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	private long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	private double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}