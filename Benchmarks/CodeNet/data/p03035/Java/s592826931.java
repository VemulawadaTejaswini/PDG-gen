import java.util.Scanner;
public class Main {

	
	public static void main(String[]args) {
		
		Scanner tc = new Scanner(System.in);
		
		int x = tc.nextInt();
		int y = tc.nextInt();
		
		if(x <= 5)
			System.out.println("0");
		else if(x >= 6 && x <= 12) {
			y = (int)(y/2);
			System.out.println(y);
		}
		else 
			System.out.println(y);
			
	}
}
