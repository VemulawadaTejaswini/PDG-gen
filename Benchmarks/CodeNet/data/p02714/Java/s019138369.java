import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		long R = 0;
		long G = 0;
		long B = 0;

		for (int i = 0; i < n; i++) {
			if (str[i].equals("R")) {
				R++;
			} else if (str[i].equals("G")) {
				G++;
			} else {
				B++;
			}
		}
		long no = 0;

		for (int i = 0; i < n - 2; i++) {
			String first = str[i];

			for (int j = i + 1; j < n - 1; j++) {
				if (str[j].equals(first)) {
					continue;
				}
				String second = str[j];
				int k = j + j - i;

				if (k < n && !str[k].equals(first) && !str[k].equals(second)) {
					no++;
				}
			}
		}

		long ans = R * G * B - no;
		System.out.println(ans);
	}
}