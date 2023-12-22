import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		int p[] = new int[n];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(p);

		int min = 0;

		for (int i = 0; i < k; i++) {
			min += p[i];
		}

		System.out.println(min);
	}
}