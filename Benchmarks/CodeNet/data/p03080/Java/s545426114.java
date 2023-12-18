import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String[] rb = reader.readLine().split("");
		int r_count = 0;
		for (int i = 0; i < N; i++) {
			if (rb[i].equals("R")) {
				r_count++;
			}
		}
		int b_count = N - r_count;
		if (r_count > b_count) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}