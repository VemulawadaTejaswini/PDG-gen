import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		int q = Integer.parseInt(str[2]);

		int people[] = new int[n];
		Arrays.fill(people, k);

		for (int i = 0; i < q; i++) {
			int id = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				if (j != (id - 1)) {
					people[j]--;
				}
			}
		}
		for (int j = 0; j < n; j++) {
			if (people[j] <= 0)
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}
}