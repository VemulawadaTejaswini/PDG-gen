import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int c = 0;
	static int value;
	static int weight;
	static short[] values;
	static short[] weights;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringBuilder sb = new StringBuilder();
		while (!(line = br.readLine()).equals("0")) {
			int w = Integer.parseInt(line);
			int n = Integer.parseInt(br.readLine());

			c++;
			value = 0;
			weight = w;
			values = new short[n];
			weights = new short[n];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				values[i] = Short.parseShort(line.substring(0,
						line.indexOf(',')));
				weights[i] = Short
						.parseShort(line.substring(line.indexOf(',') + 1));
			}
			thief(0, w, 0, 0);
			sb.append("Case " + c + ":\n");
			sb.append(value + "\n");
			sb.append(weight + "\n");
		}
		System.out.print(sb.toString());
	}

	static void thief(int p, int limit, int v, int w) {
		if (limit < 0)
			return;
		//
		if (v > value) {
			value = v;
			weight = w;
		} else if (v == value) {
			if (w < weight) {
				weight = w;
			}
		}
		if (p >= weights.length)
			return;
		//
		thief(p + 1, limit - weights[p], v + values[p], w + weights[p]);
		thief(p + 1, limit, v, w);

	}
}