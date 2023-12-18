import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String S = s.next();
		String T = s.next();
		char[] t = T.toCharArray();
		
		String question = "";
		for(int i = 0; i < T.length(); i++) {
			question += "\\?";
		}
		if(S.indexOf(question) > -1) {
			S = S.replace(question, T);
			S = S.replaceAll("\\?", "a");
		}
		
		int index = 0;
		int start = 0;
		String tmp;
		for(int i = 0; i < T.length(); i++) {
			while((index = S.indexOf(t[i], index)) > -1) {
				tmp = S;
				// t の1文字目があるインデックス
				if((start = index - i) < 0 || start + T.length() - 1 > S.length())
					continue;
				
				for(int j = 0; j < T.length(); j++) {
					if(j==i || S.charAt(start + j) == t[j] || S.charAt(start + j) == '?') {
						if(j==T.length() - 1) {
							tmp = tmp.substring(start, start + j + 1);
							System.out.println(S.replace(tmp, T).replaceAll("\\?", "a"));
							return;
						}
						continue;
					}
				}
			}
		}
		System.out.println("UNRESTORABLE");
    }
}