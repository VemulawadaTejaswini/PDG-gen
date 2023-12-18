import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            if(Math.sqrt(a * 1.0) + Math.sqrt(b * 1.0) < Math.sqrt(c * 1.0)){
                System.out.println("Yes");
            } 
            else System.out.println("No");

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}