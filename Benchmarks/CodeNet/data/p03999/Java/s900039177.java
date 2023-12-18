import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long ans = 0;
		for(int i = 0; i < 1 << (S.length()-1); i++) {
			String T = "";
			for(int j = 0; j < S.length()-1; j++) {	
				T += S.charAt(j);
				if((1 & i >> j) == 1)
					T += "/+";
			}
			T += S.charAt(S.length()-1);
			String[] t = T.split("/+");
			for(int k = 0; k < t.length; k++)
				ans += Long.parseLong(t[k]);
		}
		System.out.println(ans);
	}

}