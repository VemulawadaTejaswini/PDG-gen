import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        long sum = 0;

        for (int i: s.toCharArray()) {
            int a = s.toCharArray()[i];
            sum += a;
        }

        if (sum % 9 == 0) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}