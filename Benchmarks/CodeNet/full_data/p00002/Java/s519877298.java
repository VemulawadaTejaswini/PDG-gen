import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int dataNum = 0;
		while (true) {
			String input = br.readLine();
			if (input == null || "".equals(input)) break;

			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);

			if (dataNum > 200) break;
			if ((a == 0) && (b == 0)) break;
			if (!((a >= 0 && a <= 1000000) && (b >= 0 && b <= 1000000))) break;

			System.out.println(String.valueOf(a + b).length());
			dataNum++;
		}
	}
}