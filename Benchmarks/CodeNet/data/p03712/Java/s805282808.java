
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[] s = new String[103];

        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }


        for (int i = 0; i < n + 2; i++) {
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("#" + s[i] +"#");
        }
        for (int i = 0; i < n + 2; i++) {
            System.out.print("#");
        }
        System.out.println();





    } // mainMethod


} // MainClass

