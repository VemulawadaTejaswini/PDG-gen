import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String[] box = buff.readLine().split(" ");
		long N = Long.parseLong(box[0]);
		long Y = Long.parseLong(box[1]);
		boolean flag = true;
		for (int i = 0; i <= N; ++i) {
			for (int j = 0; j <= N - i; ++j) {
				long tmp = 10000 * i + 5000 * j + 1000 * (N - i - j);
				if (Y == tmp) {
					flag = false;
					System.out.println(i + " " + j + " " + (N - i - j));
					break;
				}
			}
			if (flag == false) {
				break;
			}
		}
		if (flag) {
			System.out.println("-1 -1 -1");
		}
	}

	static long f() {
		long ans = 0;

		return ans;
	}
}