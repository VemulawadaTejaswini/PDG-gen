import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		// 単一行の入力
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] tmp = str.split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		int c = Integer.parseInt(tmp[2]);

		if ((a + b) == c || a == (b + c) || b == (a + c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
