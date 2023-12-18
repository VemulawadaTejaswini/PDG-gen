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
		String s = tmp[1];
		System.out.println("A" + s.substring(0, 1) + "C");

	}
}
