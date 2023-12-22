import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.nextLine();
		String T = stdIn.nextLine();
		
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		
		int minCount = 1000;
		
		for(int i = 0; i <= s.length - t.length; i ++) {
			int counter = 0;
			for(int j = 0; j < t.length; j ++) {
				if(s[i + j] != t[j]) {
					counter ++;
				}
				if(minCount <= counter) {
					break;
				}
			}
			minCount = Math.min(minCount, counter);
		}
		
		System.out.println(minCount);
	}
}