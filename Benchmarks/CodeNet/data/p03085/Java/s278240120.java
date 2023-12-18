import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            String b = sc.next();

            String ans;
            if(b.equals("A")) ans = "T";
            else if(b.equals("T")) ans = "A";
            else if(b.equals("C")) ans = "G";
            else ans = "C";


            System.out.println(ans);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}