import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int h  = stdIn.nextInt();
		int w = stdIn.nextInt();
		
		char[][]s = new char[h+2][w+2];
		
		for(int i = 1; i <= h; i++) {
			String ss = stdIn.next();
			
			for(int j = 1; j <=w; j++) {
				s[i][j] = ss.charAt(j-1);
			}
			
		}
		
		/*for(char[] a: s) {
			for(char b: a) {
				System.out.print(b);
			}
			System.out.println();
		}*/
		
		/*for(int i = 0; i < h+2; i++) {
			for(int j = 0; j < w+2; j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}*/
		
		
		
		boolean flag = false;
		
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <=w; j++) {
				
				if(s[i][j]=='#' && s[i][j-1] == '.' && s[i][j+1] == '.' && s[i-1][j] == '.' && s[i+1][j] == '.') {
					flag = true;
				}
				
				
			}
		}
		
		if(flag) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		
	}

}
