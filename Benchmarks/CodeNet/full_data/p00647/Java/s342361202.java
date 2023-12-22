import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.text.ParseException;

/**
 * Problem A: It's our delight!!
 */
public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		MessageFormat msg = new MessageFormat(
				"{0,number,integer}:{1,number,integer} {2,number,integer}");

		StringBuilder sb = new StringBuilder();

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			int[][] receipt = new int[3][2];
			int h, m1, m2, d, t;
			for (int i = 0; i < n; i++) {
				Object[] o = msg.parse(br.readLine());
				h = Integer.parseInt(o[0].toString());
				m1 = Integer.parseInt(o[1].toString());
				m2 = Integer.parseInt(o[2].toString());
				d = m2 >= m1 ? m2 - m1 : m2 + 60 - m1;
				if (h > 20 || h < 2) {
					t = 2;
				} else if (h > 17) {
					t = 1;
				} else {
					t = 0;
				}
				receipt[t][0]++;
				if (d < 9) {
					receipt[t][1]++;
				}
			}
			sb.append("lunch ");
			if (receipt[0][0] > 0) {
				sb.append(receipt[0][1] * 100 / receipt[0][0]);
				sb.append('\n');
			} else {
				sb.append("no guest\n");
			}
			sb.append("dinner ");
			if (receipt[1][0] > 0) {
				sb.append(receipt[1][1] * 100 / receipt[1][0]);
				sb.append('\n');
			} else {
				sb.append("no guest\n");
			}
			sb.append("midnight ");
			if (receipt[2][0] > 0) {
				sb.append(receipt[2][1] * 100 / receipt[2][0]);
				sb.append('\n');
			} else {
				sb.append("no guest\n");
			}
			System.out.print(sb.toString());
		}
	}
}