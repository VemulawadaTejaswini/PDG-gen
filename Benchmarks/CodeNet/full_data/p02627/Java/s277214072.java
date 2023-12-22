import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.next();

            String str2 = str.toUpperCase();

            if(str.equals(str2)) System.out.println("A");
            else System.out.println("a");

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}