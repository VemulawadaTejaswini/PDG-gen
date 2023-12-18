import java.util.Scanner;

/**
 * Tap Dance
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();

            for (int i = 1; i <= S.length(); i++) {
                char c = S.charAt(i - 1);

                if (i % 2 == 1) {
                    if (c == 'R' || c == 'U' || c == 'D') {
                    } else {
                        System.out.println("No");
                        System.exit(0);
                    }
                } else {
                    if (c == 'L' || c == 'U' || c == 'D') {
                    } else {
                        System.out.println("No");
                        System.exit(0);
                    }
                }
            }

            System.out.println("Yes");
        }
    }

}
