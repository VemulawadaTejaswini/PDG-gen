import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        if (S.equals(T.substring(0,S.length()))) {
            String ID = T.substring(S.length());
            if (ID.length() != 1) {
                System.out.println("No");
                System.exit(0);
            }
            System.out.println("Yes");
         } else {
            System.out.println("No");
        }
    }
}
