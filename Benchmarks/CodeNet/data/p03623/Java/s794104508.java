
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt() -x;
        int b = sc.nextInt() -x;
        if(a < 0)a *= -1;
        if(b < 0)b *=-1;
        if(a > b){
            System.out.print("B");
        } else {
            System.out.print("A");
        }
    }
    
}
