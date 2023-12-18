import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String T = sc.next();
		
		StringBuffer sb = new StringBuffer(S1);
		String S2 = sb.reverse().toString();
		StringBuffer T1 = new StringBuffer(T);
		String T2 = T1.reverse().toString();
		
		int check = 0;
		String S = "";
		
		loop:
		for(int i = 0; i < S2.length(); i++) {
			S = S2.substring(0, i);
			if(S2.length() - i >= T2.length()) {
				for(int j = i; j < i + T2.length(); j++) {
					if(S2.charAt(j) == T2.charAt(j - i) || S2.charAt(j) == '?') {
						S += T2.substring(j - i, j - i + 1);
						if(j == i + T2.length() - 1) {
							S += S2.substring(T.length(), S2.length());
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
			StringBuffer S3 = new StringBuffer(S);
			String S4 = S3.reverse().toString();
			System.out.println(S4);
		}
		
	}
}
