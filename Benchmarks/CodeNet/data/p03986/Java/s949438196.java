import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		long rightT = 0;
		long leftS = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("S")) {
				leftS = i;
				break;
			}
		}

		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i].equals("T")) {
				rightT = i;
				break;
			}
		}

		long s = 0;
		long t = 0;

		for (int i = 0; i < rightT; i++) {
			if (str[i].equals("S")) {
				s++;
			}
		}

		for (int i = str.length - 1; i > leftS; i--) {
			if (str[i].equals("T")) {
				t++;
			}
		}

		long min = Math.min(s, t);

		System.out.println(str.length - min * 2);

	}
}
