import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		for(int i = 0; i < S.length()-T.length()+1; i++) {
			boolean ok = true;
			for(int j = i; j < i+T.length(); j++) {
				if(S.charAt(j) != T.charAt(j-i) && S.charAt(j) != '?'){
					ok = false;
					break;
				}
			}
			if(ok) {
				S = S.substring(0, i) + T + S.substring(i+T.length()); 
				S = S.replace('?', 'a');
				System.out.println(S);
				return;
			}
		}
		System.out.println("UNRESTORABLE");

	}

}