
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		TreeSet<Time> set = new TreeSet<Time>();
		while (n-- > 0)
			set.add(new Time(scanner.nextInt(), scanner.nextInt()));

		int m = scanner.nextInt();
		while (m-- > 0)
			set.add(new Time(scanner.nextInt(), scanner.nextInt()));
		System.out.print(set.pollFirst());
		for (Time time : set)
			System.out.print(" " + time);
		System.out.println();

	}

	class Time implements Comparable<Time> {
		int h, m;

		public Time(int h, int m) {
			super();
			this.h = h;
			this.m = m;
		}

		@Override
		public String toString() {
			return String.format("%d:%02d", h, m);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + h;
			result = prime * result + m;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Time other = (Time) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (h != other.h)
				return false;
			if (m != other.m)
				return false;
			return true;
		}

		@Override
		public int compareTo(Time o) {
			if (this.h == o.h)
				return this.m - o.m;
			return this.h - o.h;
		}

		private Main getOuterType() {
			return Main.this;
		}

	}
}