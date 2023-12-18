import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		int q = Integer.parseInt(r.readLine());

		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < q; ++i) {
			String[] qs = r.readLine().split(" ");

			if (qs.length == 1) {
				sb.reverse();
			} else {
				int f = Integer.parseInt(qs[1]);
				String c = qs[2];

				if (f == 1) {
					sb.insert(0, c);
				} else {
					sb.append(c);
				}
			}
		}

		System.out.println(sb.toString());

		r.close();
	}
}