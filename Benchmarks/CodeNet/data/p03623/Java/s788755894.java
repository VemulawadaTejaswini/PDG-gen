import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Test20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a,b,x;
        
        x=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        
        if(abs(x-a)<abs(x-b)){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
    }
    
}