import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0;
		int x = 0;
		while (true) {
			String[] str = (br.readLine()).split(" ");
			n = Integer.parseInt(str[0]);
			x = Integer.parseInt(str[1]);
			if (n == 0 && x == 0) {
				break;
			}
			int count = 0;
			for (int i = 1; i <= n - 2; i++) {
				for (int j = i + 1; j <= n - 1; j++) {
					for (int k = j + 1; k <= n; k++) {
						if (i + j + k == x) {
							count++;
						}
					}
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}