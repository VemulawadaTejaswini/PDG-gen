
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong();
	    sc.close();

	    String S = Long.toString(N);
	    
	    
	    if (N<19)
	    	System.out.println(9);
	    
	    
	    else {
	    	boolean check = false;
	    	boolean check_9=false;
	    	
	    	if (S.charAt(0)=='1'){
	    		check=true;
	    	}
	    	if (S.charAt(S.length()-1)=='9'){
	    		check_9=true;
	    	}
	    
	    	int nine = 9*(S.length()-1);
	    
	    	if (check==false && check_9==false) {
	    		System.out.println(nine+Character.getNumericValue(S.charAt(0))-1);
	    	}
	    	else if (check_9==true)
	    		System.out.println(nine+Character.getNumericValue(S.charAt(0)));
	    	else
	    		System.out.println(nine);
	    }
	}

}
