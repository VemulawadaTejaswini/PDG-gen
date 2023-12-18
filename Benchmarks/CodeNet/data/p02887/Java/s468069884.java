
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
        String txt = sc.next();
        String arytxt[] = txt.split("");
        int count = 1; 
        for(int i = 0;i<arytxt.length-1;i++){
            if(!arytxt[i].equals(arytxt[i+1]))count++;
        }
        System.out.print(count);
    }
    
}
