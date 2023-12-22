import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String[] ch = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z","." };
		String[] CH = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z","." };
		int[] con = new int[27];
		Pattern p, P;
		Matcher m, M;
		int longcounter =0;
		boolean jud = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				while (true) {
			String str;
			try {
				str = br.readLine();
				
				longcounter += str.length();
				if(longcounter>=1200){
					break;
				}
				for (int i = 0; i < 27; i++) {
					p = Pattern.compile(ch[i]);
					P = Pattern.compile(CH[i]);
					m = p.matcher(str);
					M = P.matcher(str);
					while (true) {
						if (m.find() || M.find()) {
						if(i==26){
							jud = false;
						}
							con[i]++;
						} else {
							break;
						}
					}
				}
			
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			if(jud==false){
				break;
			}
	 }
				if(longcounter<1200){
					for (int i = 0; i < 26; i++) {
						System.out.println(ch[i] + " : " + con[i]);
					}
					}
	}
}