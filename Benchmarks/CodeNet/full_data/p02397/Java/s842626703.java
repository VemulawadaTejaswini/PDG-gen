import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (;;) {

			int i = Integer.parseInt(br.readLine());
			int j = Integer.parseInt(br.readLine());
			if (i == 0 && j == 0) {
				break;
			}
			System.out.printf("%d %d\n", Math.min(i, j), Math.max(i, j));
		}
	}
}