import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("7")) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}
}