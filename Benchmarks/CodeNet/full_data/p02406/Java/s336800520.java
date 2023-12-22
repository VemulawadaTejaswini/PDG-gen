import java.util.*;
import java.lang.*;

/**
 * StructuredProgramming
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        boolean flg = false;

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || Integer.toString(i).indexOf("3") != -1) {
                System.out.print(" ");
                System.out.print(i);
                flg = true;
            }
        }

        System.out.println("");
    }
}
