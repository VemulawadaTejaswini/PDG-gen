import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String str[] = s.split("");
		BIT bit = new BIT(str.length + 1);
		ArrayList<Long> list = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {
			bit.add(i, Integer.parseInt(str[i]));
		}

		for (int i = 0; i <= str.length; i++) {
			for (int j = i + 1; j <= str.length; j++) {
				long a = bit.sum(i, j);
				if (a % 3 == 0) {
					list.add(Long.parseLong(s.substring(i, j)));
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2019 == 0) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}

class BIT {
	int[] dat;

	public BIT(int n) {
		dat = new int[n + 1];
	}

	public void add(int k, int a) { // k : 0-indexed
		for (int i = k + 1; i < dat.length; i += i & -i) {
			dat[i] += a;
		}
	}

	public int sum(int s, int t) { // [s, t)
		if (s > 0)
			return sum(0, t) - sum(0, s);

		int ret = 0;
		for (int i = t; i > 0; i -= i & -i) {
			ret += dat[i];
		}
		return ret;
	}
}
