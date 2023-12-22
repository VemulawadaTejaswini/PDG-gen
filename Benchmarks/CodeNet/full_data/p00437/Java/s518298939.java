import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		short total = 0, n;
		ResultSet resultSet = null;

		while (!(line = br.readLine()).equals("0 0 0")) {

			total += Short.parseShort(line.split(" ")[0]);
			total += Short.parseShort(line.split(" ")[1]);
			total += Short.parseShort(line.split(" ")[2]);
			resultSet = main.new ResultSet(total);

			n = Short.parseShort(br.readLine());
			for (int i = 0; i < n; i++) {
				resultSet.add(br.readLine());
			}
			resultSet.checkAll();
		}
		System.out.print(resultSet.toString());
	}

	class ResultSet {

		byte[] parts;
		ArrayList<Result> results;
		short unkowns;

		ResultSet(short total) {
			this.parts = new byte[total + 1];
			Arrays.fill(parts, (byte) 2);
			unkowns = total;
			results = new ArrayList<Result>();
		}

		void add(String result) {
			results.add(new Result(result));
			results.get(results.size() - 1).check();
		}

		void checkAll() {
			while (true) {
				short last = unkowns;
				for (Result r : results) {
					if (r.hasUnkown())
						r.check();
				}
				if (last == unkowns)
					break;
			}
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			for (short i = 1; i < parts.length; i++) {
				sb.append(parts[i] + "\n");
			}
			return sb.toString();
		}

		class Result {

			short a, b, c;
			byte r;

			public Result(String result) {
				StringTokenizer st = new StringTokenizer(result);
				a = Short.parseShort(st.nextToken());
				b = Short.parseShort(st.nextToken());
				c = Short.parseShort(st.nextToken());
				r = Byte.parseByte(st.nextToken());
			}

			void check() {
				if (r == 1) {
					parts[a] = parts[b] = parts[c] = 1;
					unkowns -= 3;
				} else {
					if (parts[a] == 1 && parts[b] == 1) {
						parts[c] = 0;
						unkowns--;
					} else if (parts[b] == 1 && parts[c] == 1) {
						parts[a] = 0;
						unkowns--;
					} else if (parts[c] == 1 && parts[a] == 1) {
						parts[b] = 0;
						unkowns--;
					}
				}
			}

			boolean hasUnkown() {
				boolean result = false;
				if (r == 0) {
					if (parts[a] == 2 || parts[b] == 2 || parts[c] == 2) {
						result = true;
					}
				}
				return result;
			}
		}
	}
}