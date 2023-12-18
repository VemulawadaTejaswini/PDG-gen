import java.util.*;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        long a = nextLong(),b = nextLong(),c = nextLong(),k= nextLong();
        long takeA = a - k;
        if (takeA >= 0) {
            System.out.println(k);
            return;
        }
        takeA *= -1;
        long takeB = b - takeA;
        if (takeB >= 0) {
            System.out.println(a);
            return;
        }
        takeB *= -1;
        long takeC = takeB;
        System.out.println(a - takeC);
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