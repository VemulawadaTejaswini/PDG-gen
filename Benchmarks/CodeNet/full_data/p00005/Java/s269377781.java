import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static long numlong[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String numstr[] = str.split(" ", 0);
			numlong = new long[2];
			numlong[0] = Long.parseLong(numstr[0]);
			numlong[1] = Long.parseLong(numstr[1]);
			long gcm = Euclid();
			long lcm = numlong[0] * numlong[1] / gcm;
			System.out.println(gcm + " " + lcm);
			str = br.readLine();
		}
	}

	public static long Euclid() {
		long x = numlong[0];
		long y = numlong[1];
		while (x != y) {
			if (x < y) {
				y = y - x;
			} else {
				x = x - y;
			}
		}
		return x;
	}
}