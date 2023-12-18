import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int length;

        while ((length = s.length())> 0) {
            if (s.endsWith("dream") || s.endsWith("erase")) {
                s = s.substring(0, length - 5).intern();
                continue;
            }
            if (s.endsWith("eraser")) {
                s = s.substring(0, length - 6);
                continue;
            }
            if (s.endsWith("dreamer")) {
                s = s.substring(0, length - 7);
                continue;
            }
            System.out.println("NO");
            System.exit(0);
        }
        if (s.length() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}