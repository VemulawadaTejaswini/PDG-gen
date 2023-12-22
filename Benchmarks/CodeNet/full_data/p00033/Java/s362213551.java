import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		for (int i = 0 ; i < N ; i++) {
			String[] balls = br.readLine().split("\\s");
			int max1 = 0, max2 = 0;
			boolean isFault = false;
			for (int j = 0 ; j < 10 ; j++) {
				int num = Integer.parseInt(balls[j]);
				if (num > max1) max1 = num;
				else if (num > max2) max2 = num;
				else isFault = true;
			}
			if (isFault) System.out.println("NO"); else System.out.println("YES");
		}

	}
}