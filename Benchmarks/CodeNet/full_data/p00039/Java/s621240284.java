import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		for (String str; (str = br.readLine()) != null; ) {
			char[] roman = str.toCharArray();
			System.out.println(calc(roman));
		}
	}

	public static int calc(char[] roman) {
		int len = roman.length;
		int[] arab = new int[len];
		for (int i = 0; i < len; i++) {
			switch (roman[i]) {
			case 'I':
				arab[i] = 1;
				break;
			case 'V':
				arab[i] = 5;
				break;
			case 'X':
				arab[i] = 10;
				break;
			case 'L':
				arab[i] = 50;
				break;
			case 'C':
				arab[i] = 100;
				break;
			case 'D':
				arab[i] = 500;
				break;
			case 'M':
				arab[i] = 1000;
				break;
			}
		}

		int ret = 0; // return
		for (int i=0; i <= len-2; i++) {
			if (arab[i] < arab[i+1]) {
				ret -= arab[i];
			} else {
				ret += arab[i];
			}
		}
		ret += arab[len-1];
		return ret;
	}
}