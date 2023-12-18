import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			int count = 0;
			
			if(S.substring(0, 1).equals("7")) count++;
			if(S.substring(1, 2).equals("7")) count++;
			if(S.substring(2, 3).equals("7")) count++;
			
			System.out.println(count>0?"Yes":"No");
			
			
		}
		
		
	}
		

}
