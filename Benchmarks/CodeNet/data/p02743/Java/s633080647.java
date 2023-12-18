import java.util.*;
import java.math.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            if(Math.sqrt((double)sc.next) + Math.sqrt((double)sc.next) < Math.sqrt((double)sc.next)){
                System.out.println("Yes");
            } 
            else System.out.println("No");

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}