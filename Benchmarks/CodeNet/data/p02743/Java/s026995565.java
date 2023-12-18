import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            BigDecimal a = new BigDecimal(sc.next());
            BigDecimal b = new BigDecimal(sc.next());
            BigDecimal c = new BigDecimal(sc.next());

            if((a.multiply(b)).compareTo(c) == -1) System.out.println("Yes");
            else System.out.println("No");

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}