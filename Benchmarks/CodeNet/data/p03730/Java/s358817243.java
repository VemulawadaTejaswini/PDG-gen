import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);

		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				if (a * i == b * j + c) {
					System.out.println("YES");
					return;
				}
			}
		}

		System.out.println("NO");
	}
}