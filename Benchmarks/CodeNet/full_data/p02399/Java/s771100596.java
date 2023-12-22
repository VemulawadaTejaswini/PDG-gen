import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		String a = tmp[0];
		String b = tmp[1];
		long d = Long.parseLong(a) / Long.parseLong(b);
		long r = Long.parseLong(a) % Long.parseLong(b);
		double f = Double.parseDouble(a) / Double.parseDouble(b);
		System.out.printf("%d %d %.5f", d, r, f);
	}
}