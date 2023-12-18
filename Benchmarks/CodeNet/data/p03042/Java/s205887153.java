import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int upper2digit = x / 100;
        int lower2digit = x % 100;

        if (isMonth(upper2digit) && isMonth(lower2digit)) {
            System.out.println("AMBIGUOUS");
            return;
        }

        if (isMonth(upper2digit)) {
            System.out.println("MMYY");
            return;
        }

        if (isMonth(lower2digit)) {
            System.out.println("YYMM");
            return;
        }

        System.out.println("NA");
    }

    public static boolean isMonth(int x) {
        return 0 < x && x < 13;
    }
}
