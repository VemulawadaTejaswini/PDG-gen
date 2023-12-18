import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		str = br.readLine().split("");

		int tsu = 0;

		for (int i = 0; i < n - 1; i++) {
			if (!str[i].equals(str[i + 1])) {
				tsu++;
			}
		}
		System.out.println(n - 1 - Math.max(tsu - k * 2, 0));
	}
}