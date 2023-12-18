import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			String str[] = br.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				c[i][j] = Integer.parseInt(str[j]);
			}
		}

		for (int i = 0; i < 3; i++) {
			int s = c[(i + 1) % 3][0] - c[i][0];
			int t = c[(i + 1) % 3][1] - c[i][1];
			int u = c[(i + 1) % 3][2] - c[i][2];

			if (s != t || t != u || u != s) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
