
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        scan.close();

        if (a.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }

    }
}
