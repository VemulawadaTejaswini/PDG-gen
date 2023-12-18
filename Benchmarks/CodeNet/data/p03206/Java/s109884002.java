import java.util.*;
import java.lang.*;

public class ABC115_A_ChristmasEveEveEve {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        scan.close();

        System.out.print("Christmas ");
        int t = 25 - Integer.parseInt(S);
        for (int i = 0; i < t; i++) {
            System.out.print("Eve ");
        }
    }
}