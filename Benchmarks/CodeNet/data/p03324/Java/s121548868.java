import java.util.*;

/**
 * 2018.06.16 
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int D = scanner.nextInt();
	    int N = scanner.nextInt();
	    
	    int kazu = 0;
	    
	    if(D == 0){
	    	System.out.println(N);
	    }else if(D == 1){
	    	System.out.println(N * 100);	    	
	    }else if(D == 2){
	    	System.out.println(N * 100 * 100);	    	
	    }
	}

}