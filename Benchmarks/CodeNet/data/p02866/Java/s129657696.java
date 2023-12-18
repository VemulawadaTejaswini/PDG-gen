import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] integers = new int[n];
        for (int idx = 0; idx < n; idx++) {
            int value = scanner.nextInt();
//            if (value == 0) {
//                integers[0]++;
//                continue;
//            }
//            if (integers[value] == 0) {
//                integers[value] = value;
//            } else {
//                integers[value] *= value;
//            }
            integers[value]++;
        }
        if (integers[0] != 1) {
            System.out.println(0);
            return;
        }
        int result = 1;
        boolean firstNum = false;
        for (int idx = n - 1; idx > 0; idx--) {
            if (integers[idx] != 0 && !firstNum) { firstNum = true; }
            if (firstNum) result *= Math.pow(idx, integers[idx]);
        }
        System.out.println(result);
    }
}
