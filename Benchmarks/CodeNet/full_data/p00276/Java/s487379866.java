import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int q = Integer.parseInt(line);
			//
			for (int i = 0; i < q; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				int a = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());

				//
				int count = 0;
				while (true) {
					if (c > 0 && a > 0 && n > 0) {
						c--;
						a--;
						n--;
						count++;
					} else if (c > 1 && a > 0) {
						c -= 2;
						a--;
						count++;
					} else if (c > 2) {
						c -= 3;
						count++;
					} else {
						break;
					}
				}
				System.out.println(count);
			}
		}
	}
}