import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static List<String> values = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] l1 = r.readLine().split(" ");

		int n = Integer.parseInt(l1[0]);
		int m = Integer.parseInt(l1[1]);

		int[] num = new int[n];
		boolean err = false;

		for (int i = 0; i < m; ++i) {
			String[] v = r.readLine().split(" ");
			int s = Integer.parseInt(v[0]);
			int c = Integer.parseInt(v[1]);

			if (num[s - 1] != 0 && num[s - 1] != c) {
				err = true;
			}
			if (s == 1 && c == 0) {
				err = true;
			}

			num[s - 1] = c;
		}

		if (err) {
			System.out.println(-1);
		} else {

			if (num[0] == 0) {
				num[0] = 1;
			}

			StringBuilder sb = new StringBuilder();
			for (int ns : num) {
				sb.append(ns);
			}
			System.out.println(sb.toString());
		}

		r.close();
	}
}