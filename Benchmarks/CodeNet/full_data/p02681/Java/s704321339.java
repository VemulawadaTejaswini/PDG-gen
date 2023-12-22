
import java.util.*;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String a = scanner.next();
        String b =scanner.next();
        if (a.equals(b.substring(b.length()-1))) {
            printYes();
        } else {
            printNo();
        }
    }

    public static int nextInt() {
        return Integer.parseInt(scanner.next());
    }

    public static long nextLong() {
        return Long.parseLong(scanner.next());
    }

    public static double nextDouble() {
        return Double.parseDouble(scanner.next());
    }

    public static short nextShort() {
        return Short.parseShort(scanner.next());
    }

    public static float nextFloat() {
        return Float.parseFloat(scanner.next());
    }

    public static void printYes() {
        System.out.println("Yes");
    }

    public static void printYES() {
        System.out.println("YES");
    }

    public static void printNo() {
        System.out.println("No");
    }

    public static void printNO() {
        System.out.println("NO");
    }

    public static void nextLine() {
        scanner.nextLine();
    }
}