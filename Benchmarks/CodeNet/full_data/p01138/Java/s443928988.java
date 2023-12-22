import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;
import static java.lang.Byte.parseByte;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			byte[][] table = new byte[n * 2][2];
			for (int i = 0; i < table.length; i += 2) {
				line = br.readLine();
				String[] start = line.substring(0, line.indexOf(' ')).split(":");
				String[] arrive = line.substring(line.indexOf(' ') + 1).split(":");
				table[i][0] = parseByte(start[0]);
				table[i][1] = parseByte(start[1]);
				table[i][2] = parseByte(start[2]);
				table[i][3] = 1;
				table[i + 1][0] = parseByte(arrive[0]);
				table[i + 1][1] = parseByte(arrive[1]);
				table[i + 1][2] = parseByte(arrive[2]);
				table[i + 1][3] = -1;
			}
			Arrays.sort(table, new Comparator<byte[]>() {
				@Override
				public int compare(byte[] o1, byte[] o2) {
					if (o1[0] != o2[0]) {
						return o1[0] - o2[0];
					} else if (o1[1] != o2[1]) {
						return o1[1] - o2[1];
					} else if (o1[2] != o2[2]) {
						return o1[2] - o2[2];
					} else {
						return o2[3] - o1[3];
					}
				}
			});
			int peak = 0, inuse = 0;
			for (int i = 0; i < table.length; i++) {
				inuse += table[i][3];
				if (peak < inuse) {
					peak = inuse;
				}
			}
			System.out.println(peak);
		}
	}
}