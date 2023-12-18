import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		int num = Integer.valueOf(s);

		while (true) {
			boolean flag = isSosu(num);
			if (flag) {
				System.out.println(num);
				r.close();
				return;
			}
			++num;
		}
	}

	public static boolean isSosu(int value) {
		for (int i = 2; i < value; ++i) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}