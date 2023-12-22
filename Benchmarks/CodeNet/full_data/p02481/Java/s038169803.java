
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception{
    
        Scanner in = new Scanner(System.in);
        String a = in.nextInt();
        String b = in.nextInt();
        
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        
        System.out.println(x*y + " " + (2*x+2*y));
    }
    
}