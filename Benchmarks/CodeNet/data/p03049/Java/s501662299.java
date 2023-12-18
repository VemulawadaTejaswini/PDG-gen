import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		char[][] s = new char[N][];
		for(int i=0; i<N; i++)
			s[i] = sc.next().toCharArray();
		
		int ab = 0;
		int headB = 0;
		int tailA = 0;
		int headBtailA = 0;
		
		for(int i=0; i<N; i++) {
			if(s[i][0]=='B') {
				if(s[i][s[i].length-1]=='A')
					headBtailA++;
				else
					headB++;
			} else if(s[i][s[i].length-1]=='A') {
				tailA++;
			}
			
			for(int j=0; j<s[i].length-1; j++) {
				if(s[i][j]=='A' && s[i][j+1]=='B') {
					ab++;
					j++;
				}
			}
		}
		
		if(headBtailA>=1) {
			ab += headBtailA-1;
			if(tailA>=1) {
				tailA--;
				ab++;
			}
			if(headB>=1) {
				headB--;
				ab++;
			}
		}
		ab += Math.min(headB, tailA);
		System.out.println(ab);
		
		sc.close();
	}
}
