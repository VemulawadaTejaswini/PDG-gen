import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {		
		
		/*input*/
		
		int n = cin.nextInt();
		
		/*start*/
		
		long res = (1 + n) * n / 2;
		
		/*finish*/
		System.out.println(res);
	}
}

