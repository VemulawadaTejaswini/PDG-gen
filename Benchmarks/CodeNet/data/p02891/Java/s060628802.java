import java.util.*;

public class Main {
	
	static int change = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		String S = sc.nextLine();
		
		sb.append(S);
		
		int K = sc.nextInt();
		
		int len = sb.length();
		int ans = 0;
		
		if (len == 1) {
			System.out.println(K-1);
		}
		
		if (len == 2) {
			if (sb.charAt(0) == sb.charAt(1)) {
				System.out.println(K);
			} else {
				System.out.println(0);
			}
		}
		
		if (len > 2) {
			for (int i = 1 ; i < len-1 ; i++) {
				if (sb.charAt(i) == sb.charAt(i-1) || sb.charAt(i) == sb.charAt(i+1)) {
					ans++;
					sb.setCharAt(i+1, getChar());
					continue;
				}
			}
			
			System.out.println(ans);
		}
	}
	
	static char getChar() {
		
		if (change == 0) {
			change++;
			return '+';
		} else {
			change--;
			return '-';
		}
	}
	

}
