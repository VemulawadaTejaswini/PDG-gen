import java.util.*;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args){
      try{
          Scanner sc = new Scanner(System.in);
   
	      long a = sc.nextLong();
	      long b = sc.nextLong();
	      long k;
      
	      if(a == b){
 	  	     System.out.println("IMPOSSIBLE");
          }else if(a < 0){
            System.out.println("IMPOSSIBLE");
          }else if (b >  Math.pow(10, 9)){
            System.out.println("IMPOSSIBLE");
	      }else{
	        k=(b+a)/2;
			System.out.println(k);
	      } 
      }catch(InputMismatchException e){
        System.out.println("IMPOSSIBLE");
      }catch(Exception e){
        System.out.println("IMPOSSIBLE");
      }
	}
}
