import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        int w = scanner.nextInt();
        for (int i = 0; i < s.length(); i += w) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}