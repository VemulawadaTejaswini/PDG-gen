import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        String op = scn.next();
        int b = scn.nextInt();

        while (!(op.equals("?"))) {
            if (op.equals("+")) {
                System.out.println((a + b));
            } else if (op.equals("-")) {
                System.out.println((a - b));
            } else if (op.equals("*")) {
                System.out.println((a * b));
            } else {
                System.out.println((a / b));
            }
            a = scn.nextInt();
            op = scn.next();
            b = scn.nextInt();


        }

        scn.close();


    }
}
