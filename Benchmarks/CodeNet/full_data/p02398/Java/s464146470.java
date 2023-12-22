
import java.util.Scanner;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int count = 0;
        
        while((b-a) != 0){
            if((c%a) == 0){
                count++;
            }
            a++;
        }
        System.out.println(count);
    }
    
}

