import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scan = new Scanner(System.in);
        
        String before = scan.nextLine();
        
        String after = before.replace( before.substring(3 , 4) , "8");
        
        System.out.println(after);
    }
    
}