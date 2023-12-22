import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			if (x == 0 && y == 0)
				break;
			if (x <= y) {
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
		}
	}

}

