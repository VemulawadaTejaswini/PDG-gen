import java.util.Scanner;

/**
 *
 * @author Dranzers
 */
public class Pangkat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0, b = 3, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        c = (int) Math.pow(a, b);
        System.out.println(c);
    }
}