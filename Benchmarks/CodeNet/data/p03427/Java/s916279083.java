
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong();
	    sc.close();

	    String S = Long.toString(N);
	    
	    
	    if (N<19)
	    	System.out.println(Math.min(N, 9));
	    
	    
	    else {
	    	boolean check_1= false;
	    	boolean check_9=false;
	    	
	    	if (S.charAt(0)=='1'){
	    		check_1=true;
	    	}
	    	if (S.charAt(S.length()-1)=='9'){
	    		check_9=true;
	    	}
	    
	    	int nine = 9*(S.length()-1);
	    	int temp = 0;
	    	for (int i=0; i<S.length(); i++){
	    		temp+=Character.getNumericValue(S.charAt(i));
	    	}
	    
	    	if (check_1==false && check_9==false) {
	    		System.out.println(nine+Character.getNumericValue(S.charAt(0))-1);
	    	}
	    	else if (check_9==true)
	    		System.out.println(Math.max(temp,nine+Character.getNumericValue(S.charAt(0))));
	    	else
	    		System.out.println(nine);
	    }
	}

}
