
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class OneClue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        for(int i = k-1;i >= 0;i--){
            System.out.print(x-i + " ");
        }
        for(int i = 1;i < k;i++){
            System.out.print(x+i+" ");
        }
    }
    
}
