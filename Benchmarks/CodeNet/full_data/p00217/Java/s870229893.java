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

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) {
				break;
			}

			int n, d;
			String p;
			n = Integer.parseInt(line);
			p = "";
			d = -1;
			for (int i = 0; i < n; i++) {
				String _p;
				int _d;
				StringTokenizer st = new StringTokenizer(br.readLine());
				_p = st.nextToken();
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