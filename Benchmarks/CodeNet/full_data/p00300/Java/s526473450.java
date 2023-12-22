import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Yuekis' Audio Room
 */
public class Main {

	public static int R = 100;
	public static int T = 30;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		br.readLine(); //skip first line.

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int r = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int t = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			int[] _r = new int[2];
			int[] _t = new int[2];

			if (r % R == 0) {
				_r[0] = r / R;
			} else {
				_r[0] = r / R;
				_r[1] = r / R + 1;
			}

			if (t % T == 0) {
				_t[0] = t / T * 5;
			} else {
				_t[0] = t / T * 5;
				_t[1] = (t / T + 1) * 5;
			}

			int[] _rt = new int[4];
			_rt[0] = _r[0] + _t[0];
			_rt[1] = _t[1] > 0 ? _r[0] + _t[1] : 0;
			_rt[2] = _r[1] > 0 ? _r[1] + _t[0] : 0;
			_rt[3] = _r[1] > 0 && _t[1] > 0 ? _r[1] + _t[1] : 0;

			Arrays.sort(_rt);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 4; i++) {
				if (_rt[i] > 0) {
					if (i > 0 && _rt[i - 1] > 0) {
						sb.append(" ");
					}
					sb.append(_rt[i]);
				}
			}
			System.out.println(sb);

		} // end while
	} // end main
}