
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        scan.close();
        String[] b = a.split("");
        for (String s : b) {
            if (s.equals("7")) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }

}
