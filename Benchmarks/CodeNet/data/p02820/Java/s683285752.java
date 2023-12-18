import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int r = sc.nextInt();
			int s = sc.nextInt();
			int p = sc.nextInt();
			
			
			String t = sc.next();
			
			char[] hands = new char[n];
			
			char[] mhands = t.toCharArray();
			
			int score = 0;
			
			for(int i = 0 ; i < n ; i++ ) {
				
				if ( i < k) {
					score += calcScore(mhands[i], r, s, p);
				}
				else {
					if ( mhands[i] != mhands[i-k] ) {
						score += calcScore(mhands[i], r, s, p);
					}
					else {
						mhands[i] = 'x'; //blank?
					}
				}
				
			}
			
			System.out.println(score);
		}
	}
	
	public static int calcScore(char h, int r, int s, int p) {
		if ( h == 'r') {
			return p;
		}
		else if ( h == 's') {
			return r;
		}
		else if ( h == 'p') {
			return s;
		}
		return 0;
	}
}