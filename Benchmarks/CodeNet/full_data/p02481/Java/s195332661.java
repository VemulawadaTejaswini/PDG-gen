
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception{
    
        Scanner in = new Scanner(System.in);
        String a = in.nextInt();
        String b = in.nextInt();
        
        System.out.println(a*b + " " + (2*a+2*b));
    }
    
}