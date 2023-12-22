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

		String str1 = inputs.pop();
		String str2 = inputs.pop();
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		int result = 0;
		
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				result++;
			}
		}
		System.out.println(result);
	}
}
