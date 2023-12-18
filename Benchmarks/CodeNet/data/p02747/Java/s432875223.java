import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        if (!(a.length() % 2 == 0)) {
            System.out.println("No");
            return;
        }

        for (int i = 0; i < a.length(); i++) {
            if (i % 2 == 0) {
                if (!(a.charAt(i) == 'h')) {
                    System.out.println("No");
                    return;
                }
            } else {
                if (!(a.charAt(i) == 'i')) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");

    }

}