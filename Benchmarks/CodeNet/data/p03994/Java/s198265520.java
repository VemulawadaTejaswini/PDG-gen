
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	// aにできるまで最初からステップ，あとは最後のものを最後まで回す
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.valueOf(br.readLine());
		int index = 0;
		String substr1, substr2;
		while (index < str.length() - 2) {
			if (num > counttoa(str.charAt(index))) {
				num = num - counttoa(str.charAt(index));
				substr1 = str.substring(0, index);
				substr2 = str.substring(index + 1);
				str = substr1 + "a" + substr2;
			}
			index++;
		}

		// 最後の文字を変換
		str = str.substring(0, str.length() - 1) + stepChr(str.charAt(str.length() - 1), num);
		System.out.println(str);

	}

	private static char stepChr(char input, int num) {
		int realNum = num % 26;
		char result = input;
		for (int i = 0; i < realNum; i++) {
			result = nextChr(result);
		}
		return result;
	}

	private static char nextChr(char input) {
		if (input == 'z') {
			return 'a';
		} else
			return (char) ((int) input + 1);

	}

	private static int counttoa(char input) {
		if (input == 'a') {
			return 0;
		}
		return 26 - ((int) input - (int) 'a');
	}

}
