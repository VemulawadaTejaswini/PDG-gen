
import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println(a / b +" "+ a % b +" "+ (double)a / (double)b);
        
    }

}
