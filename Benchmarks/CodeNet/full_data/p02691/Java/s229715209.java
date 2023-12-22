import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sin[] = new int[n];
		int good = 0;
		
		
		for(int i = 0; i < n; i++) {
			sin[i] = scan.nextInt();
 			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n; j++) {
				if(j - i == sin[j] + sin[i]) {
					good++;
					
				}
				
			}
			
		}
		
		System.out.println(good);
		
	}
		
		
		
}