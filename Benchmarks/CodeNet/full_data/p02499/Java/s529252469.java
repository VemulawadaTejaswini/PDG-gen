import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String[] ch = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		String[] CH = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "n", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };
		int[] con = new int[24];
		Pattern p, P;
		Matcher m, M;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str;
			try {
				str = sc.readLine();
				if(str==null){
					break;
				}
				for (int i = 0; i < 24; i++) {
					p = Pattern.compile(ch[i]);
					P = Pattern.compile(CH[i]);
					m = p.matcher(str);
					M = P.matcher(str);
					while (true) {
						if (m.find() || M.find()) {
							con[i]++;
						} else {
							break;
						}
					}
				}
			
			for (int i = 0; i < 24; i++) {
				System.out.println(ch[i] + " : " + con[i]);
			}
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
		}

	}
}