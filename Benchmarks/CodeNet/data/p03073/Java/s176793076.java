import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] col = new char[S.length()];
		
		for(int i = 0; i < S.length(); i++) {
			col[i] = S.charAt(i);
		}
			
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 1; i < S.length(); i++) {
			if(col[i] == col[i - 1] && col[i] == '0') {
				col[i] = '1';
				count1++;
			} else if(col[i] == col[i - 1] && col[i] == '1') {
				col[i] = '0';
				count1++;
			} 
		}
		
		for(int i = 1; i < S.length(); i++) {
			if(col[i] == col[i - 1] && col[i] == '0') {
				col[i - 1] = '1';
				count2++;
			} else if(col[i] == col[i - 1] && col[i] == '1') {
				col[i - 1] = '0';
				count2++;
			} 
		}
	
		System.out.println(Math.max(count1, count2));
		
	}
}
