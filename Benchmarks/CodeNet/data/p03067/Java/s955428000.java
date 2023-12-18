import java.util.*;
public class Main {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		
		char black = '#';
		char white = '.';
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		char[] inputChars = s.toCharArray();
		
		int noneedright = 0;
		for(int i = s.length() -1; i >= 0; i--) {
			if(inputChars[i] == black) {
				noneedright++;
			}
			if(inputChars[i] == white) {
				break;
			}
		}
		int noneedleft = 0;
		for(int i = 0; i < s.length(); i++) {
			if(inputChars[i] == white) {
				noneedleft++;
			}
			if(inputChars[i] == black) {
				break;
			}
		}
		
		char[] chars = Arrays.copyOfRange(inputChars, noneedleft, s.length() - noneedright);

		int ans = 0;
		
		int tempBlack = 0;
		int tempWhite = 0;
		for(int i = 0; i < chars.length; i++) {
			
			if(chars[i] == black) {
				tempBlack++;
			} else {
				tempWhite++;
			}
		}
		if(tempBlack > tempWhite) {
			ans = tempWhite;
		} else {
			ans = tempBlack;
		}
		
		String reString = "" + ans;
		System.out.println(reString);
	}
	
}
