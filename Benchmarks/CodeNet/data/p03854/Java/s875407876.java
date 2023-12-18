import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String ans = "YES";

        while (s.length() > 0) {
            boolean isOK = false;

            if (s.endsWith("dreamer")) {
               isOK = true;
               s = s.substring(0, s.length() - 7);
            }
            if (s.endsWith("dream")) {
                isOK = true;
                s = s.substring(0, s.length() - 5);
            }
            if (s.endsWith("eraser")) {
                s = s.substring(0, s.length() - 6);
                isOK = true;
            }
            if (s.endsWith("erase")) {
                s = s.substring(0, s.length() - 5);
                isOK = true;
            }

            if (!isOK) {
                ans = "NO";
                break;
            }
        }

        System.out.println(ans);
    }
}