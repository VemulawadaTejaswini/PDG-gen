import java.util.*;
import java.io.*;
public class Main {
	static String[][] boards = {
			null,
			null,
			null,
			{"aab",
			"d.b",
			"dcc"},

			{"aacd",
			"bbcd",
			"cdaa",
			"cdbb"},

			{"aaccd",
			"ijj.d",
			"i..le",
			"h..le",
			"hggff"},

			{"aabee.",
			"d.b..f",
			"dcc..f",
			"f..aab",
			"f..d.b",
			".hhdcc"},

			{"aabb..a",
			".cc..ca",
			"...ddcb",
			"a.d...b",
			"acd....",
			"bc..cc.",
			"b..aabb"}
	};
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrintWriter pw = new PrintWriter(System.out);
		if(n < 3) {
			pw.println("-1");
			pw.flush();
		}
		else if(n == 3) {
			for(String s: boards[3]) {
				pw.println(s);
			}
			pw.flush();
		}
		else {
			char[][] res = new char[n][n];
			for(char[] s: res) Arrays.fill(s, '.');
			int k = 0;
			while(k + 7 < n) {
				for(int i = 0; i < 4; i++) {
					char[] s = boards[4][i].toCharArray();
					for(int j = 0; j < 4; j++) {
						res[k+i][k+j] = s[j];
					}
				}
				k += 4;
			}
			for(int i = 0; i < n-k; i++) {
				char[] s = boards[n-k][i].toCharArray();
				for(int j = 0; j < n-k; j++) {
					res[k+i][k+j] = s[j];
				}
			}
			for(char[] s: res) pw.println(s);
			pw.flush();
		}
	}
	

}
