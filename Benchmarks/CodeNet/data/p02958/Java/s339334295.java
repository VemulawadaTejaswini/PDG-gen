
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
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1;i < n+1;i++){
            if(i != sc.nextInt())count++;
        }
        if(count<3){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
    
}
