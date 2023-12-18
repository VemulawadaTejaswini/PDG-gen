import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = s.length();

        if(check(s) && check(s.substring(0, (m-1)/2)) && check(s.substring((m+3)/2-1, m))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean check(String s) {
        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring((s.length()/2)+1);
        return s1.equals(s2);
    }
}
