import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] wordstr = str.split(" ", 0);
			int shift = Search(wordstr);
			Print(shift, wordstr);
			str = br.readLine();
		}
	}

	private static int Search(String[] words) {
		for (int i = 0; i < words.length; i++) {
			Boolean isFinal = i == words.length - 1;
			if (((words.length == 1 || !isFinal) && words[i].length() == 3)
					|| ((words.length == 1 || isFinal) && words[i].length() == 4)) {
				char[] ch = words[i].toCharArray();
				for (int k = 0; k < 26; k++) {
					int a = 97 + ((ch[0] - 97 + k) % 26);
					int b = 97 + ((ch[1] - 97 + k) % 26);
					int c = 97 + ((ch[2] - 97 + k) % 26);
					if (a == 116 && b == 104 && c == 101) {
						return k;
					}
				}
			} else if (((words.length == 1 || !isFinal) && words[i].length() == 4)
					|| ((words.length == 1 || isFinal) && words[i].length() == 5)) {
				char[] ch = words[i].toCharArray();
				for (int k = 0; k < 26; k++) {
					int a = 97 + ((ch[0] - 97 + k) % 26);
					int b = 97 + ((ch[1] - 97 + k) % 26);
					int c = 97 + ((ch[2] - 97 + k) % 26);
					int d = 97 + ((ch[3] - 97 + k) % 26);
					if ((a == 116 && b == 104 && c == 105 && d == 115)
							|| (a == 116 && b == 104 && c == 97 && d == 116)) {
						return k;
					}
				}
			}
		}
		return 0;
	}

	private static void Print(int n, String[] words) {
		for (int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (i == words.length - 1 && j == words[i].length() - 1
						&& ch[j] == 46) {
					System.out.print(".");
				} else {
					System.out.print((char) (97 + ((ch[j] - 97 + n) % 26)));
				}
			}
			if (i != words.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}