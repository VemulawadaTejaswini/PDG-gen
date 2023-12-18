import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair implements Comparable<Pair> {
		long time, deadline;

		Pair(long time, long deadline) {
			this.time = time;
			this.deadline = deadline;
		}

		@Override
		// 締め切りが早いもの -> 長さが長いもの
		public int compareTo(Pair o) {
			if (this.deadline < o.deadline) {
				return -1;
			} else if (this.deadline > o.deadline) {
				return 1;
			} else {
				if (this.time > o.time) {
					return -1;
				} else if (this.time < o.time) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		List<Pair> tasks = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			tasks.add(new Pair(Long.parseLong(tokens[0]), Long.parseLong(tokens[1])));
		}
		Collections.sort(tasks);
		long time = 0;
		boolean result = true;
		for (int i = 0; i < tasks.size(); ++i) {
			Pair task = tasks.get(i);
			time += task.time;
			if (time > task.deadline) {
				result = false;
				break;
			}
		}
		String str = result ? "Yes" : "No";
		System.out.println(str);

		in.close();
	}

}
