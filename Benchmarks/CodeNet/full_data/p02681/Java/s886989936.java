import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        if (T.length() - S.length() != 1) {
            System.out.println("No");
        } else {
            boolean flag = false;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) != T.charAt(i)) {
                    flag = true;
                    System.out.println("No");
                    break;
                }
            }
            if (!flag) {
                System.out.println("Yes");
            }
        }
    }
}