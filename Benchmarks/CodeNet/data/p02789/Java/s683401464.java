import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        String M = scan.next();
        
        if( N == M ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");    
        }
        
    }
}
