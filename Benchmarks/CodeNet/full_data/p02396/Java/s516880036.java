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
        int x = sc.nextInt();
        int i = 0;
        while (true) {
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
            System.out.println("Case " + (i++) + ": " + x);
        }
    }
}

