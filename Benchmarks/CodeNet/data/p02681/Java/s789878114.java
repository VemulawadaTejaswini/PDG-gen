import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");
		String str2[] = br.readLine().split("");

		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals(str2[i])) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
