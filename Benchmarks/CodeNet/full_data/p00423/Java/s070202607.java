import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringTokenizer st;
		int n, a, b, suma, sumb;
		n = a = b = suma = sumb = 0;

		while (!(line = br.readLine()).equals("0")) {
			st = new StringTokenizer(line);
			if (st.countTokens() == 1) {
				n = Integer.parseInt(st.nextToken());
				suma = sumb = 0;
			} else {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				if (a > b) {
					suma += (a + b);
				} else if (a == b) {
					suma += a;
					sumb += b;
				} else {
					sumb += (a + b);
				}
				n--;
				if (n == 0)
					System.out.println(suma + " " + sumb);
			}
		}
	}
}