import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 解説通り実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr)) {
			String[] strings = br.readLine().split("\\s+");
			int h = Integer.parseInt(strings[0]), w = Integer.parseInt(strings[1]), n = Integer.parseInt(strings[2]);

			Map<Dimesion, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				strings = br.readLine().split("\\s+");
				int a = Integer.parseInt(strings[0]), b = Integer.parseInt(strings[1]);
				for (int j = 0; j <= 2; j++) {
					if ((a - j > 0) && (a - j <= h - 2)) {
						for (int k = 0; k <= 2; k++) {
							if ((b - k > 0) && (b - k <= w - 2)) {
								Dimesion key = new Dimesion(a - j, b - k);
								map.put(key, map.getOrDefault(key, 0) + 1);
							}
						}
					}
				}
			}
			long[] results = new long[10];
			map.values().forEach(value -> results[value]++);
			results[0] = (h - 2L) * (w - 2L) - map.size();
			Arrays.stream(results).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Mapのキーとなるクラス
	 */
	private static class Dimesion {
		int x;
		int y;

		Dimesion(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Dimesion) {
				Dimesion dimesion = (Dimesion) obj;
				return (x == dimesion.x) && (y == dimesion.y);
			}
			return false;
		}
	}
}
