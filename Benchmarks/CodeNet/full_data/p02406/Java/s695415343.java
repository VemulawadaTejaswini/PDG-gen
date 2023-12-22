import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				sb.append(" ").append(i);
				continue;
			}
			int flg = 1;
			int tmp = i;
			while (flg == 1) {
				flg = 0;
				if (i % 10 == 3) {
					sb.append(" ").append(i);
					i /= 10;
					flg = 1;
				}
			}
			i = tmp;
		}
		System.out.print(sb);
	}
}