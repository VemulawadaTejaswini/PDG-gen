import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int red = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('0' == s.charAt(i))
                red++;
        }

        System.out.println(2 * Math.min(s.length() - red, red));

    }
}
