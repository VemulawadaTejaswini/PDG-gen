import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();

            boolean is = true;
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (i % 2 == 0) {
                    if (!(c == 'R' || c == 'U' || c == 'D')) {
                        is = false;
                    }
                } else {
                    if (!(c == 'L' || c == 'U' || c == 'D')) {
                        is = false;
                    }
                }
            }

            System.out.println(is ? "Yes" : "No");
        }
    }
}
