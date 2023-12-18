import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String S = sc.next();
		int black = 0, white = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'B') black++;
			else white++;
		}
		black = white;
		int ans = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'B') {
				ans += black - i;
				black++;
			}
		}
		System.out.println(ans);
	}
}