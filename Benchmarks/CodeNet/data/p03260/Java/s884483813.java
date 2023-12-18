import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    
	    for (int i = 1; i <= 3; i++) {
	    	if ((A * B * i) % 2 == 1) {
	    		System.out.println("Yes");
	    		return;
	    	}
	    }
	    
	    System.out.println("No");
	}    
}	