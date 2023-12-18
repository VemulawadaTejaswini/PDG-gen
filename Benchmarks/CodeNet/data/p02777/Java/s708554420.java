
import java.util.Scanner;

public class RemmainingBalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	    String tmp = scanner.nextLine();
        String[] ST = tmp.split(" ");

	    tmp = scanner.nextLine();   
	    String[] ab = tmp.split(" ");
	    Integer a = Integer.parseInt(ab[0]);
	    Integer b = Integer.parseInt(ab[1]);

	    String U = scanner.nextLine();
	    
	    if(U.equals(ST[0])) {
	    	System.out.println(a-1+" "+b);
	    }
	    else if(U.equals(ST[1])) {
	    	System.out.println(a+" "+(b-1));
	    }
	    
	    
	    scanner.close();

		
	}

}
