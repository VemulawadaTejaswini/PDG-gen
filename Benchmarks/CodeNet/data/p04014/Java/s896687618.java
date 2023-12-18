import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan;

    private static void start() {
        scan = new Scanner(java.lang.System.in);

    }

    private static void finish() {
    }


    public static void main(String[] args) {
        start();

        int n = scan.nextInt();
        int s = scan.nextInt();

        int base = 2;
        while (convertToBase(base, n) != s) {
            base++;
        }
//        convertToBase(8, 181234);
        System.out.println(base);
        finish();
    }

    private static int convertToBase(int base, int value) {
        int total = 0;
//        List<Integer> result = new ArrayList<>();
        int currBase = 1;
        while (currBase * base < value) {
            currBase *= base;
        }
        while (currBase != 0) {
//            result.add(value / currBase);
            total += value / currBase;
            value %= currBase;
            currBase /= base;
        }
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i));
//        }

        return total;
    }
}