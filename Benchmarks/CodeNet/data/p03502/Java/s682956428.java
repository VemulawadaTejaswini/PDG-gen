import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			
			
			
			System.out.println(N%hashould(N)==0?"YES":"NO");
			
			
			
		}
		
	}
	
	
	
	public static  int hashould(int x) {
		String S = String.valueOf(x);
		
		int goukei =0;
		
		for(int i = 0;i<S.length();i++) {
			goukei+=Integer.valueOf(S.substring(i, i+1));
		}
		
		
		return goukei;
	}

}
