import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder(sc.next());

        String ans = "YES";

        while (s.length() > 0) {
            boolean isOK = false;

            if (s.toString().endsWith("dreamer")) {
               s.setLength(s.length() - 7);
               isOK = true;
            }
            else if (s.toString().endsWith("dream")) {
                s.setLength(s.length() - 5);
                isOK = true;
            }
            else if (s.toString().endsWith("eraser")) {
                s.setLength(s.length() - 6);
                isOK = true;
            }
            else if (s.toString().endsWith("erase")) {
                s.setLength(s.length() - 5);
                isOK = true;
            }

            if (!isOK) {
                ans = "No";
                break;
            }
        }

        System.out.println(ans);
    }
}