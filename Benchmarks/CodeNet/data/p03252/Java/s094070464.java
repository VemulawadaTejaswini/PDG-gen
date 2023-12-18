import java.util.*;
import static java.lang.System.*;

public class Main {
	static List<Character> alp = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		for(char c = 'a'; c <= 'z'; c++) 
			alp.add(c);
		
		char[] newS = func(S);
		char[] newT = func(T);
		boolean flag = true;
		for(int i = 0; i < newS.length; i++) {
			if (newS[i] != newT[i]) {
				flag = false;
				break;
			}
		}
		if (flag) out.print("Yes");
		else out.println("No");
		
	}
	static char[] func(char[] str) {
		List<Character> seen = new ArrayList<>();
		int num = 0;
		char[] newStr = new char[str.length];
		for(int i = 0; i < str.length; i++) {
			char ch = str[i];
			int res = seen.indexOf(ch);
			if ( res == -1) {
				seen.add(ch);
				newStr[i] = alp.get(num);
				num++;
			} else {
				newStr[i] = alp.get(res);
			}
		}
		return newStr;
	}
}

