import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			int C = Integer.parseInt(str[2]);
			int R = Integer.parseInt(str[3]);

			if (r == 0 && w == 0 && C == 0 && R == 0)
				break;

			double c = (double) r / w;
			int x = 0;

			while (c < C) {
				x++;
				c = (double) (r + x * R) / w;
			}
			System.out.println(x);
		}
	}
}
