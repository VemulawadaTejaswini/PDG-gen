import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        //int b = scan.nextInt();
        
        double sum = (a + b) / 2 + 1;
        
        System.out.println((int)sum);
    }
}