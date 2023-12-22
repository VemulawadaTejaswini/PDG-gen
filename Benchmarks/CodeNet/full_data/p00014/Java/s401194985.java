import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			int dx = Integer.parseInt(str);
			long s = 0;
			for (int i = 1; i < 600 / dx; i++) {
				s = s + dx * i * i * dx * dx;
			}
			System.out.println(s);
			str = br.readLine();
		}
	}
}