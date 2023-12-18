import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			String S = scan.next();
			char[] c = new char[S.length()];
			c = S.toCharArray();
			int count = 0;
			int c0 = 0;
			int c1 = 0;
			
			for(int i = 0;i<S.length();i++) {
				if(c[i]=='0')c0++;
				if(c[i]=='1')c1++;
			}
			
			
			System.out.println(2*Math.min(c0, c1));
			
			
		}	
	}
}
