import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

		// 結果出力1234
		int result = 0;
		Map<String, Boolean> map = new HashMap<>();

		// 入力取得
		String s = inputs.pop();
		for (int i = 0; i < s.length() - 3; i++) {
			for (int j = i + 4; j < s.length() + 1; j++) {
				String subbedStrNum = s.substring(i, j);
				if (map.containsKey(subbedStrNum)) {
					if (map.get(subbedStrNum).booleanValue() == true)
						result++;
					continue;
				}
				boolean chk = false;
				double num = Double.parseDouble(subbedStrNum);
				if (num % 2019 == 0) {
					result++;
					chk = true;
				}
				map.put(subbedStrNum, chk);
			}
		}

		System.out.println(result);
	}
}
