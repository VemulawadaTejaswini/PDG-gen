import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int h = Integer.parseInt(str[2]);
		int m = Integer.parseInt(str[3]);

		int mk = (m * 360) / 60;
		int hk = (h * 60 + m) * 360 / (12 * 60);

		int sita = 0;
		if (mk > hk) {
			sita = mk - hk;
		} else {
			sita = hk - mk;
		}
		double cos = Math.cos(Math.toRadians(sita));

		double naiseki = a * b * cos;
		double ans = a * a - 2 * naiseki + b * b;
		
		System.out.println(Math.sqrt(ans));
	}
}
