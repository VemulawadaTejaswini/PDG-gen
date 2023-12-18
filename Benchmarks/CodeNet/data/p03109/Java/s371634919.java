import java.util.*;
import java.text.*;

public class ABC119A {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();
            Date date1 = DateFormat.getDateInstance().parse(S);
            if (S.compareTo("2019/04/30") > 0) {
                System.out.println("TBD");
            } else {
                System.out.println("Heisei");
            }
        }
        catch (ParseException e) {
            System.out.println(e);
        }
    }
}
