import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Listに標準入力の値を取得
		ArrayDeque<String> inputs = new ArrayDeque<>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while (br.ready()) {
				String[] lineArray = br.readLine().split(" ");
				Arrays.<String> stream(lineArray).forEach(s -> inputs.add(s.trim()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 結果出力
		int result = 0;

		// 入力取得
		String s = inputs.pop();
		for (int i = 0; i < s.length() - 3; i++) {
			for (int j = i + 4; j < s.length() + 1; j++) {
				double num = Double.parseDouble(s.substring(i, j));
				if (num % 2019 == 0) result++;
			}
		}

		System.out.println(result);
	}
}
