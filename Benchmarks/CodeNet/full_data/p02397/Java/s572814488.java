import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3C {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		while (x == 0 && y == 0) {

			if (x >= y) {

				System.out.println(x + " " + y);
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());

			} else if (x <= y) {

				System.out.println(y + " " + x);
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());

			}

		}
	}

}