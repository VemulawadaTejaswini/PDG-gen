import java.util.*;
public class Main {
	public static void main(String[] args){
		char black = '#';
		char white = '.';
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		char[] chars = s.toCharArray();
		int ans = 0;
		
		for(int i = 0; i < chars.length - 1; i++) {
			if (chars[i] == black && chars[i+1] == white) {
				
				ans++;
				chars[i] = white;
			}
		}
		
		
		String reString = "" + ans;
		System.out.println(reString);
	}
}