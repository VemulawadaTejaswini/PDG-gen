import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * Delivery Fee
 */
public class Main {

	static Main main = new Main();
	static TreeMap<Parcel, Integer> fee = new TreeMap<Parcel, Integer>() {
		{
			put(main.new Parcel(60, 2), 600);
			put(main.new Parcel(80, 5), 800);
			put(main.new Parcel(100, 10), 1000);
			put(main.new Parcel(120, 15), 1200);
			put(main.new Parcel(140, 20), 1400);
			put(main.new Parcel(160, 25), 1600);
		}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {
			int n, sum = 0;
			n = Integer.parseInt(line);
			for (int i = 0; i < n; ++i) {
				Parcel p = main.new Parcel(br.readLine());
				Entry<Parcel, Integer> e;
				if ((e = fee.ceilingEntry(p)) != null) {
					sum += e.getValue();
				}
			}
			System.out.println(sum);
		}
	}

	class Parcel implements Comparable<Parcel> {
		int size, weight;

		Parcel(int size, int weight) {
			this.size = size;
			this.weight = weight;
		}

		Parcel(int x, int y, int h, int w) {
			this(x + y + h, w);
		}

		Parcel(String info) {
			StringTokenizer st = new StringTokenizer(info);
			int x, y, h, w;
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			size = x + y + h;
			weight = w;
		}

		@Override
		public int compareTo(Parcel o) {
			int r1 = this.weight - o.weight;
			int r2 = this.size - o.size;
			if (r1 > 0 || r2 > 0) {
				return 1;
			} else if (r1 == 0 && r2 == 0) {
				return 0;
			} else {
				return -1;
			}
		}
	}
}