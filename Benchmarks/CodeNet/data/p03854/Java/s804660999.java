import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int length;

        while ((length = s.length())> 0) {
            String last5 = s.substring(length - 5);
            if (last5.equals("dream") || last5.equals("erase")) {
                s = s.substring(0, length - 5);
                continue;
            }
            String last6 = s.substring(length - 6);
            if (last6.equals("eraser")) {
                s = s.substring(0, length - 6);
                continue;
            }
            String last7 = s.substring(length - 7);
            if (last7.equals("dreamer")) {
                s = s.substring(0, length - 7);
                continue;
            }
            break;
        }
        if (s.length() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}