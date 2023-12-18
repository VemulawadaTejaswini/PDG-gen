import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

interface F extends Function<Double, Double> {

}

public class Main {

	private interface F extends Function<Double, Optional<Double>> {
	}

	private static class LineFunction {
		List<F> list = new ArrayList<>();

		public boolean add(F f) {
			return this.list.add(f);
		}

		public Optional<Double> f(double x) {
			for (F f : list) {
				Optional<Double> y = f.apply(x);
				if (y.isPresent()) {
					return y;
				}
			}
			return Optional.empty();
		}
	}

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();
			int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] v = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			int n = t.length;
			int T = Arrays.stream(t).sum();

			LineFunction up = new LineFunction();

			{
				int lastTime = 0;
				double lastSpeed = 0;
				for (int i = 0; i < n; i++) {
					final double speed = lastSpeed;
					final int now = lastTime;
					final int time = t[i];
					final int vmax = v[i];

					final double needUpSpeed = vmax - speed;

					if (needUpSpeed > 0) {
						final double canUpSpeed = Math.min(needUpSpeed, t[i]);
						up.add(x -> {
							double dx = x - now;
							if (0 <= dx && dx <= canUpSpeed) {
								// y=x+b
								return Optional.of(dx + speed);
							} else if (canUpSpeed < dx && dx <= time) {
								// y=b
								return Optional.of(canUpSpeed + speed);
							}
							return Optional.empty();
						});
						lastSpeed += canUpSpeed;
					} else {
						up.add(x -> {
							double dx = now - x;
							if (0 <= dx && dx <= time) {
								return Optional.of(speed);
							}
							return Optional.empty();

						});
					}
					lastTime += time;
				}
			}
			LineFunction down = new LineFunction();
			{
				int lastTime = T;
				double lastSpeed = 0;
				for (int i = n - 1; i >= 0; i--) {
					final double speed = lastSpeed;
					final int now = lastTime;
					final int time = t[i];
					final int vmax = v[i];

					final double needUpSpeed = vmax - speed;

					if (needUpSpeed > 0) {
						final double canUpSpeed = Math.min(needUpSpeed, t[i]);
						down.add(x -> {
							double dx = now - x;
							if (0 <= dx && dx <= canUpSpeed) {
								// y=x+b
								return Optional.of(dx + speed);
							} else if (canUpSpeed < dx && dx <= time) {
								// y=b
								return Optional.of(canUpSpeed + speed);
							}
							return Optional.empty();
						});
						lastSpeed += canUpSpeed;
					} else {
						down.add(x -> {
							double dx = now - x;
							if (0 <= dx && dx <= time) {
								return Optional.of(speed);
							}
							return Optional.empty();

						});
					}
					lastTime -= time;
				}
			}

			double[] map = new double[2 * T + 1];
			for (int i = 0; i < 2 * T; i++) {
				double x = i / 2.0;
				Optional<Double> a = up.f(x);
				Optional<Double> b = down.f(x);

				if (a.isPresent() && b.isPresent()) {
					map[i] = Math.min(a.get(), b.get());
				} else if (a.isPresent()) {
					map[i] = a.get();
				} else if (b.isPresent()) {
					map[i] = b.get();
				}
			}
			System.out.println(ans(map));
		}
	}

	private static double ans(double[] map) {
		double sum = 0;

		for (int i = 1; i < map.length; i++) {
			sum += map[i - 1] + map[i];
		}

		return sum / 4.0;
	}

}
