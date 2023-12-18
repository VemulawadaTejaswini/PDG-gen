import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        System.out.printf("%s%d%s", s.charAt(0), s.length() - 2, s.charAt(s.length() - 1));
    }
}