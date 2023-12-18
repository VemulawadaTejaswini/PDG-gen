import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (prev == c) {
                System.out.println("Bad");
                return;
            }
            prev = c;
        }
        System.out.println("Good");
    }
}
