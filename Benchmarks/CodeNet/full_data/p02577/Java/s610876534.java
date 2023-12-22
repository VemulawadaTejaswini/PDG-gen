import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        long sum = 0;

        for (int i = 0; i<s.length(); i++) {
            int a = Character.getNumericValue(s.charAt(i));
            sum += a;
        }

        if (sum % 9 == 0) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}