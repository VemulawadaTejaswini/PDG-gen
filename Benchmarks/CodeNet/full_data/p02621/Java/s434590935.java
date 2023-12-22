import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            double a = Double.parseDouble(sc.next());
            System.out.println((long)(a + Math.pow(a, 2) + Math.pow(a, 3)));

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}