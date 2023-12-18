import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		int blue = 0;
		int red = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("0"))
				red++;
			else
				blue++;
		}

		if (blue == 0 || red == 0) {
			System.out.println("0");
		} else {
			int min = Math.min(blue, red);
			System.out.println(min * 2);
		}
	}
}
