import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String S = sc.next();

        while (S.length() > 0) {
            if (Arrays.asList("dreamer", "eraser").contains(S.substring(0, Math.min(S.length(), 6)))) {
                S = S.substring(6);
                continue;
            }
            if (Arrays.asList("dream", "erase").contains(S.substring(0, Math.min(S.length(), 5)))) {
                S = S.substring(5);
                continue;
            }
            System.out.println("NO");
            return;
        }
        
        System.out.println("YES");
    }
}
