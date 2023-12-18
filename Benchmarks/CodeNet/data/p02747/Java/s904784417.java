import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hi = scanner.next();
        Matcher m = Pattern.compile("[\\s\\S]{1,2}").matcher(hi);
        boolean a = true;
        while (m.find()) {
            if (!m.group().equals("hi")) {
                a = false;
                break;
            }
        }
        if (a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}