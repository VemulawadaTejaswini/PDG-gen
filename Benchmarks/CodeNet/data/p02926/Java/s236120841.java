import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple implements Comparable<Tuple> {
		double x, y, abs;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			this.x = Double.parseDouble(tokens[0]);
			this.y = Double.parseDouble(tokens[1]);
			this.abs = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
		}

		@Override
		public int compareTo(Tuple o) {
			return -1 * Double.compare(this.abs, o.abs);
		}

	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		Queue<Tuple> que = new PriorityQueue<>(N);
		for (int i = 0; i < N; ++i) {
			que.add(new Tuple(in.readLine()));
		}

		double x = 0.0;
		double y = 0.0;
		double abs = 0.0;
		while (!que.isEmpty()) {
			Tuple tuple = que.poll();
			double newX = x + tuple.x;
			double newY = y + tuple.y;
			double newAbs = Math.sqrt(newX * newX + newY * newY);
			if (abs <= newAbs) {
				x = newX;
				y = newY;
				abs = newAbs;
			}
		}
		System.out.println(abs);
	}
}
