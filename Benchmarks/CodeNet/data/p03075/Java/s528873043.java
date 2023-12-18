
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
        int min = sc.nextInt();
        int max = 0;
        for (int i = 0; i < 4; i++) {
            max = sc.nextInt();
        }
        int k = sc.nextInt();
        if (k < max - min) {
            System.out.print(":(");
        } else {
            System.out.print("Yay!");
        }

    }

}
