import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int x = Integer.parseInt(sa[0]);
		int y = Integer.parseInt(sa[1]);
		br.close();

		int a = y - x;
		if (a < 0) {
			a = Integer.MAX_VALUE;
		}
		int b = Math.abs(Math.abs(x) - Math.abs(y));
		if (x < 0) {
			if (y <= 0) {
				b += 2;
			} else {
				b++;
			}
		} else {
			if (y <= 0) {
				b++;
			} else {
				b += 2;
			}
		}
		System.out.println(Math.min(a, b));
	}
}
