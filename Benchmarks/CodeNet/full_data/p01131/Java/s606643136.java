import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split("");
			StringBuilder sb = new StringBuilder();

			int count = 0;
			for (int j = 0; j < str.length; j++) {
				String s = str[j];
				if (s.equals("0")) {
					if (j - 1 < 0) {
						if (!str[j].equals("0"))
							sb.append(getStr(str[j], count));
					} else {
						if (!str[j - 1].equals("0"))
							sb.append(getStr(str[j - 1], count));
					}
					count = 0;
				} else {
					count++;
				}
			}
			System.out.println(sb);
		}
	}

	static char getStr(String s, int count) {
		switch (Integer.parseInt(s)) {
		case 1:
			switch (count % 5) {
			case 1:
				return '.';
			case 2:
				return ',';
			case 3:
				return '!';
			case 4:
				return '?';
			case 0:
				return ' ';
			}
			break;
		case 2:
			switch (count % 3) {
			case 1:
				return 'a';
			case 2:
				return 'b';
			case 0:
				return 'c';
			}
			break;
		case 3:
			switch (count % 3) {
			case 1:
				return 'd';
			case 2:
				return 'e';
			case 0:
				return 'f';
			}
			break;
		case 4:
			switch (count % 3) {
			case 1:
				return 'g';
			case 2:
				return 'h';
			case 0:
				return 'i';
			}
			break;
		case 5:
			switch (count % 3) {
			case 1:
				return 'j';
			case 2:
				return 'k';
			case 0:
				return 'l';
			}
			break;
		case 6:
			switch (count % 3) {
			case 1:
				return 'm';
			case 2:
				return 'n';
			case 0:
				return 'o';
			}
			break;
		case 7:
			switch (count % 4) {
			case 1:
				return 'p';
			case 2:
				return 'q';
			case 3:
				return 'r';
			case 0:
				return 's';
			}
			break;
		case 8:
			switch (count % 3) {
			case 1:
				return 't';
			case 2:
				return 'u';
			case 0:
				return 'v';
			}
			break;
		case 9:
			switch (count % 4) {
			case 1:
				return 'w';
			case 2:
				return 'x';
			case 3:
				return 'y';
			case 0:
				return 'z';
			}
			break;
		}
		return '0';
	}
}
