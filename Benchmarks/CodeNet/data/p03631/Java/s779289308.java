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
        String n = sc.next();
        if(n.charAt(0)==n.charAt(2)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
    
        }
    }
    
}
