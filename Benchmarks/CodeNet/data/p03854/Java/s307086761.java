import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scanner.nextLine().trim());
        int length;

        while ((length = s.length())> 0) {
            String t = s.toString();
            if (t.endsWith("dream") || t.endsWith("erase")) {
                s.delete(length - 5, length);
                continue;
            }
            if (t.endsWith("eraser")) {
                s.delete(length - 6, length);
                continue;
            }
            if (t.endsWith("dreamer")) {
                s.delete(length - 7, length);
                continue;
            }
            System.out.println("NO");
            System.exit(0);
        }
        System.out.println("YES");
    }
}