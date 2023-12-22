import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
         
        long A = sc.nextLong();
      
      	double B = sc.nextDouble();
      		
      	BigDecimal bd_A = new BigDecimal(A);
      	BigDecimal bd_B = new BigDecimal(String.valueOf(B));
	
      	BigDecimal bd_C = bd_A.multiply(bd_B);
       
      	long l = bd_C.longValue();

      	System.out.println(l);
      

    }
}