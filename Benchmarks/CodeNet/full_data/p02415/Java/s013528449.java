import java.util.*;
import java.lang.*;

/**
 * TogglingCases
 */
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            char list[] = str.toCharArray();
            for (char ch : list) {
                if (ch >= 'a' && ch <= 'z') {
                    String newstr = new String(Character.toChars(ch + 'A' - 'a'));
                    System.out.print(newstr);
                } else if (ch >= 'A' && ch <= 'Z') {
                    String newstr = new String(Character.toChars(ch + 'a' - 'A'));
                    System.out.print(newstr);
                } else {
                    System.out.print(ch);
                }
            }
        }
        System.out.println();
    }
}
