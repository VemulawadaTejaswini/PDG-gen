import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}

		int p[] = new int[m];
		int y[] = new int[m];

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			p[i] = Integer.parseInt(str[0]);
			y[i] = Integer.parseInt(str[1]);

			list.get(p[i] - 1).add(y[i]);
		}

		for (int i = 0; i < n; i++) {
			Collections.sort(list.get(i));
		}

		for (int i = 0; i < m; i++) {
			String s = "";
			int front = p[i];
			int back = list.get(p[i] - 1).indexOf(y[i]) + 1;

			if (front < 10) {
				s = "00000" + front;
			} else if (front < 100) {
				s = "0000" + front;
			} else if (front < 1000) {
				s = "000" + front;
			} else if (front < 10000) {
				s = "00" + front;
			} else if (front < 100000) {
				s = "0" + front;
			} else if (front == 100000) {
				s = "" + front;
			}

			if (back < 10) {
				s += "00000" + back;
			} else if (back < 100) {
				s += "0000" + back;
			} else if (back < 1000) {
				s += "000" + back;
			} else if (back < 10000) {
				s += "00" + back;
			} else if (back < 100000) {
				s += "0" + back;
			} else if (back == 100000) {
				s += "" + back;
			}

			System.out.println(s);
		}
	}
}
