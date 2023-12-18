import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String S = sc.next();


        while (S.length() > 0) {
            if (S.length() < 5) {
                System.out.println("NO");
                return;
            }

            if ("dream".equals(S.substring(0, 5))) {
                S = S.substring(5);
            } else if ("dreamer".equals(S.substring(0, 6))) {
                S = S.substring(6);
            } else if ("eraser".equals(S.substring(0, 6))) {
                S = S.substring(6);
            } else if ("erase".equals(S.substring(0, 5))) {
                S = S.substring(5);
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
