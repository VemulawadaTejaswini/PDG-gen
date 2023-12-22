
import java.util.*;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int k = nextInt();
        String s = scanner.next();
        if (s.length() > k) {
            System.out.println(s.substring(0,k) + "...");
        } else {
            System.out.println(s);
        }
    }

    public static boolean rikai(List<Integer> rikaido,int x) {

        System.out.println("c" + rikaido);

        boolean ret = true;
        for (Integer r :rikaido){
            if (r < x) {
                ret = false;
                break;
            }
        }
        return ret;
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