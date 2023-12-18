import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();

        if (canDream(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean canDream(String s) {
        if (s.length() < 5) {
            return false;
        }
        if (s.equals("dream") || s.equals("erase") || s.equals("dreamer") || s.equals("eraser")) {
            return true;
        }
        String five = s.substring(0, 5);
        String six = s.substring(0, 6);
        String seven = s.substring(0, 7);
        if (six.equals("eraser")) {
            return canDream(s.substring(6)) || canDream(s.substring(5));
        }
        if (seven.equals("dreamer")) {
            return canDream(s.substring(7)) || canDream(s.substring(5));
        }
        if (five.equals("dream") || five.equals("erase")) {
            return canDream(s.substring(5));
        }
        return false;
    }
}