import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {

		Scanner sc = new Scanner(System.in);

		String st = sc.next();

		int l = st.length();

		byte[] st_b = st.getBytes();
		Arrays.sort(st_b);
		int i = 0;
		boolean isTasai = true;

		for (i = 0; i < l; i++) {
			byte b = st_b[i];
			for (int n = i + 1; n < l - i; n++) {
				if (b == st_b[n]) {
					isTasai = false;
					break;
				}
			}

		}

		if (isTasai) {

			if (l != 26) {
				byte[] min = new byte[1];
				min[0] = (byte) (st_b[0] + (byte) 1);

				for (i = 1; i < l; i++) {
					if (min[0] == st_b[i]) {
						min[0]++;
					} else {
						break;
					}
				}
				String stmin = new String(min, "UTF-8");
				System.out.println(st + stmin);
			} else {
				// xでくぎる。
				String[] st_nox = st.split("z");
				if (!st_nox[0].equals("")) {
					int ln = st_nox[0].length();
					char min = st_nox[0].charAt(ln - 1);
					char n_min = (char) (min + (char) 1);
					System.out.println(st_nox[0].replace(min, n_min));
				} else {
					System.out.println("-1");
				}

			}
		} else {
			System.out.println("-1");
		}

		sc.close();

	}
}
