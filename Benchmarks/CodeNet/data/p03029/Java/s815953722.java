import java.util.Scanner;

/**
 *
 * @author masa
 */
public class Main {
    public static void main(String[] args) {
         String str = new Scanner(System.in).nextLine();
         int A = Integer.parseInt(str.split(" ")[0]);
         int P = Integer.parseInt(str.split(" ")[1]);
         System.out.println((A*3+P)/2);
    }    
}
