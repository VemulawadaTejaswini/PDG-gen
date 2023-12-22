import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int sum = 0;

		while ((line = br.readLine()) != null) {
			char c;
			for (int i = 0; i < line.length(); i++) {
				c = line.charAt(i);
				// 負数読み飛ばし
				if (c == '-') {
					do {
						c = line.charAt(++i);
					} while (c >= '0' && c <= '9');
				}
				if (c >= '0' && c <= '9') {
					int sta, end;
					sta = i;
					while (c >= '0' && c <= '9') {
						c = line.charAt(++i);
					}
					// 小数読み飛ばし
					if (c == '.') {
						c = line.charAt(++i);
						if (c >= '0' && c <= '9') {
							do {
								c = line.charAt(++i);
							} while (c >= '0' && c <= '9');
						}
					} else {
						end = i;
						sum += Integer.parseInt(line.substring(sta, end));
					}
				}
			}
		}
		System.out.println(sum);
	}
}