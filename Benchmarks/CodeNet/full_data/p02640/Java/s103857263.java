import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int X = scan.nextInt();
			int Y = scan.nextInt();
			
			
			for(int i = 0;i<=X;i++) {
				int turu = i;
				int kame = X-i;
				if(2*turu+4*kame==Y) {
					System.out.print("Yes");
					System.exit(0);
				}
				
			}
			
			
			System.out.print("No");
			
			
		}
		
		
	}
		

}
