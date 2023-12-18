import java.util.Scanner;

public class B {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int k  = scan.nextInt();
		int x = scan.nextInt();
		
		
		for(int i = x-k+1; i < x+k; i++) {
			System.out.print(i);
			if(i < x+k) {
				System.out.print(" ");
			}
		}
		
	}

}
