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
				if (qs[1].equals("1")) {
					sb.insert(0, qs[2]);
				} else {
					sb.append(qs[2]);
				}
			}
		}

		System.out.println(sb.toString());

		r.close();
	}
}