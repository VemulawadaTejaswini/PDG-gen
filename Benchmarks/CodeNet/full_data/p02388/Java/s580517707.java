import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		


		    while(true){

		      Scanner scanner = new Scanner(System.in);
		      int x = scanner.nextInt();
		      
		      if ( (x>=1)&&(x<=100) ) {
		        double result = Math.pow(x,3);
		        System.out.println(Math.round(result));
		      } 

		    }

		  
		
		

	}

}