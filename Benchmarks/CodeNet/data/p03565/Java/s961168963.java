import java.util.Scanner;
import java.util.TreeSet;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next(), T = sc.next();
		TreeSet<String> ans = new TreeSet<String>();

		for(int i = 0; i + T.length() <= S.length(); i++) {
			// (i, i + T) をかんがえる
			boolean CANMAKE = true;  // kawaii ha tsukureru
			for(int j = 0; j < T.length(); j++) {
				if(S.charAt(i + j) != '?' && S.charAt(i + j) != T.charAt(j)) CANMAKE = false;
			}
			if(CANMAKE) {
				String str = "";
				for(int k = 0; k < S.length(); k++) {
					if(i <= k && k <= i + T.length() - 1) {
						str += T.charAt(k - i);
					}else {
						str += (S.charAt(k) == '?') ? "a" : S.charAt(k);
					}
				}
				ans.add(str);
			}
		}
		if(ans.isEmpty() || (S.length() < T.length())) System.out.println("UNRESTORABLE");
		else System.out.println(ans.pollFirst());
	}
}
