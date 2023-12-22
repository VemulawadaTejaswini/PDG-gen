import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HilbertCodef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
         
        String A= sc.nextLine();
        
        if(A.charAt(1)=='B')
        {
            System.out.println("ARC");
        }
        else
        {
            System.out.println("ABC");
        }
               
        
    }
    
}
