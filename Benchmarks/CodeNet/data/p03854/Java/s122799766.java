
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        // dream, dreamer, erase, eraser
//
//        while (true) {
//            if (S.endsWith("dreamer")) {
//                S = S.substring(0, S.length() - "dreamer".length());
//            } else if (S.endsWith("eraser")) {
//                S = S.substring(0, S.length() - "eraser".length());
//            } else if (S.endsWith("erase")) {
//                S = S.substring(0, S.length() - "erase".length());
//            } else if (S.endsWith("dream")) {
//                S = S.substring(0, S.length() - "dream".length());
//            } else {
//                break;
//            }
//        }
        S = S.replaceAll("dreamer", "");
        S = S.replaceAll("eraser", "");
        S = S.replaceAll("erase", "");
        S = S.replaceAll("dream", "");

        if (S.length() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}