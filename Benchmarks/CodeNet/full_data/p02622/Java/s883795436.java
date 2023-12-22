import java.util.*;

import javax.lang.model.util.ElementScanner6;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int count = 0;

		for(int i = 0; i < S.length(); i ++){
			char s = S.charAt(i);
			char t = T.charAt(i);
			if(s != t)
			count ++;
		}
		System.out.println(count);

	}
}