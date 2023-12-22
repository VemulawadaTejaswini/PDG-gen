/*
 * Walking in the Hospital
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {

			int n, p, d;
			n = Integer.parseInt(line);
			p = 0;
			d = -1;
			for (int i = 0; i < n; i++) {
				int _p, _d;
				StringTokenizer st = new StringTokenizer(br.readLine());
				_p = Integer.parseInt(st.nextToken());
				_d = Integer.parseInt(st.nextToken())
						+ Integer.parseInt(st.nextToken());
				if (_d > d) {
					p = _p;
					d = _d;
				}
			}
			System.out.println(p + " " + d);
		}

	}

}