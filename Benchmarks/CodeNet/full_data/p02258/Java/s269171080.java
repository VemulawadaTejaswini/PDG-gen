import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int minv = 0;
		int maxv = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			if (i == 0) {
				minv = input;
				continue;
			}
			maxv = maxv < (input - minv) ? (input - minv) : maxv;
			minv = minv > input ? input : minv;
		}
		System.out.println(maxv);
	}
}