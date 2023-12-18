import java.util.*;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args){
      try{
		Scanner sc = new Scanner(System.in);
      	
//      int a = Integer.parseInt(args[0]);
//      int a = Integer.parseInt(args[1]);

      
	      long a = sc.nextLong();
	      long b = sc.nextLong();
	      long k;
      
	      if(a == b){
 	  	     System.out.println("IMPOSSIBLE");
          }else if(a < 0){
            System.out.println("IMPOSSIBLE");
          }else if (b > Math.pow(10, 9)){
            System.out.println("IMPOSSIBLE");
	      }else{
	        k=(b+a)/2;
			System.out.println(k);
	      } 
      }catch(InputMismatchException e){
        System.out.println("IMPOSSIBLE");
      }
	}
}
