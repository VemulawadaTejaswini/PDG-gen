import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		line = br.readLine();
		int n = parseInt(line.substring(0, line.indexOf(' ')));
		int t = parseInt(line.substring(line.indexOf(' ') + 1));

		List<String> stations = new ArrayList<String>();
		int[] opens = new int[n - 1];

		for (int i = 0; i < n; i++) {
			String[] tokens = br.readLine().split(" ");
			stations.add(tokens[3]);
			int arrive = minutes(tokens[2]);
			int leave = minutes(tokens[0]);
			if (i < n - 1) {
				opens[i] = arrive;
			}
			if (i > 0) {
				opens[i - 1] = leave - opens[i - 1];
			}
		}

		int c = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n - 1; i++) {
			if (opens[i] >= t) {
				c++;
				sb.append(stations.get(i) + " " + opens[i] + "\n");
			}
		}
		System.out.println(c);
		System.out.print(sb.toString());
	} //end main

	static int minutes(String time) {
		int h = parseInt(time.substring(0, time.indexOf(':')));
		int m = parseInt(time.substring(time.indexOf(':') + 1));
		return h * 60 + m;
	}
}