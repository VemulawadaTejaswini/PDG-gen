import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String T = sc.next();
		
		int check = 0;
		String S = "";
		
		loop:
		for(int i = 0; i < S1.length(); i++) {
			S = S1.substring(0, i);
			if(S1.length() - i >= T.length()) {
				for(int j = i; j < i + T.length(); j++) {
					if(S1.charAt(j) == T.charAt(j - i) || S1.charAt(j) == '?') {
						S += T.substring(j - i, j - i + 1);
						if(j == i + T.length() - 1) {
							break loop;
						}
					} else {
						break;
					}
				}
			} else {
				check++;
				break;
			}
		}
		
		if(check == 1) {
			System.out.println("UNRESTORABLE");
		} else {
			S = S.replace("?", "a");
			System.out.println(S);
		}	
	}
}
