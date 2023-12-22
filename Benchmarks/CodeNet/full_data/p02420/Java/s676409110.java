import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line, str1;
		int m,h;
		while ((line = br.readLine()) != "-") {
			m = Integer.parseInt(br.readLine());
			for(int i = 0; i < m; i++) {
				h = Integer.parseInt(br.readLine());
				str1 = line.substring(0, h);
				line = line.substring(h, line.length()) + str1;
			}
			System.out.println(line);
		}
	}
}