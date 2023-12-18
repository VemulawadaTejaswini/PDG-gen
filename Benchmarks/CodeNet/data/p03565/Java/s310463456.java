import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	char[] S, T;
	boolean enable = false;

	Main(BufferedReader in) throws IOException {
		S = in.readLine().toCharArray();
		T = in.readLine().toCharArray();
	}

	boolean isMatch(char[] s, char[] t) {
		boolean isMatch = true;
		for (int i = 0; i < s.length; ++i) {
			if (s[i] != '?' && s[i] != t[i]) {
				isMatch = false;
				break;
			}
		}
		return isMatch;
	}

	void calc() {
		for (int i = S.length - T.length; i >= 0; --i) {
			if (enable) {
				if (S[i] == '?') {
					S[i] = 'a';
				}
			} else {
				if (S[i] == '?' || S[i] == T[0]) {
					enable = isMatch(Arrays.copyOfRange(S, i, i + T.length), T);
					if (enable) {
						// 置き換え
						for (int j = 0; j < T.length; ++j) {
							S[i + j] = T[j];
						}
					}
				}
			}
		}
	}

	void showResult() {
		if (enable) {
			for (int i = 0; i < S.length; ++i) {
				System.out.print(S[i]);
			}
			System.out.println("");
		} else {
			System.out.println("UNRESTORABLE");
		}
	}
}