import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {		
		
		/*input*/
		String str = cin.next();
		
		
		/*start
		 * search law*/
		
		int n = str.length();
		boolean twoHeadEqual  = str.charAt(0) == str.charAt(n-1);
		
		if (twoHeadEqual) {
			
			if (n % 2 == 0) {
				System.out.println("First");
			} else {
				System.out.println("Second");
			}
		} else {
			if (n % 2 == 0) {
				System.out.println("Second");
			} else {
				System.out.println("First");
			}
		}
		
		/*finish*/
		
	}
}

