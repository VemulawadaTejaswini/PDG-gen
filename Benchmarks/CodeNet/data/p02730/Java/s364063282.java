import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S = keyboard.next();
		int L = (S.length()-1)/2;
		char[]s1 = new char[L];
		char[]s2 = new char[L];
		
		
		for(int i=0; i<S.length(); i++) {
			if(i < L) {
				s1[i] = S.charAt(i);
			}else if(i > L) {
				s2[i-L-1] = S.charAt(i);
			}
		}
		
		String ans = "No";
		
		for(int j=0; j<=L/2; j++) {
			if(s1[j]==s2[j]&& s1[L-1-j]==s2[L-1-j] && s1[j] == s1[L-1-j] && s2[j] == s2[L-1-j]) {
				ans = "Yes";
			}else {
				ans = "No";
				break;
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}

