import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	private static List<Point> points;

	public static void main(String[] args) {

		Scanner sysin = new Scanner(System.in);
		final int n = sysin.nextInt();
		points = IntStream.range(0, n)
			.mapToObj(i -> new Point(sysin.nextLong(), sysin.nextLong(), Vector.get(sysin.next().charAt(0))))
			.collect(Collectors.toList());
		sysin.close();

		double min = Double.MAX_VALUE;
		for (Dimention dim : Dimention.values()) {
			double maxAbs = points.stream().mapToDouble(p -> Math.abs(p.get(dim, 0.0d))).max().getAsDouble();
			Pair<Double, Double> d1 = binSearch(dim, calc(dim, 0.0d), calc(dim, maxAbs * 2));
			Pair<Double, Double> d2 = calc(dim == Dimention.X ? Dimention.Y : Dimention.X, d1.getKey());

			//System.out.printf("%s d1 = %f, %f\n", dim, d1.getKey(), d1.getValue());
			//System.out.printf("%s d2 = %f, %f\n", dim, d2.getKey(), d2.getValue());
			min = Math.min(min, d1.getValue() * d2.getValue());
		}

		System.out.println(min);

	}

	private static Pair<Double, Double> calc(Dimention dim, double time) {
		double[] values = points.stream().mapToDouble(p -> p.get(dim, time)).toArray();
		double max = Arrays.stream(values).max().getAsDouble();
		double min = Arrays.stream(values).min().getAsDouble();
		double value = max - min;
		//System.out.printf("(%s, %f) = %f = %f - %f\n", dim, time, value, max, min);
		return (new Pair<>(time, value));
	}

	private static Pair<Double, Double> binSearch(Dimention dim, Pair<Double, Double> start, Pair<Double, Double> end) {
		double midt = (start.getKey() + end.getKey()) / 2;
		Pair<Double, Double> mid = calc(dim, midt);

		double stv = start.getValue();
		double cev = mid.getValue();
		double env = end.getValue();

		double left = Math.abs(stv - cev);
		double right = Math.abs(env - cev);

		//System.out.printf("%s ... (%f, %f), (%f, %f), (%f, %f)\n", dim, start.getKey(), stv, midt, cev, end.getKey(), env);

		if (left == right) {
			if (stv == env) return mid; // ずっと同じ値
			if (stv < cev) return start; // 右肩上がり
			if (env < cev) return end; // 右肩下がり)
			return mid; // 中央凹み
		} else if (left <  right) {
			 return binSearch(dim, start, mid);
		} else {
			return binSearch(dim, mid, end);
		}
	}

	@SuppressWarnings("serial")
	private static class Pair<K, V> extends SimpleImmutableEntry<K, V> {
		public Pair(final K key, final V value) {
			super(key, value);
		}
	}

	private static class Point {
		private final long x, y;
		private final Vector vector;

		public Point(long x, long y, Vector v) {
			this.x = x;
			this.y = y;
			this.vector = v;
		}

		public double get(Dimention d, double time) {
			switch (d) {
			case X : return (time * vector.x) + x;
			case Y : return (time * vector.y) + y;
			}
			return 0.0d;
		}
	}

	private static enum Vector {
		RIGHT( 1,  0),
		LEFT (-1,  0),
		UP   ( 0,  1),
		DOWN ( 0, -1);

		public final int x, y;
		private Vector(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public static Vector get(char c) {
			switch(c) {
			case 'R' :
				return RIGHT;
			case 'L' :
				return LEFT;
			case 'U' :
				return UP;
			case 'D' :
				return DOWN;
			default  :
				throw new IllegalArgumentException();
			}
		}
	}

	private static enum Dimention {
		X, Y;
	}
}
